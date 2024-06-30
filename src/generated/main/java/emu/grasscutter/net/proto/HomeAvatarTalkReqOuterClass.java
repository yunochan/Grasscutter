// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarTalkReq.proto

package emu.grasscutter.net.proto;

public final class HomeAvatarTalkReqOuterClass {
  private HomeAvatarTalkReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarTalkReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarTalkReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 7;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 talk_id = 6;</code>
     * @return The talkId.
     */
    int getTalkId();
  }
  /**
   * <pre>
   * CmdId: 22316
   * Obf: APHEBEHHMEL
   * </pre>
   *
   * Protobuf type {@code HomeAvatarTalkReq}
   */
  public static final class HomeAvatarTalkReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarTalkReq)
      HomeAvatarTalkReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarTalkReq.newBuilder() to construct.
    private HomeAvatarTalkReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarTalkReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarTalkReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.internal_static_HomeAvatarTalkReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.internal_static_HomeAvatarTalkReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq.class, emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 7;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 7;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int TALK_ID_FIELD_NUMBER = 6;
    private int talkId_;
    /**
     * <code>uint32 talk_id = 6;</code>
     * @return The talkId.
     */
    @java.lang.Override
    public int getTalkId() {
      return talkId_;
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
      if (talkId_ != 0) {
        output.writeUInt32(6, talkId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(7, avatarId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (talkId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, talkId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, avatarId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq other = (emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getTalkId()
          != other.getTalkId()) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + TALK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTalkId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq prototype) {
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
     * CmdId: 22316
     * Obf: APHEBEHHMEL
     * </pre>
     *
     * Protobuf type {@code HomeAvatarTalkReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarTalkReq)
        emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.internal_static_HomeAvatarTalkReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.internal_static_HomeAvatarTalkReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq.class, emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarId_ = 0;

        talkId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.internal_static_HomeAvatarTalkReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq build() {
        emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq buildPartial() {
        emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq result = new emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq(this);
        result.avatarId_ = avatarId_;
        result.talkId_ = talkId_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq other) {
        if (other == emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getTalkId() != 0) {
          setTalkId(other.getTalkId());
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
              case 48: {
                talkId_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                avatarId_ = input.readUInt32();

                break;
              } // case 56
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

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int talkId_ ;
      /**
       * <code>uint32 talk_id = 6;</code>
       * @return The talkId.
       */
      @java.lang.Override
      public int getTalkId() {
        return talkId_;
      }
      /**
       * <code>uint32 talk_id = 6;</code>
       * @param value The talkId to set.
       * @return This builder for chaining.
       */
      public Builder setTalkId(int value) {
        
        talkId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 talk_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalkId() {
        
        talkId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeAvatarTalkReq)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarTalkReq)
    private static final emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq();
    }

    public static emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarTalkReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarTalkReq>() {
      @java.lang.Override
      public HomeAvatarTalkReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeAvatarTalkReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarTalkReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarTalkReqOuterClass.HomeAvatarTalkReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarTalkReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarTalkReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HomeAvatarTalkReq.proto\"7\n\021HomeAvatarT" +
      "alkReq\022\021\n\tavatar_id\030\007 \001(\r\022\017\n\007talk_id\030\006 \001" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeAvatarTalkReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarTalkReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarTalkReq_descriptor,
        new java.lang.String[] { "AvatarId", "TalkId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
