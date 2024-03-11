// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.policy.attributes;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:policy.attributes.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * generated uuid in database
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * generated uuid in database
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.policy.attributes.Attribute attribute = 2 [json_name = "attribute"];</code>
   * @return Whether the attribute field is set.
   */
  boolean hasAttribute();
  /**
   * <code>.policy.attributes.Attribute attribute = 2 [json_name = "attribute"];</code>
   * @return The attribute.
   */
  io.opentdf.platform.policy.attributes.Attribute getAttribute();
  /**
   * <code>.policy.attributes.Attribute attribute = 2 [json_name = "attribute"];</code>
   */
  io.opentdf.platform.policy.attributes.AttributeOrBuilder getAttributeOrBuilder();

  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * list of attribute values that this value is related to (attribute group)
   * </pre>
   *
   * <code>repeated .policy.attributes.Value members = 4 [json_name = "members"];</code>
   */
  java.util.List<io.opentdf.platform.policy.attributes.Value> 
      getMembersList();
  /**
   * <pre>
   * list of attribute values that this value is related to (attribute group)
   * </pre>
   *
   * <code>repeated .policy.attributes.Value members = 4 [json_name = "members"];</code>
   */
  io.opentdf.platform.policy.attributes.Value getMembers(int index);
  /**
   * <pre>
   * list of attribute values that this value is related to (attribute group)
   * </pre>
   *
   * <code>repeated .policy.attributes.Value members = 4 [json_name = "members"];</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * list of attribute values that this value is related to (attribute group)
   * </pre>
   *
   * <code>repeated .policy.attributes.Value members = 4 [json_name = "members"];</code>
   */
  java.util.List<? extends io.opentdf.platform.policy.attributes.ValueOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * list of attribute values that this value is related to (attribute group)
   * </pre>
   *
   * <code>repeated .policy.attributes.Value members = 4 [json_name = "members"];</code>
   */
  io.opentdf.platform.policy.attributes.ValueOrBuilder getMembersOrBuilder(
      int index);

  /**
   * <pre>
   * list of key access servers
   * </pre>
   *
   * <code>repeated .kasregistry.KeyAccessServer grants = 5 [json_name = "grants"];</code>
   */
  java.util.List<io.opentdf.platform.kasregistry.KeyAccessServer> 
      getGrantsList();
  /**
   * <pre>
   * list of key access servers
   * </pre>
   *
   * <code>repeated .kasregistry.KeyAccessServer grants = 5 [json_name = "grants"];</code>
   */
  io.opentdf.platform.kasregistry.KeyAccessServer getGrants(int index);
  /**
   * <pre>
   * list of key access servers
   * </pre>
   *
   * <code>repeated .kasregistry.KeyAccessServer grants = 5 [json_name = "grants"];</code>
   */
  int getGrantsCount();
  /**
   * <pre>
   * list of key access servers
   * </pre>
   *
   * <code>repeated .kasregistry.KeyAccessServer grants = 5 [json_name = "grants"];</code>
   */
  java.util.List<? extends io.opentdf.platform.kasregistry.KeyAccessServerOrBuilder> 
      getGrantsOrBuilderList();
  /**
   * <pre>
   * list of key access servers
   * </pre>
   *
   * <code>repeated .kasregistry.KeyAccessServer grants = 5 [json_name = "grants"];</code>
   */
  io.opentdf.platform.kasregistry.KeyAccessServerOrBuilder getGrantsOrBuilder(
      int index);

  /**
   * <code>string fqn = 6 [json_name = "fqn"];</code>
   * @return The fqn.
   */
  java.lang.String getFqn();
  /**
   * <code>string fqn = 6 [json_name = "fqn"];</code>
   * @return The bytes for fqn.
   */
  com.google.protobuf.ByteString
      getFqnBytes();

  /**
   * <pre>
   * active by default until explicitly deactivated
   * </pre>
   *
   * <code>.google.protobuf.BoolValue active = 7 [json_name = "active"];</code>
   * @return Whether the active field is set.
   */
  boolean hasActive();
  /**
   * <pre>
   * active by default until explicitly deactivated
   * </pre>
   *
   * <code>.google.protobuf.BoolValue active = 7 [json_name = "active"];</code>
   * @return The active.
   */
  com.google.protobuf.BoolValue getActive();
  /**
   * <pre>
   * active by default until explicitly deactivated
   * </pre>
   *
   * <code>.google.protobuf.BoolValue active = 7 [json_name = "active"];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getActiveOrBuilder();

  /**
   * <pre>
   * Common metadata
   * </pre>
   *
   * <code>.common.Metadata metadata = 100 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Common metadata
   * </pre>
   *
   * <code>.common.Metadata metadata = 100 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  io.opentdf.platform.common.Metadata getMetadata();
  /**
   * <pre>
   * Common metadata
   * </pre>
   *
   * <code>.common.Metadata metadata = 100 [json_name = "metadata"];</code>
   */
  io.opentdf.platform.common.MetadataOrBuilder getMetadataOrBuilder();
}
