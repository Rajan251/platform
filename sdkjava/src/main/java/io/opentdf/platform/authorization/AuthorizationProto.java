// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: authorization/authorization.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.authorization;

public final class AuthorizationProto {
  private AuthorizationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_Entity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_EntityCustom_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_EntityCustom_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_EntityChain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_EntityChain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_Action_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_DecisionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_DecisionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_DecisionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_DecisionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_GetDecisionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_GetDecisionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_GetDecisionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_GetDecisionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_GetEntitlementsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_GetEntitlementsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_Entitlements_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_Entitlements_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_ResourceAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_ResourceAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_GetEntitlementsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_GetEntitlementsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authorization_GetEntitlementsResponse_EntityEntitlementsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authorization_GetEntitlementsResponse_EntityEntitlementsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!authorization/authorization.proto\022\raut" +
      "horization\032\034google/api/annotations.proto" +
      "\032\031google/protobuf/any.proto\"\226\002\n\006Entity\022\016" +
      "\n\002id\030\001 \001(\tR\002id\022%\n\remail_address\030\002 \001(\tH\000R" +
      "\014emailAddress\022\035\n\tuser_name\030\003 \001(\tH\000R\010user" +
      "Name\022,\n\021remote_claims_url\030\004 \001(\tH\000R\017remot" +
      "eClaimsUrl\022\022\n\003jwt\030\005 \001(\tH\000R\003jwt\022.\n\006claims" +
      "\030\006 \001(\0132\024.google.protobuf.AnyH\000R\006claims\0225" +
      "\n\006custom\030\007 \001(\0132\033.authorization.EntityCus" +
      "tomH\000R\006customB\r\n\013entity_type\"B\n\014EntityCu" +
      "stom\0222\n\textension\030\001 \001(\0132\024.google.protobu" +
      "f.AnyR\textension\"P\n\013EntityChain\022\016\n\002id\030\001 " +
      "\001(\tR\002id\0221\n\010entities\030\002 \003(\0132\025.authorizatio" +
      "n.EntityR\010entities\"\335\001\n\006Action\022B\n\010standar" +
      "d\030\001 \001(\0162$.authorization.Action.StandardA" +
      "ctionH\000R\010standard\022\030\n\006custom\030\002 \001(\tH\000R\006cus" +
      "tom\"l\n\016StandardAction\022\037\n\033STANDARD_ACTION" +
      "_UNSPECIFIED\020\000\022\033\n\027STANDARD_ACTION_DECRYP" +
      "T\020\001\022\034\n\030STANDARD_ACTION_TRANSMIT\020\002B\007\n\005val" +
      "ue\"\326\001\n\017DecisionRequest\022/\n\007actions\030\001 \003(\0132" +
      "\025.authorization.ActionR\007actions\022?\n\rentit" +
      "y_chains\030\002 \003(\0132\032.authorization.EntityCha" +
      "inR\014entityChains\022Q\n\023resource_attributes\030" +
      "\003 \003(\0132 .authorization.ResourceAttributeR" +
      "\022resourceAttributes\"\325\002\n\020DecisionResponse" +
      "\022&\n\017entity_chain_id\030\001 \001(\tR\rentityChainId" +
      "\0224\n\026resource_attributes_id\030\002 \001(\tR\024resour" +
      "ceAttributesId\022-\n\006action\030\003 \001(\0132\025.authori" +
      "zation.ActionR\006action\022D\n\010decision\030\004 \001(\0162" +
      "(.authorization.DecisionResponse.Decisio" +
      "nR\010decision\022 \n\013obligations\030\005 \003(\tR\013obliga" +
      "tions\"L\n\010Decision\022\030\n\024DECISION_UNSPECIFIE" +
      "D\020\000\022\021\n\rDECISION_DENY\020\001\022\023\n\017DECISION_PERMI" +
      "T\020\002\"b\n\023GetDecisionsRequest\022K\n\021decision_r" +
      "equests\030\001 \003(\0132\036.authorization.DecisionRe" +
      "questR\020decisionRequests\"f\n\024GetDecisionsR" +
      "esponse\022N\n\022decision_responses\030\001 \003(\0132\037.au" +
      "thorization.DecisionResponseR\021decisionRe" +
      "sponses\"\222\001\n\026GetEntitlementsRequest\0221\n\010en" +
      "tities\030\001 \003(\0132\025.authorization.EntityR\010ent" +
      "ities\022;\n\005scope\030\002 \001(\0132 .authorization.Res" +
      "ourceAttributeH\000R\005scope\210\001\001B\010\n\006_scope\"5\n\014" +
      "Entitlements\022%\n\016attribute_fqns\030\002 \003(\tR\rat" +
      "tributeFqns\":\n\021ResourceAttribute\022%\n\016attr" +
      "ibute_fqns\030\002 \003(\tR\rattributeFqns\"\356\001\n\027GetE" +
      "ntitlementsResponse\022o\n\023entity_entitlemen" +
      "ts\030\001 \003(\0132>.authorization.GetEntitlements" +
      "Response.EntityEntitlementsEntryR\022entity" +
      "Entitlements\032b\n\027EntityEntitlementsEntry\022" +
      "\020\n\003key\030\001 \001(\tR\003key\0221\n\005value\030\002 \001(\0132\033.autho" +
      "rization.EntitlementsR\005value:\0028\0012\206\002\n\024Aut" +
      "horizationService\022r\n\014GetDecisions\022\".auth" +
      "orization.GetDecisionsRequest\032#.authoriz" +
      "ation.GetDecisionsResponse\"\031\202\323\344\223\002\023\"\021/v1/" +
      "authorization\022z\n\017GetEntitlements\022%.autho" +
      "rization.GetEntitlementsRequest\032&.author" +
      "ization.GetEntitlementsResponse\"\030\202\323\344\223\002\022\"" +
      "\020/v1/entitlementsB\302\001\n!io.opentdf.platfor" +
      "m.authorizationB\022AuthorizationProtoP\001Z5g" +
      "ithub.com/opentdf/platform/protocol/go/a" +
      "uthorization\242\002\003AXX\252\002\rAuthorization\312\002\rAut" +
      "horization\342\002\031Authorization\\GPBMetadata\352\002" +
      "\rAuthorizationb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_authorization_Entity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_authorization_Entity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_Entity_descriptor,
        new java.lang.String[] { "Id", "EmailAddress", "UserName", "RemoteClaimsUrl", "Jwt", "Claims", "Custom", "EntityType", });
    internal_static_authorization_EntityCustom_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_authorization_EntityCustom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_EntityCustom_descriptor,
        new java.lang.String[] { "Extension", });
    internal_static_authorization_EntityChain_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_authorization_EntityChain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_EntityChain_descriptor,
        new java.lang.String[] { "Id", "Entities", });
    internal_static_authorization_Action_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_authorization_Action_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_Action_descriptor,
        new java.lang.String[] { "Standard", "Custom", "Value", });
    internal_static_authorization_DecisionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_authorization_DecisionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_DecisionRequest_descriptor,
        new java.lang.String[] { "Actions", "EntityChains", "ResourceAttributes", });
    internal_static_authorization_DecisionResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_authorization_DecisionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_DecisionResponse_descriptor,
        new java.lang.String[] { "EntityChainId", "ResourceAttributesId", "Action", "Decision", "Obligations", });
    internal_static_authorization_GetDecisionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_authorization_GetDecisionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_GetDecisionsRequest_descriptor,
        new java.lang.String[] { "DecisionRequests", });
    internal_static_authorization_GetDecisionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_authorization_GetDecisionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_GetDecisionsResponse_descriptor,
        new java.lang.String[] { "DecisionResponses", });
    internal_static_authorization_GetEntitlementsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_authorization_GetEntitlementsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_GetEntitlementsRequest_descriptor,
        new java.lang.String[] { "Entities", "Scope", });
    internal_static_authorization_Entitlements_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_authorization_Entitlements_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_Entitlements_descriptor,
        new java.lang.String[] { "AttributeFqns", });
    internal_static_authorization_ResourceAttribute_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_authorization_ResourceAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_ResourceAttribute_descriptor,
        new java.lang.String[] { "AttributeFqns", });
    internal_static_authorization_GetEntitlementsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_authorization_GetEntitlementsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_GetEntitlementsResponse_descriptor,
        new java.lang.String[] { "EntityEntitlements", });
    internal_static_authorization_GetEntitlementsResponse_EntityEntitlementsEntry_descriptor =
      internal_static_authorization_GetEntitlementsResponse_descriptor.getNestedTypes().get(0);
    internal_static_authorization_GetEntitlementsResponse_EntityEntitlementsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authorization_GetEntitlementsResponse_EntityEntitlementsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
