// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAvatarExitFocusNotify.proto

package emu.grasscutter.net.proto;

public final class EvtAvatarExitFocusNotifyOuterClass {
  private EvtAvatarExitFocusNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAvatarExitFocusNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAvatarExitFocusNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector finish_forward = 13;</code>
     * @return Whether the finishForward field is set.
     */
    boolean hasFinishForward();
    /**
     * <code>.Vector finish_forward = 13;</code>
     * @return The finishForward.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getFinishForward();
    /**
     * <code>.Vector finish_forward = 13;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFinishForwardOrBuilder();

    /**
     * <code>.ForwardType forward_type = 12;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 12;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 24354
   * Obf: BDJMGLMLENA
   * </pre>
   *
   * Protobuf type {@code EvtAvatarExitFocusNotify}
   */
  public static final class EvtAvatarExitFocusNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAvatarExitFocusNotify)
      EvtAvatarExitFocusNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAvatarExitFocusNotify.newBuilder() to construct.
    private EvtAvatarExitFocusNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAvatarExitFocusNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAvatarExitFocusNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.internal_static_EvtAvatarExitFocusNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.internal_static_EvtAvatarExitFocusNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify.class, emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify.Builder.class);
    }

    public static final int FINISH_FORWARD_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector finishForward_;
    /**
     * <code>.Vector finish_forward = 13;</code>
     * @return Whether the finishForward field is set.
     */
    @java.lang.Override
    public boolean hasFinishForward() {
      return finishForward_ != null;
    }
    /**
     * <code>.Vector finish_forward = 13;</code>
     * @return The finishForward.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getFinishForward() {
      return finishForward_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : finishForward_;
    }
    /**
     * <code>.Vector finish_forward = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFinishForwardOrBuilder() {
      return getFinishForward();
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 12;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 12;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 12;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(12, forwardType_);
      }
      if (finishForward_ != null) {
        output.writeMessage(13, getFinishForward());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, forwardType_);
      }
      if (finishForward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getFinishForward());
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify other = (emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify) obj;

      if (hasFinishForward() != other.hasFinishForward()) return false;
      if (hasFinishForward()) {
        if (!getFinishForward()
            .equals(other.getFinishForward())) return false;
      }
      if (forwardType_ != other.forwardType_) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasFinishForward()) {
        hash = (37 * hash) + FINISH_FORWARD_FIELD_NUMBER;
        hash = (53 * hash) + getFinishForward().hashCode();
      }
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify prototype) {
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
     * CmdId: 24354
     * Obf: BDJMGLMLENA
     * </pre>
     *
     * Protobuf type {@code EvtAvatarExitFocusNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAvatarExitFocusNotify)
        emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.internal_static_EvtAvatarExitFocusNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.internal_static_EvtAvatarExitFocusNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify.class, emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (finishForwardBuilder_ == null) {
          finishForward_ = null;
        } else {
          finishForward_ = null;
          finishForwardBuilder_ = null;
        }
        forwardType_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.internal_static_EvtAvatarExitFocusNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify build() {
        emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify buildPartial() {
        emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify result = new emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify(this);
        if (finishForwardBuilder_ == null) {
          result.finishForward_ = finishForward_;
        } else {
          result.finishForward_ = finishForwardBuilder_.build();
        }
        result.forwardType_ = forwardType_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify other) {
        if (other == emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify.getDefaultInstance()) return this;
        if (other.hasFinishForward()) {
          mergeFinishForward(other.getFinishForward());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
              case 88: {
                entityId_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                forwardType_ = input.readEnum();

                break;
              } // case 96
              case 106: {
                input.readMessage(
                    getFinishForwardFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 106
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

      private emu.grasscutter.net.proto.VectorOuterClass.Vector finishForward_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> finishForwardBuilder_;
      /**
       * <code>.Vector finish_forward = 13;</code>
       * @return Whether the finishForward field is set.
       */
      public boolean hasFinishForward() {
        return finishForwardBuilder_ != null || finishForward_ != null;
      }
      /**
       * <code>.Vector finish_forward = 13;</code>
       * @return The finishForward.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getFinishForward() {
        if (finishForwardBuilder_ == null) {
          return finishForward_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : finishForward_;
        } else {
          return finishForwardBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector finish_forward = 13;</code>
       */
      public Builder setFinishForward(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (finishForwardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          finishForward_ = value;
          onChanged();
        } else {
          finishForwardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector finish_forward = 13;</code>
       */
      public Builder setFinishForward(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (finishForwardBuilder_ == null) {
          finishForward_ = builderForValue.build();
          onChanged();
        } else {
          finishForwardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector finish_forward = 13;</code>
       */
      public Builder mergeFinishForward(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (finishForwardBuilder_ == null) {
          if (finishForward_ != null) {
            finishForward_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(finishForward_).mergeFrom(value).buildPartial();
          } else {
            finishForward_ = value;
          }
          onChanged();
        } else {
          finishForwardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector finish_forward = 13;</code>
       */
      public Builder clearFinishForward() {
        if (finishForwardBuilder_ == null) {
          finishForward_ = null;
          onChanged();
        } else {
          finishForward_ = null;
          finishForwardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector finish_forward = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getFinishForwardBuilder() {
        
        onChanged();
        return getFinishForwardFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector finish_forward = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFinishForwardOrBuilder() {
        if (finishForwardBuilder_ != null) {
          return finishForwardBuilder_.getMessageOrBuilder();
        } else {
          return finishForward_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : finishForward_;
        }
      }
      /**
       * <code>.Vector finish_forward = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getFinishForwardFieldBuilder() {
        if (finishForwardBuilder_ == null) {
          finishForwardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getFinishForward(),
                  getParentForChildren(),
                  isClean());
          finishForward_ = null;
        }
        return finishForwardBuilder_;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtAvatarExitFocusNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAvatarExitFocusNotify)
    private static final emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify();
    }

    public static emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAvatarExitFocusNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAvatarExitFocusNotify>() {
      @java.lang.Override
      public EvtAvatarExitFocusNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtAvatarExitFocusNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAvatarExitFocusNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtAvatarExitFocusNotifyOuterClass.EvtAvatarExitFocusNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAvatarExitFocusNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAvatarExitFocusNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036EvtAvatarExitFocusNotify.proto\032\014Vector" +
      ".proto\032\021ForwardType.proto\"r\n\030EvtAvatarEx" +
      "itFocusNotify\022\037\n\016finish_forward\030\r \001(\0132\007." +
      "Vector\022\"\n\014forward_type\030\014 \001(\0162\014.ForwardTy" +
      "pe\022\021\n\tentity_id\030\013 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtAvatarExitFocusNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAvatarExitFocusNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAvatarExitFocusNotify_descriptor,
        new java.lang.String[] { "FinishForward", "ForwardType", "EntityId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
