// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package com.policy.subjectmapping;

public interface ListSubjectMappingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:policy.subjectmapping.ListSubjectMappingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .policy.subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  java.util.List<com.policy.subjectmapping.SubjectMapping> 
      getSubjectMappingsList();
  /**
   * <code>repeated .policy.subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  com.policy.subjectmapping.SubjectMapping getSubjectMappings(int index);
  /**
   * <code>repeated .policy.subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  int getSubjectMappingsCount();
  /**
   * <code>repeated .policy.subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  java.util.List<? extends com.policy.subjectmapping.SubjectMappingOrBuilder> 
      getSubjectMappingsOrBuilderList();
  /**
   * <code>repeated .policy.subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  com.policy.subjectmapping.SubjectMappingOrBuilder getSubjectMappingsOrBuilder(
      int index);
}