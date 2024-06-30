// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectWorktopOptionRsp.proto

package emu.grasscutter.net.proto;

public final class SelectWorktopOptionRspOuterClass {
  private SelectWorktopOptionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SelectWorktopOptionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SelectWorktopOptionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 option_id = 13;</code>
     * @return The optionId.
     */
    int getOptionId();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 gadget_entity_id = 14;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();
  }
  /**
   * <pre>
   * CmdId: 27194
   * Obf: MJHAKKACKEC
   * </pre>
   *
   * Protobuf type {@code SelectWorktopOptionRsp}
   */
  public static final class SelectWorktopOptionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SelectWorktopOptionRsp)
      SelectWorktopOptionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SelectWorktopOptionRsp.newBuilder() to construct.
    private SelectWorktopOptionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SelectWorktopOptionRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SelectWorktopOptionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.internal_static_SelectWorktopOptionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.internal_static_SelectWorktopOptionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp.class, emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp.Builder.class);
    }

    public static final int OPTION_ID_FIELD_NUMBER = 13;
    private int optionId_;
    /**
     * <code>uint32 option_id = 13;</code>
     * @return The optionId.
     */
    @java.lang.Override
    public int getOptionId() {
      return optionId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 14;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 14;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
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
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (optionId_ != 0) {
        output.writeUInt32(13, optionId_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(14, gadgetEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (optionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, optionId_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, gadgetEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp other = (emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp) obj;

      if (getOptionId()
          != other.getOptionId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
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
      hash = (37 * hash) + OPTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOptionId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp prototype) {
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
     * CmdId: 27194
     * Obf: MJHAKKACKEC
     * </pre>
     *
     * Protobuf type {@code SelectWorktopOptionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SelectWorktopOptionRsp)
        emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.internal_static_SelectWorktopOptionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.internal_static_SelectWorktopOptionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp.class, emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        optionId_ = 0;

        retcode_ = 0;

        gadgetEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.internal_static_SelectWorktopOptionRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp build() {
        emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp buildPartial() {
        emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp result = new emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp(this);
        result.optionId_ = optionId_;
        result.retcode_ = retcode_;
        result.gadgetEntityId_ = gadgetEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp other) {
        if (other == emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp.getDefaultInstance()) return this;
        if (other.getOptionId() != 0) {
          setOptionId(other.getOptionId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
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
              case 72: {
                retcode_ = input.readInt32();

                break;
              } // case 72
              case 104: {
                optionId_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                gadgetEntityId_ = input.readUInt32();

                break;
              } // case 112
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

      private int optionId_ ;
      /**
       * <code>uint32 option_id = 13;</code>
       * @return The optionId.
       */
      @java.lang.Override
      public int getOptionId() {
        return optionId_;
      }
      /**
       * <code>uint32 option_id = 13;</code>
       * @param value The optionId to set.
       * @return This builder for chaining.
       */
      public Builder setOptionId(int value) {
        
        optionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 option_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionId() {
        
        optionId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SelectWorktopOptionRsp)
    }

    // @@protoc_insertion_point(class_scope:SelectWorktopOptionRsp)
    private static final emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp();
    }

    public static emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SelectWorktopOptionRsp>
        PARSER = new com.google.protobuf.AbstractParser<SelectWorktopOptionRsp>() {
      @java.lang.Override
      public SelectWorktopOptionRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SelectWorktopOptionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelectWorktopOptionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectWorktopOptionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectWorktopOptionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SelectWorktopOptionRsp.proto\"V\n\026Select" +
      "WorktopOptionRsp\022\021\n\toption_id\030\r \001(\r\022\017\n\007r" +
      "etcode\030\t \001(\005\022\030\n\020gadget_entity_id\030\016 \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SelectWorktopOptionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SelectWorktopOptionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelectWorktopOptionRsp_descriptor,
        new java.lang.String[] { "OptionId", "Retcode", "GadgetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
