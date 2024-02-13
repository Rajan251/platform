// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: namespaces/namespaces.proto

// Protobuf Java Version: 3.25.2
package com.namespaces;

public final class NamespacesProto {
  private NamespacesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_Namespace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_Namespace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_GetNamespaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_GetNamespaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_GetNamespaceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_GetNamespaceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_ListNamespacesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_ListNamespacesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_ListNamespacesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_ListNamespacesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_CreateNamespaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_CreateNamespaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_CreateNamespaceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_CreateNamespaceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_UpdateNamespaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_UpdateNamespaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_UpdateNamespaceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_UpdateNamespaceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_DeleteNamespaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_DeleteNamespaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_namespaces_DeleteNamespaceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_namespaces_DeleteNamespaceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033namespaces/namespaces.proto\022\nnamespace" +
      "s\032\033buf/validate/validate.proto\032\034google/a" +
      "pi/annotations.proto\"\225\004\n\tNamespace\022\016\n\002id" +
      "\030\001 \001(\tR\002id\022\367\003\n\004name\030\005 \001(\tB\342\003\272H\336\003r\003\030\375\001\272\001\322" +
      "\003\n\020namespace_format\022\352\002Namespace must be " +
      "a valid hostname. It should include at l" +
      "east one dot, with each segment (label) " +
      "starting and ending with an alphanumeric" +
      " character. Each label must be 1 to 63 c" +
      "haracters long, allowing hyphens but not" +
      " as the first or last character. The top" +
      "-level domain (the last segment after th" +
      "e final dot) must consist of at least tw" +
      "o alphabetic characters.\032Qthis.matches(\'" +
      "^([a-zA-Z0-9]([a-zA-Z0-9\\\\-]{0,61}[a-zA-" +
      "Z0-9])?\\\\.)+[a-zA-Z]{2,}$\')\310\001\001R\004name\"-\n\023" +
      "GetNamespaceRequest\022\026\n\002id\030\001 \001(\tB\006\272H\003\310\001\001R" +
      "\002id\"K\n\024GetNamespaceResponse\0223\n\tnamespace" +
      "\030\001 \001(\0132\025.namespaces.NamespaceR\tnamespace" +
      "\"\027\n\025ListNamespacesRequest\"O\n\026ListNamespa" +
      "cesResponse\0225\n\nnamespaces\030\001 \003(\0132\025.namesp" +
      "aces.NamespaceR\nnamespaces\"4\n\026CreateName" +
      "spaceRequest\022\032\n\004name\030\001 \001(\tB\006\272H\003\310\001\001R\004name" +
      "\"N\n\027CreateNamespaceResponse\0223\n\tnamespace" +
      "\030\001 \001(\0132\025.namespaces.NamespaceR\tnamespace" +
      "\"L\n\026UpdateNamespaceRequest\022\026\n\002id\030\001 \001(\tB\006" +
      "\272H\003\310\001\001R\002id\022\032\n\004name\030\002 \001(\tB\006\272H\003\310\001\001R\004name\"N" +
      "\n\027UpdateNamespaceResponse\0223\n\tnamespace\030\001" +
      " \001(\0132\025.namespaces.NamespaceR\tnamespace\"0" +
      "\n\026DeleteNamespaceRequest\022\026\n\002id\030\001 \001(\tB\006\272H" +
      "\003\310\001\001R\002id\"\031\n\027DeleteNamespaceResponse2\201\005\n\020" +
      "NamespaceService\022v\n\014GetNamespace\022\037.names" +
      "paces.GetNamespaceRequest\032 .namespaces.G" +
      "etNamespaceResponse\"#\202\323\344\223\002\035\022\033/attributes" +
      "/namespaces/{id}\022w\n\016ListNamespaces\022!.nam" +
      "espaces.ListNamespacesRequest\032\".namespac" +
      "es.ListNamespacesResponse\"\036\202\323\344\223\002\030\022\026/attr" +
      "ibutes/namespaces\022z\n\017CreateNamespace\022\".n" +
      "amespaces.CreateNamespaceRequest\032#.names" +
      "paces.CreateNamespaceResponse\"\036\202\323\344\223\002\030\"\026/" +
      "attributes/namespaces\022\177\n\017UpdateNamespace" +
      "\022\".namespaces.UpdateNamespaceRequest\032#.n" +
      "amespaces.UpdateNamespaceResponse\"#\202\323\344\223\002" +
      "\035\032\033/attributes/namespaces/{id}\022\177\n\017Delete" +
      "Namespace\022\".namespaces.DeleteNamespaceRe" +
      "quest\032#.namespaces.DeleteNamespaceRespon" +
      "se\"#\202\323\344\223\002\035*\033/attributes/namespaces/{id}B" +
      "\233\001\n\016com.namespacesB\017NamespacesProtoP\001Z0g" +
      "ithub.com/opentdf/opentdf-v2-poc/sdk/nam" +
      "espaces\242\002\003NXX\252\002\nNamespaces\312\002\nNamespaces\342" +
      "\002\026Namespaces\\GPBMetadata\352\002\nNamespacesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.buf.validate.ValidateProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_namespaces_Namespace_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_namespaces_Namespace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_Namespace_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_namespaces_GetNamespaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_namespaces_GetNamespaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_GetNamespaceRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_namespaces_GetNamespaceResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_namespaces_GetNamespaceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_GetNamespaceResponse_descriptor,
        new java.lang.String[] { "Namespace", });
    internal_static_namespaces_ListNamespacesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_namespaces_ListNamespacesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_ListNamespacesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_namespaces_ListNamespacesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_namespaces_ListNamespacesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_ListNamespacesResponse_descriptor,
        new java.lang.String[] { "Namespaces", });
    internal_static_namespaces_CreateNamespaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_namespaces_CreateNamespaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_CreateNamespaceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_namespaces_CreateNamespaceResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_namespaces_CreateNamespaceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_CreateNamespaceResponse_descriptor,
        new java.lang.String[] { "Namespace", });
    internal_static_namespaces_UpdateNamespaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_namespaces_UpdateNamespaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_UpdateNamespaceRequest_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_namespaces_UpdateNamespaceResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_namespaces_UpdateNamespaceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_UpdateNamespaceResponse_descriptor,
        new java.lang.String[] { "Namespace", });
    internal_static_namespaces_DeleteNamespaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_namespaces_DeleteNamespaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_DeleteNamespaceRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_namespaces_DeleteNamespaceResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_namespaces_DeleteNamespaceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_namespaces_DeleteNamespaceResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.buf.validate.ValidateProto.field);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.buf.validate.ValidateProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}