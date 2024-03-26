package opentdf.entitlements

import rego.v1

# idp_config = {"config": {
# 	"url": input.idp.url,
# 	"realm": input.idp.realm,
# 	"clientid": input.idp.client,
# 	"clientsecret": input.idp.secret,
# 	"legacykeycloak": input.idp.legacy,
# }}

idp_request := {"entities": [{
	"id": input.entity.id,
	#	"emailAddress": input.entity.email_address,
	"clientId": input.entity.client_id,
}]}

attributes := [attribute |
	# external entity
	#	response := keycloak.resolve.entities(idp_request, idp_config)
	#	entity_representations := response.entityRepresentations
	#	some entity_representation in entity_representations
	#	some prop in entity_representation.additionalProps

	# JWT
	# This statement invokes the built-in function `io.jwt.decode` passing the
	# parsed bearer_token as a parameter. The `io.jwt.decode` function returns an
	# array: [header, payload, signature]
	[_, payload, _] := io.jwt.decode(input.entity.jwt)

	# mappings
	some subject_mapping in input.attribute_mappings[attribute].value.subject_mappings
	some subject_set in subject_mapping.subject_condition_set.subject_sets
	some condition_group in subject_set.condition_groups
	cgbool_evaluate(payload, condition_group.boolean_operator, condition_group.conditions)
]

# condition_group
cgbool_evaluate(payload, boolean_operator, conditions) if {
	# AND
	boolean_operator == 1
	some condition in conditions
	cbool_evaluate(payload[condition.subject_external_field], condition.operator, condition.subject_external_values)
} else if {
	# OR
	boolean_operator == 2
	payload[key]
	some condition in conditions
	cbool_evaluate(payload[condition.subject_external_field], condition.operator, condition.subject_external_values)
}

# condition
cbool_evaluate(property_values, operator, values) if {
	# IN
	operator == 1
	some property_value in property_values
	property_value in values
} else if {
	# NOT IN
	operator == 2
	some property_value in property_values
	not property_value in values
}
