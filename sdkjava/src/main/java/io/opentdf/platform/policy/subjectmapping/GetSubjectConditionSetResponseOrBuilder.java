// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.policy.subjectmapping;

public interface GetSubjectConditionSetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:policy.subjectmapping.GetSubjectConditionSetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.policy.SubjectConditionSet subject_condition_set = 1 [json_name = "subjectConditionSet"];</code>
   * @return Whether the subjectConditionSet field is set.
   */
  boolean hasSubjectConditionSet();
  /**
   * <code>.policy.SubjectConditionSet subject_condition_set = 1 [json_name = "subjectConditionSet"];</code>
   * @return The subjectConditionSet.
   */
  io.opentdf.platform.policy.SubjectConditionSet getSubjectConditionSet();
  /**
   * <code>.policy.SubjectConditionSet subject_condition_set = 1 [json_name = "subjectConditionSet"];</code>
   */
  io.opentdf.platform.policy.SubjectConditionSetOrBuilder getSubjectConditionSetOrBuilder();

  /**
   * <pre>
   * contextualized Subject Mappings associated with this SubjectConditionSet
   * </pre>
   *
   * <code>repeated .policy.SubjectMapping associated_subject_mappings = 2 [json_name = "associatedSubjectMappings"];</code>
   */
  java.util.List<io.opentdf.platform.policy.SubjectMapping> 
      getAssociatedSubjectMappingsList();
  /**
   * <pre>
   * contextualized Subject Mappings associated with this SubjectConditionSet
   * </pre>
   *
   * <code>repeated .policy.SubjectMapping associated_subject_mappings = 2 [json_name = "associatedSubjectMappings"];</code>
   */
  io.opentdf.platform.policy.SubjectMapping getAssociatedSubjectMappings(int index);
  /**
   * <pre>
   * contextualized Subject Mappings associated with this SubjectConditionSet
   * </pre>
   *
   * <code>repeated .policy.SubjectMapping associated_subject_mappings = 2 [json_name = "associatedSubjectMappings"];</code>
   */
  int getAssociatedSubjectMappingsCount();
  /**
   * <pre>
   * contextualized Subject Mappings associated with this SubjectConditionSet
   * </pre>
   *
   * <code>repeated .policy.SubjectMapping associated_subject_mappings = 2 [json_name = "associatedSubjectMappings"];</code>
   */
  java.util.List<? extends io.opentdf.platform.policy.SubjectMappingOrBuilder> 
      getAssociatedSubjectMappingsOrBuilderList();
  /**
   * <pre>
   * contextualized Subject Mappings associated with this SubjectConditionSet
   * </pre>
   *
   * <code>repeated .policy.SubjectMapping associated_subject_mappings = 2 [json_name = "associatedSubjectMappings"];</code>
   */
  io.opentdf.platform.policy.SubjectMappingOrBuilder getAssociatedSubjectMappingsOrBuilder(
      int index);
}