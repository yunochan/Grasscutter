// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneFishInfo.proto

package emu.grasscutter.net.proto;

public final class SceneFishInfoOuterClass {
  private SceneFishInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneFishInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneFishInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 fish_id = 1;</code>
     * @return The fishId.
     */
    int getFishId();

    /**
     * <code>uint32 fish_pool_entity_id = 2;</code>
     * @return The fishPoolEntityId.
     */
    int getFishPoolEntityId();

    /**
     * <code>.Vector fish_pool_pos = 3;</code>
     * @return Whether the fishPoolPos field is set.
     */
    boolean hasFishPoolPos();
    /**
     * <code>.Vector fish_pool_pos = 3;</code>
     * @return The fishPoolPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getFishPoolPos();
    /**
     * <code>.Vector fish_pool_pos = 3;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFishPoolPosOrBuilder();

    /**
     * <code>uint32 fish_pool_gadget_id = 4;</code>
     * @return The fishPoolGadgetId.
     */
    int getFishPoolGadgetId();

    /**
     * <code>uint32 last_shock_time = 5;</code>
     * @return The lastShockTime.
     */
    int getLastShockTime();
  }
  /**
   * <pre>
   * Obf: HNLLCGHHGFM
   * </pre>
   *
   * Protobuf type {@code SceneFishInfo}
   */
  public static final class SceneFishInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneFishInfo)
      SceneFishInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneFishInfo.newBuilder() to construct.
    private SceneFishInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneFishInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneFishInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneFishInfoOuterClass.internal_static_SceneFishInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneFishInfoOuterClass.internal_static_SceneFishInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo.class, emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo.Builder.class);
    }

    public static final int FISH_ID_FIELD_NUMBER = 1;
    private int fishId_;
    /**
     * <code>uint32 fish_id = 1;</code>
     * @return The fishId.
     */
    @java.lang.Override
    public int getFishId() {
      return fishId_;
    }

    public static final int FISH_POOL_ENTITY_ID_FIELD_NUMBER = 2;
    private int fishPoolEntityId_;
    /**
     * <code>uint32 fish_pool_entity_id = 2;</code>
     * @return The fishPoolEntityId.
     */
    @java.lang.Override
    public int getFishPoolEntityId() {
      return fishPoolEntityId_;
    }

    public static final int FISH_POOL_POS_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector fishPoolPos_;
    /**
     * <code>.Vector fish_pool_pos = 3;</code>
     * @return Whether the fishPoolPos field is set.
     */
    @java.lang.Override
    public boolean hasFishPoolPos() {
      return fishPoolPos_ != null;
    }
    /**
     * <code>.Vector fish_pool_pos = 3;</code>
     * @return The fishPoolPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getFishPoolPos() {
      return fishPoolPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : fishPoolPos_;
    }
    /**
     * <code>.Vector fish_pool_pos = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFishPoolPosOrBuilder() {
      return getFishPoolPos();
    }

    public static final int FISH_POOL_GADGET_ID_FIELD_NUMBER = 4;
    private int fishPoolGadgetId_;
    /**
     * <code>uint32 fish_pool_gadget_id = 4;</code>
     * @return The fishPoolGadgetId.
     */
    @java.lang.Override
    public int getFishPoolGadgetId() {
      return fishPoolGadgetId_;
    }

    public static final int LAST_SHOCK_TIME_FIELD_NUMBER = 5;
    private int lastShockTime_;
    /**
     * <code>uint32 last_shock_time = 5;</code>
     * @return The lastShockTime.
     */
    @java.lang.Override
    public int getLastShockTime() {
      return lastShockTime_;
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
      if (fishId_ != 0) {
        output.writeUInt32(1, fishId_);
      }
      if (fishPoolEntityId_ != 0) {
        output.writeUInt32(2, fishPoolEntityId_);
      }
      if (fishPoolPos_ != null) {
        output.writeMessage(3, getFishPoolPos());
      }
      if (fishPoolGadgetId_ != 0) {
        output.writeUInt32(4, fishPoolGadgetId_);
      }
      if (lastShockTime_ != 0) {
        output.writeUInt32(5, lastShockTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fishId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, fishId_);
      }
      if (fishPoolEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, fishPoolEntityId_);
      }
      if (fishPoolPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getFishPoolPos());
      }
      if (fishPoolGadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, fishPoolGadgetId_);
      }
      if (lastShockTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, lastShockTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo other = (emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo) obj;

      if (getFishId()
          != other.getFishId()) return false;
      if (getFishPoolEntityId()
          != other.getFishPoolEntityId()) return false;
      if (hasFishPoolPos() != other.hasFishPoolPos()) return false;
      if (hasFishPoolPos()) {
        if (!getFishPoolPos()
            .equals(other.getFishPoolPos())) return false;
      }
      if (getFishPoolGadgetId()
          != other.getFishPoolGadgetId()) return false;
      if (getLastShockTime()
          != other.getLastShockTime()) return false;
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
      hash = (37 * hash) + FISH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFishId();
      hash = (37 * hash) + FISH_POOL_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFishPoolEntityId();
      if (hasFishPoolPos()) {
        hash = (37 * hash) + FISH_POOL_POS_FIELD_NUMBER;
        hash = (53 * hash) + getFishPoolPos().hashCode();
      }
      hash = (37 * hash) + FISH_POOL_GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFishPoolGadgetId();
      hash = (37 * hash) + LAST_SHOCK_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastShockTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo prototype) {
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
     * Obf: HNLLCGHHGFM
     * </pre>
     *
     * Protobuf type {@code SceneFishInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneFishInfo)
        emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneFishInfoOuterClass.internal_static_SceneFishInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneFishInfoOuterClass.internal_static_SceneFishInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo.class, emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        fishId_ = 0;

        fishPoolEntityId_ = 0;

        if (fishPoolPosBuilder_ == null) {
          fishPoolPos_ = null;
        } else {
          fishPoolPos_ = null;
          fishPoolPosBuilder_ = null;
        }
        fishPoolGadgetId_ = 0;

        lastShockTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneFishInfoOuterClass.internal_static_SceneFishInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo build() {
        emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo buildPartial() {
        emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo result = new emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo(this);
        result.fishId_ = fishId_;
        result.fishPoolEntityId_ = fishPoolEntityId_;
        if (fishPoolPosBuilder_ == null) {
          result.fishPoolPos_ = fishPoolPos_;
        } else {
          result.fishPoolPos_ = fishPoolPosBuilder_.build();
        }
        result.fishPoolGadgetId_ = fishPoolGadgetId_;
        result.lastShockTime_ = lastShockTime_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo other) {
        if (other == emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance()) return this;
        if (other.getFishId() != 0) {
          setFishId(other.getFishId());
        }
        if (other.getFishPoolEntityId() != 0) {
          setFishPoolEntityId(other.getFishPoolEntityId());
        }
        if (other.hasFishPoolPos()) {
          mergeFishPoolPos(other.getFishPoolPos());
        }
        if (other.getFishPoolGadgetId() != 0) {
          setFishPoolGadgetId(other.getFishPoolGadgetId());
        }
        if (other.getLastShockTime() != 0) {
          setLastShockTime(other.getLastShockTime());
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
                fishId_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                fishPoolEntityId_ = input.readUInt32();

                break;
              } // case 16
              case 26: {
                input.readMessage(
                    getFishPoolPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 26
              case 32: {
                fishPoolGadgetId_ = input.readUInt32();

                break;
              } // case 32
              case 40: {
                lastShockTime_ = input.readUInt32();

                break;
              } // case 40
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

      private int fishId_ ;
      /**
       * <code>uint32 fish_id = 1;</code>
       * @return The fishId.
       */
      @java.lang.Override
      public int getFishId() {
        return fishId_;
      }
      /**
       * <code>uint32 fish_id = 1;</code>
       * @param value The fishId to set.
       * @return This builder for chaining.
       */
      public Builder setFishId(int value) {
        
        fishId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fish_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFishId() {
        
        fishId_ = 0;
        onChanged();
        return this;
      }

      private int fishPoolEntityId_ ;
      /**
       * <code>uint32 fish_pool_entity_id = 2;</code>
       * @return The fishPoolEntityId.
       */
      @java.lang.Override
      public int getFishPoolEntityId() {
        return fishPoolEntityId_;
      }
      /**
       * <code>uint32 fish_pool_entity_id = 2;</code>
       * @param value The fishPoolEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setFishPoolEntityId(int value) {
        
        fishPoolEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fish_pool_entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFishPoolEntityId() {
        
        fishPoolEntityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector fishPoolPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> fishPoolPosBuilder_;
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       * @return Whether the fishPoolPos field is set.
       */
      public boolean hasFishPoolPos() {
        return fishPoolPosBuilder_ != null || fishPoolPos_ != null;
      }
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       * @return The fishPoolPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getFishPoolPos() {
        if (fishPoolPosBuilder_ == null) {
          return fishPoolPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : fishPoolPos_;
        } else {
          return fishPoolPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       */
      public Builder setFishPoolPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (fishPoolPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fishPoolPos_ = value;
          onChanged();
        } else {
          fishPoolPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       */
      public Builder setFishPoolPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (fishPoolPosBuilder_ == null) {
          fishPoolPos_ = builderForValue.build();
          onChanged();
        } else {
          fishPoolPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       */
      public Builder mergeFishPoolPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (fishPoolPosBuilder_ == null) {
          if (fishPoolPos_ != null) {
            fishPoolPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(fishPoolPos_).mergeFrom(value).buildPartial();
          } else {
            fishPoolPos_ = value;
          }
          onChanged();
        } else {
          fishPoolPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       */
      public Builder clearFishPoolPos() {
        if (fishPoolPosBuilder_ == null) {
          fishPoolPos_ = null;
          onChanged();
        } else {
          fishPoolPos_ = null;
          fishPoolPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getFishPoolPosBuilder() {
        
        onChanged();
        return getFishPoolPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFishPoolPosOrBuilder() {
        if (fishPoolPosBuilder_ != null) {
          return fishPoolPosBuilder_.getMessageOrBuilder();
        } else {
          return fishPoolPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : fishPoolPos_;
        }
      }
      /**
       * <code>.Vector fish_pool_pos = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getFishPoolPosFieldBuilder() {
        if (fishPoolPosBuilder_ == null) {
          fishPoolPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getFishPoolPos(),
                  getParentForChildren(),
                  isClean());
          fishPoolPos_ = null;
        }
        return fishPoolPosBuilder_;
      }

      private int fishPoolGadgetId_ ;
      /**
       * <code>uint32 fish_pool_gadget_id = 4;</code>
       * @return The fishPoolGadgetId.
       */
      @java.lang.Override
      public int getFishPoolGadgetId() {
        return fishPoolGadgetId_;
      }
      /**
       * <code>uint32 fish_pool_gadget_id = 4;</code>
       * @param value The fishPoolGadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setFishPoolGadgetId(int value) {
        
        fishPoolGadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fish_pool_gadget_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFishPoolGadgetId() {
        
        fishPoolGadgetId_ = 0;
        onChanged();
        return this;
      }

      private int lastShockTime_ ;
      /**
       * <code>uint32 last_shock_time = 5;</code>
       * @return The lastShockTime.
       */
      @java.lang.Override
      public int getLastShockTime() {
        return lastShockTime_;
      }
      /**
       * <code>uint32 last_shock_time = 5;</code>
       * @param value The lastShockTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastShockTime(int value) {
        
        lastShockTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 last_shock_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastShockTime() {
        
        lastShockTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneFishInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneFishInfo)
    private static final emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo();
    }

    public static emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneFishInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneFishInfo>() {
      @java.lang.Override
      public SceneFishInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneFishInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneFishInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneFishInfoOuterClass.SceneFishInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneFishInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneFishInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SceneFishInfo.proto\032\014Vector.proto\"\223\001\n\r" +
      "SceneFishInfo\022\017\n\007fish_id\030\001 \001(\r\022\033\n\023fish_p" +
      "ool_entity_id\030\002 \001(\r\022\036\n\rfish_pool_pos\030\003 \001" +
      "(\0132\007.Vector\022\033\n\023fish_pool_gadget_id\030\004 \001(\r" +
      "\022\027\n\017last_shock_time\030\005 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_SceneFishInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneFishInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneFishInfo_descriptor,
        new java.lang.String[] { "FishId", "FishPoolEntityId", "FishPoolPos", "FishPoolGadgetId", "LastShockTime", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
