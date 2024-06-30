// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PingRsp.proto

package emu.grasscutter.net.proto;

public final class PingRspOuterClass {
  private PingRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PingRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PingRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 seq = 6;</code>
     * @return The seq.
     */
    int getSeq();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 client_time = 12;</code>
     * @return The clientTime.
     */
    int getClientTime();
  }
  /**
   * <pre>
   * CmdId: 8231
   * Obf: BLIJCEANDPM
   * </pre>
   *
   * Protobuf type {@code PingRsp}
   */
  public static final class PingRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PingRsp)
      PingRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PingRsp.newBuilder() to construct.
    private PingRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PingRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PingRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PingRspOuterClass.internal_static_PingRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PingRspOuterClass.internal_static_PingRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PingRspOuterClass.PingRsp.class, emu.grasscutter.net.proto.PingRspOuterClass.PingRsp.Builder.class);
    }

    public static final int SEQ_FIELD_NUMBER = 6;
    private int seq_;
    /**
     * <code>uint32 seq = 6;</code>
     * @return The seq.
     */
    @java.lang.Override
    public int getSeq() {
      return seq_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CLIENT_TIME_FIELD_NUMBER = 12;
    private int clientTime_;
    /**
     * <code>uint32 client_time = 12;</code>
     * @return The clientTime.
     */
    @java.lang.Override
    public int getClientTime() {
      return clientTime_;
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
        output.writeInt32(2, retcode_);
      }
      if (seq_ != 0) {
        output.writeUInt32(6, seq_);
      }
      if (clientTime_ != 0) {
        output.writeUInt32(12, clientTime_);
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
          .computeInt32Size(2, retcode_);
      }
      if (seq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, seq_);
      }
      if (clientTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, clientTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PingRspOuterClass.PingRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PingRspOuterClass.PingRsp other = (emu.grasscutter.net.proto.PingRspOuterClass.PingRsp) obj;

      if (getSeq()
          != other.getSeq()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getClientTime()
          != other.getClientTime()) return false;
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
      hash = (37 * hash) + SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getSeq();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CLIENT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getClientTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PingRspOuterClass.PingRsp prototype) {
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
     * CmdId: 8231
     * Obf: BLIJCEANDPM
     * </pre>
     *
     * Protobuf type {@code PingRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PingRsp)
        emu.grasscutter.net.proto.PingRspOuterClass.PingRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PingRspOuterClass.internal_static_PingRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PingRspOuterClass.internal_static_PingRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PingRspOuterClass.PingRsp.class, emu.grasscutter.net.proto.PingRspOuterClass.PingRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PingRspOuterClass.PingRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        seq_ = 0;

        retcode_ = 0;

        clientTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PingRspOuterClass.internal_static_PingRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PingRspOuterClass.PingRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PingRspOuterClass.PingRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PingRspOuterClass.PingRsp build() {
        emu.grasscutter.net.proto.PingRspOuterClass.PingRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PingRspOuterClass.PingRsp buildPartial() {
        emu.grasscutter.net.proto.PingRspOuterClass.PingRsp result = new emu.grasscutter.net.proto.PingRspOuterClass.PingRsp(this);
        result.seq_ = seq_;
        result.retcode_ = retcode_;
        result.clientTime_ = clientTime_;
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
        if (other instanceof emu.grasscutter.net.proto.PingRspOuterClass.PingRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PingRspOuterClass.PingRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PingRspOuterClass.PingRsp other) {
        if (other == emu.grasscutter.net.proto.PingRspOuterClass.PingRsp.getDefaultInstance()) return this;
        if (other.getSeq() != 0) {
          setSeq(other.getSeq());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getClientTime() != 0) {
          setClientTime(other.getClientTime());
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
              case 16: {
                retcode_ = input.readInt32();

                break;
              } // case 16
              case 48: {
                seq_ = input.readUInt32();

                break;
              } // case 48
              case 96: {
                clientTime_ = input.readUInt32();

                break;
              } // case 96
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

      private int seq_ ;
      /**
       * <code>uint32 seq = 6;</code>
       * @return The seq.
       */
      @java.lang.Override
      public int getSeq() {
        return seq_;
      }
      /**
       * <code>uint32 seq = 6;</code>
       * @param value The seq to set.
       * @return This builder for chaining.
       */
      public Builder setSeq(int value) {
        
        seq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seq = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeq() {
        
        seq_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int clientTime_ ;
      /**
       * <code>uint32 client_time = 12;</code>
       * @return The clientTime.
       */
      @java.lang.Override
      public int getClientTime() {
        return clientTime_;
      }
      /**
       * <code>uint32 client_time = 12;</code>
       * @param value The clientTime to set.
       * @return This builder for chaining.
       */
      public Builder setClientTime(int value) {
        
        clientTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 client_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientTime() {
        
        clientTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PingRsp)
    }

    // @@protoc_insertion_point(class_scope:PingRsp)
    private static final emu.grasscutter.net.proto.PingRspOuterClass.PingRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PingRspOuterClass.PingRsp();
    }

    public static emu.grasscutter.net.proto.PingRspOuterClass.PingRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PingRsp>
        PARSER = new com.google.protobuf.AbstractParser<PingRsp>() {
      @java.lang.Override
      public PingRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PingRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PingRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PingRspOuterClass.PingRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PingRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PingRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rPingRsp.proto\"<\n\007PingRsp\022\013\n\003seq\030\006 \001(\r\022" +
      "\017\n\007retcode\030\002 \001(\005\022\023\n\013client_time\030\014 \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PingRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PingRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PingRsp_descriptor,
        new java.lang.String[] { "Seq", "Retcode", "ClientTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
