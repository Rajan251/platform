// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package com.policy.attributes;

public interface ListAttributeValuesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:policy.attributes.ListAttributeValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .policy.attributes.Value values = 1 [json_name = "values"];</code>
   */
  java.util.List<com.policy.attributes.Value> 
      getValuesList();
  /**
   * <code>repeated .policy.attributes.Value values = 1 [json_name = "values"];</code>
   */
  com.policy.attributes.Value getValues(int index);
  /**
   * <code>repeated .policy.attributes.Value values = 1 [json_name = "values"];</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .policy.attributes.Value values = 1 [json_name = "values"];</code>
   */
  java.util.List<? extends com.policy.attributes.ValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .policy.attributes.Value values = 1 [json_name = "values"];</code>
   */
  com.policy.attributes.ValueOrBuilder getValuesOrBuilder(
      int index);
}