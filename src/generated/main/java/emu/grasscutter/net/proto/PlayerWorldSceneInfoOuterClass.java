// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerWorldSceneInfo.proto

package emu.grasscutter.net.proto;

public final class PlayerWorldSceneInfoOuterClass {
  private PlayerWorldSceneInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerWorldSceneInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerWorldSceneInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     * @return Whether the mapLayerInfo field is set.
     */
    boolean hasMapLayerInfo();
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     * @return The mapLayerInfo.
     */
    emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo getMapLayerInfo();
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     */
    emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder getMapLayerInfoOrBuilder();

    /**
     * <code>uint32 scene_id = 12;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>bool is_locked = 2;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    /**
     * <code>repeated uint32 scene_tag_id_list = 7;</code>
     * @return A list containing the sceneTagIdList.
     */
    java.util.List<java.lang.Integer> getSceneTagIdListList();
    /**
     * <code>repeated uint32 scene_tag_id_list = 7;</code>
     * @return The count of sceneTagIdList.
     */
    int getSceneTagIdListCount();
    /**
     * <code>repeated uint32 scene_tag_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    int getSceneTagIdList(int index);
  }
  /**
   * <pre>
   * Obf: FCGGGBEOFIJ
   * </pre>
   *
   * Protobuf type {@code PlayerWorldSceneInfo}
   */
  public static final class PlayerWorldSceneInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerWorldSceneInfo)
      PlayerWorldSceneInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerWorldSceneInfo.newBuilder() to construct.
    private PlayerWorldSceneInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerWorldSceneInfo() {
      sceneTagIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerWorldSceneInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.class, emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder.class);
    }

    public static final int MAP_LAYER_INFO_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo mapLayerInfo_;
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     * @return Whether the mapLayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasMapLayerInfo() {
      return mapLayerInfo_ != null;
    }
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     * @return The mapLayerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo getMapLayerInfo() {
      return mapLayerInfo_ == null ? emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.getDefaultInstance() : mapLayerInfo_;
    }
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder getMapLayerInfoOrBuilder() {
      return getMapLayerInfo();
    }

    public static final int SCENE_ID_FIELD_NUMBER = 12;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 12;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int IS_LOCKED_FIELD_NUMBER = 2;
    private boolean isLocked_;
    /**
     * <code>bool is_locked = 2;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
    }

    public static final int SCENE_TAG_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList sceneTagIdList_;
    /**
     * <code>repeated uint32 scene_tag_id_list = 7;</code>
     * @return A list containing the sceneTagIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSceneTagIdListList() {
      return sceneTagIdList_;
    }
    /**
     * <code>repeated uint32 scene_tag_id_list = 7;</code>
     * @return The count of sceneTagIdList.
     */
    public int getSceneTagIdListCount() {
      return sceneTagIdList_.size();
    }
    /**
     * <code>repeated uint32 scene_tag_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    public int getSceneTagIdList(int index) {
      return sceneTagIdList_.getInt(index);
    }
    private int sceneTagIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (mapLayerInfo_ != null) {
        output.writeMessage(1, getMapLayerInfo());
      }
      if (isLocked_ != false) {
        output.writeBool(2, isLocked_);
      }
      if (getSceneTagIdListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(sceneTagIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < sceneTagIdList_.size(); i++) {
        output.writeUInt32NoTag(sceneTagIdList_.getInt(i));
      }
      if (sceneId_ != 0) {
        output.writeUInt32(12, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mapLayerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMapLayerInfo());
      }
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isLocked_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < sceneTagIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sceneTagIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSceneTagIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sceneTagIdListMemoizedSerializedSize = dataSize;
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo other = (emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo) obj;

      if (hasMapLayerInfo() != other.hasMapLayerInfo()) return false;
      if (hasMapLayerInfo()) {
        if (!getMapLayerInfo()
            .equals(other.getMapLayerInfo())) return false;
      }
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (!getSceneTagIdListList()
          .equals(other.getSceneTagIdListList())) return false;
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
      if (hasMapLayerInfo()) {
        hash = (37 * hash) + MAP_LAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMapLayerInfo().hashCode();
      }
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + IS_LOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      if (getSceneTagIdListCount() > 0) {
        hash = (37 * hash) + SCENE_TAG_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneTagIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo prototype) {
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
     * Obf: FCGGGBEOFIJ
     * </pre>
     *
     * Protobuf type {@code PlayerWorldSceneInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerWorldSceneInfo)
        emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.class, emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (mapLayerInfoBuilder_ == null) {
          mapLayerInfo_ = null;
        } else {
          mapLayerInfo_ = null;
          mapLayerInfoBuilder_ = null;
        }
        sceneId_ = 0;

        isLocked_ = false;

        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo build() {
        emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo buildPartial() {
        emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo result = new emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo(this);
        int from_bitField0_ = bitField0_;
        if (mapLayerInfoBuilder_ == null) {
          result.mapLayerInfo_ = mapLayerInfo_;
        } else {
          result.mapLayerInfo_ = mapLayerInfoBuilder_.build();
        }
        result.sceneId_ = sceneId_;
        result.isLocked_ = isLocked_;
        if (((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sceneTagIdList_ = sceneTagIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo other) {
        if (other == emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.getDefaultInstance()) return this;
        if (other.hasMapLayerInfo()) {
          mergeMapLayerInfo(other.getMapLayerInfo());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        if (!other.sceneTagIdList_.isEmpty()) {
          if (sceneTagIdList_.isEmpty()) {
            sceneTagIdList_ = other.sceneTagIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSceneTagIdListIsMutable();
            sceneTagIdList_.addAll(other.sceneTagIdList_);
          }
          onChanged();
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
              case 10: {
                input.readMessage(
                    getMapLayerInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 16: {
                isLocked_ = input.readBool();

                break;
              } // case 16
              case 56: {
                int v = input.readUInt32();
                ensureSceneTagIdListIsMutable();
                sceneTagIdList_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSceneTagIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  sceneTagIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 58
              case 96: {
                sceneId_ = input.readUInt32();

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
      private int bitField0_;

      private emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo mapLayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder> mapLayerInfoBuilder_;
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       * @return Whether the mapLayerInfo field is set.
       */
      public boolean hasMapLayerInfo() {
        return mapLayerInfoBuilder_ != null || mapLayerInfo_ != null;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       * @return The mapLayerInfo.
       */
      public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo getMapLayerInfo() {
        if (mapLayerInfoBuilder_ == null) {
          return mapLayerInfo_ == null ? emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.getDefaultInstance() : mapLayerInfo_;
        } else {
          return mapLayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public Builder setMapLayerInfo(emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo value) {
        if (mapLayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mapLayerInfo_ = value;
          onChanged();
        } else {
          mapLayerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public Builder setMapLayerInfo(
          emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder builderForValue) {
        if (mapLayerInfoBuilder_ == null) {
          mapLayerInfo_ = builderForValue.build();
          onChanged();
        } else {
          mapLayerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public Builder mergeMapLayerInfo(emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo value) {
        if (mapLayerInfoBuilder_ == null) {
          if (mapLayerInfo_ != null) {
            mapLayerInfo_ =
              emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.newBuilder(mapLayerInfo_).mergeFrom(value).buildPartial();
          } else {
            mapLayerInfo_ = value;
          }
          onChanged();
        } else {
          mapLayerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public Builder clearMapLayerInfo() {
        if (mapLayerInfoBuilder_ == null) {
          mapLayerInfo_ = null;
          onChanged();
        } else {
          mapLayerInfo_ = null;
          mapLayerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder getMapLayerInfoBuilder() {
        
        onChanged();
        return getMapLayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder getMapLayerInfoOrBuilder() {
        if (mapLayerInfoBuilder_ != null) {
          return mapLayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return mapLayerInfo_ == null ?
              emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.getDefaultInstance() : mapLayerInfo_;
        }
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder> 
          getMapLayerInfoFieldBuilder() {
        if (mapLayerInfoBuilder_ == null) {
          mapLayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder>(
                  getMapLayerInfo(),
                  getParentForChildren(),
                  isClean());
          mapLayerInfo_ = null;
        }
        return mapLayerInfoBuilder_;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 12;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 12;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool is_locked = 2;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool is_locked = 2;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {
        
        isLocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_locked = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {
        
        isLocked_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList sceneTagIdList_ = emptyIntList();
      private void ensureSceneTagIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_ = mutableCopy(sceneTagIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 7;</code>
       * @return A list containing the sceneTagIdList.
       */
      public java.util.List<java.lang.Integer>
          getSceneTagIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(sceneTagIdList_) : sceneTagIdList_;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 7;</code>
       * @return The count of sceneTagIdList.
       */
      public int getSceneTagIdListCount() {
        return sceneTagIdList_.size();
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The sceneTagIdList at the given index.
       */
      public int getSceneTagIdList(int index) {
        return sceneTagIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The sceneTagIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTagIdList(
          int index, int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 7;</code>
       * @param value The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSceneTagIdList(int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 7;</code>
       * @param values The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSceneTagIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSceneTagIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sceneTagIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTagIdList() {
        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:PlayerWorldSceneInfo)
    }

    // @@protoc_insertion_point(class_scope:PlayerWorldSceneInfo)
    private static final emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo();
    }

    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerWorldSceneInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayerWorldSceneInfo>() {
      @java.lang.Override
      public PlayerWorldSceneInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerWorldSceneInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerWorldSceneInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerWorldSceneInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerWorldSceneInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PlayerWorldSceneInfo.proto\032\022MapLayerIn" +
      "fo.proto\"}\n\024PlayerWorldSceneInfo\022%\n\016map_" +
      "layer_info\030\001 \001(\0132\r.MapLayerInfo\022\020\n\010scene" +
      "_id\030\014 \001(\r\022\021\n\tis_locked\030\002 \001(\010\022\031\n\021scene_ta" +
      "g_id_list\030\007 \003(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MapLayerInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerWorldSceneInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerWorldSceneInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerWorldSceneInfo_descriptor,
        new java.lang.String[] { "MapLayerInfo", "SceneId", "IsLocked", "SceneTagIdList", });
    emu.grasscutter.net.proto.MapLayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
