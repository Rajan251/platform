// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: authorization/authorization.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.authorization;

/**
 * <pre>
 *A logical bucket of attributes belonging to a "Resource"
 * </pre>
 *
 * Protobuf type {@code authorization.ResourceAttribute}
 */
public final class ResourceAttribute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:authorization.ResourceAttribute)
    ResourceAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceAttribute.newBuilder() to construct.
  private ResourceAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceAttribute() {
    attributeFqns_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceAttribute();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentdf.platform.authorization.AuthorizationProto.internal_static_authorization_ResourceAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentdf.platform.authorization.AuthorizationProto.internal_static_authorization_ResourceAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentdf.platform.authorization.ResourceAttribute.class, io.opentdf.platform.authorization.ResourceAttribute.Builder.class);
  }

  public static final int ATTRIBUTE_FQNS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList attributeFqns_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
   * @return A list containing the attributeFqns.
   */
  public com.google.protobuf.ProtocolStringList
      getAttributeFqnsList() {
    return attributeFqns_;
  }
  /**
   * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
   * @return The count of attributeFqns.
   */
  public int getAttributeFqnsCount() {
    return attributeFqns_.size();
  }
  /**
   * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
   * @param index The index of the element to return.
   * @return The attributeFqns at the given index.
   */
  public java.lang.String getAttributeFqns(int index) {
    return attributeFqns_.get(index);
  }
  /**
   * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the attributeFqns at the given index.
   */
  public com.google.protobuf.ByteString
      getAttributeFqnsBytes(int index) {
    return attributeFqns_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < attributeFqns_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, attributeFqns_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < attributeFqns_.size(); i++) {
        dataSize += computeStringSizeNoTag(attributeFqns_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAttributeFqnsList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.opentdf.platform.authorization.ResourceAttribute)) {
      return super.equals(obj);
    }
    io.opentdf.platform.authorization.ResourceAttribute other = (io.opentdf.platform.authorization.ResourceAttribute) obj;

    if (!getAttributeFqnsList()
        .equals(other.getAttributeFqnsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAttributeFqnsCount() > 0) {
      hash = (37 * hash) + ATTRIBUTE_FQNS_FIELD_NUMBER;
      hash = (53 * hash) + getAttributeFqnsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.opentdf.platform.authorization.ResourceAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentdf.platform.authorization.ResourceAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.authorization.ResourceAttribute parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.opentdf.platform.authorization.ResourceAttribute prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *A logical bucket of attributes belonging to a "Resource"
   * </pre>
   *
   * Protobuf type {@code authorization.ResourceAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:authorization.ResourceAttribute)
      io.opentdf.platform.authorization.ResourceAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentdf.platform.authorization.AuthorizationProto.internal_static_authorization_ResourceAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentdf.platform.authorization.AuthorizationProto.internal_static_authorization_ResourceAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentdf.platform.authorization.ResourceAttribute.class, io.opentdf.platform.authorization.ResourceAttribute.Builder.class);
    }

    // Construct using io.opentdf.platform.authorization.ResourceAttribute.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      attributeFqns_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentdf.platform.authorization.AuthorizationProto.internal_static_authorization_ResourceAttribute_descriptor;
    }

    @java.lang.Override
    public io.opentdf.platform.authorization.ResourceAttribute getDefaultInstanceForType() {
      return io.opentdf.platform.authorization.ResourceAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentdf.platform.authorization.ResourceAttribute build() {
      io.opentdf.platform.authorization.ResourceAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentdf.platform.authorization.ResourceAttribute buildPartial() {
      io.opentdf.platform.authorization.ResourceAttribute result = new io.opentdf.platform.authorization.ResourceAttribute(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.opentdf.platform.authorization.ResourceAttribute result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        attributeFqns_.makeImmutable();
        result.attributeFqns_ = attributeFqns_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.opentdf.platform.authorization.ResourceAttribute) {
        return mergeFrom((io.opentdf.platform.authorization.ResourceAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentdf.platform.authorization.ResourceAttribute other) {
      if (other == io.opentdf.platform.authorization.ResourceAttribute.getDefaultInstance()) return this;
      if (!other.attributeFqns_.isEmpty()) {
        if (attributeFqns_.isEmpty()) {
          attributeFqns_ = other.attributeFqns_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAttributeFqnsIsMutable();
          attributeFqns_.addAll(other.attributeFqns_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAttributeFqnsIsMutable();
              attributeFqns_.add(s);
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList attributeFqns_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAttributeFqnsIsMutable() {
      if (!attributeFqns_.isModifiable()) {
        attributeFqns_ = new com.google.protobuf.LazyStringArrayList(attributeFqns_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @return A list containing the attributeFqns.
     */
    public com.google.protobuf.ProtocolStringList
        getAttributeFqnsList() {
      attributeFqns_.makeImmutable();
      return attributeFqns_;
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @return The count of attributeFqns.
     */
    public int getAttributeFqnsCount() {
      return attributeFqns_.size();
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @param index The index of the element to return.
     * @return The attributeFqns at the given index.
     */
    public java.lang.String getAttributeFqns(int index) {
      return attributeFqns_.get(index);
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the attributeFqns at the given index.
     */
    public com.google.protobuf.ByteString
        getAttributeFqnsBytes(int index) {
      return attributeFqns_.getByteString(index);
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @param index The index to set the value at.
     * @param value The attributeFqns to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeFqns(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAttributeFqnsIsMutable();
      attributeFqns_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @param value The attributeFqns to add.
     * @return This builder for chaining.
     */
    public Builder addAttributeFqns(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAttributeFqnsIsMutable();
      attributeFqns_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @param values The attributeFqns to add.
     * @return This builder for chaining.
     */
    public Builder addAllAttributeFqns(
        java.lang.Iterable<java.lang.String> values) {
      ensureAttributeFqnsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, attributeFqns_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeFqns() {
      attributeFqns_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string attribute_fqns = 2 [json_name = "attributeFqns"];</code>
     * @param value The bytes of the attributeFqns to add.
     * @return This builder for chaining.
     */
    public Builder addAttributeFqnsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAttributeFqnsIsMutable();
      attributeFqns_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:authorization.ResourceAttribute)
  }

  // @@protoc_insertion_point(class_scope:authorization.ResourceAttribute)
  private static final io.opentdf.platform.authorization.ResourceAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentdf.platform.authorization.ResourceAttribute();
  }

  public static io.opentdf.platform.authorization.ResourceAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceAttribute>
      PARSER = new com.google.protobuf.AbstractParser<ResourceAttribute>() {
    @java.lang.Override
    public ResourceAttribute parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ResourceAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentdf.platform.authorization.ResourceAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

