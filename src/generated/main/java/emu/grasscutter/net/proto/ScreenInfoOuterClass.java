// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScreenInfo.proto

package emu.grasscutter.net.proto;

public final class ScreenInfoOuterClass {
  private ScreenInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScreenInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScreenInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 live_id = 1;</code>
     * @return The liveId.
     */
    int getLiveId();

    /**
     * <code>uint32 projector_entity_id = 2;</code>
     * @return The projectorEntityId.
     */
    int getProjectorEntityId();
  }
  /**
   * <pre>
   * Obf: MPEEPHMCGKD
   * </pre>
   *
   * Protobuf type {@code ScreenInfo}
   */
  public static final class ScreenInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScreenInfo)
      ScreenInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScreenInfo.newBuilder() to construct.
    private ScreenInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScreenInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScreenInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScreenInfoOuterClass.internal_static_ScreenInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo.class, emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo.Builder.class);
    }

    public static final int LIVE_ID_FIELD_NUMBER = 1;
    private int liveId_;
    /**
     * <code>uint32 live_id = 1;</code>
     * @return The liveId.
     */
    @java.lang.Override
    public int getLiveId() {
      return liveId_;
    }

    public static final int PROJECTOR_ENTITY_ID_FIELD_NUMBER = 2;
    private int projectorEntityId_;
    /**
     * <code>uint32 projector_entity_id = 2;</code>
     * @return The projectorEntityId.
     */
    @java.lang.Override
    public int getProjectorEntityId() {
      return projectorEntityId_;
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
      if (liveId_ != 0) {
        output.writeUInt32(1, liveId_);
      }
      if (projectorEntityId_ != 0) {
        output.writeUInt32(2, projectorEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (liveId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, liveId_);
      }
      if (projectorEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, projectorEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo other = (emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo) obj;

      if (getLiveId()
          != other.getLiveId()) return false;
      if (getProjectorEntityId()
          != other.getProjectorEntityId()) return false;
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
      hash = (37 * hash) + LIVE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLiveId();
      hash = (37 * hash) + PROJECTOR_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProjectorEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo prototype) {
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
     * Obf: MPEEPHMCGKD
     * </pre>
     *
     * Protobuf type {@code ScreenInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScreenInfo)
        emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScreenInfoOuterClass.internal_static_ScreenInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo.class, emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        liveId_ = 0;

        projectorEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo build() {
        emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo buildPartial() {
        emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo result = new emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo(this);
        result.liveId_ = liveId_;
        result.projectorEntityId_ = projectorEntityId_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo other) {
        if (other == emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo.getDefaultInstance()) return this;
        if (other.getLiveId() != 0) {
          setLiveId(other.getLiveId());
        }
        if (other.getProjectorEntityId() != 0) {
          setProjectorEntityId(other.getProjectorEntityId());
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
              case 8: {
                liveId_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                projectorEntityId_ = input.readUInt32();

                break;
              } // case 16
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

      private int liveId_ ;
      /**
       * <code>uint32 live_id = 1;</code>
       * @return The liveId.
       */
      @java.lang.Override
      public int getLiveId() {
        return liveId_;
      }
      /**
       * <code>uint32 live_id = 1;</code>
       * @param value The liveId to set.
       * @return This builder for chaining.
       */
      public Builder setLiveId(int value) {
        
        liveId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 live_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLiveId() {
        
        liveId_ = 0;
        onChanged();
        return this;
      }

      private int projectorEntityId_ ;
      /**
       * <code>uint32 projector_entity_id = 2;</code>
       * @return The projectorEntityId.
       */
      @java.lang.Override
      public int getProjectorEntityId() {
        return projectorEntityId_;
      }
      /**
       * <code>uint32 projector_entity_id = 2;</code>
       * @param value The projectorEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setProjectorEntityId(int value) {
        
        projectorEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 projector_entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProjectorEntityId() {
        
        projectorEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ScreenInfo)
    }

    // @@protoc_insertion_point(class_scope:ScreenInfo)
    private static final emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo();
    }

    public static emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScreenInfo>
        PARSER = new com.google.protobuf.AbstractParser<ScreenInfo>() {
      @java.lang.Override
      public ScreenInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ScreenInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScreenInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScreenInfoOuterClass.ScreenInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScreenInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScreenInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ScreenInfo.proto\":\n\nScreenInfo\022\017\n\007live" +
      "_id\030\001 \001(\r\022\033\n\023projector_entity_id\030\002 \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScreenInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScreenInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScreenInfo_descriptor,
        new java.lang.String[] { "LiveId", "ProjectorEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
