// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeFurnitureSuiteData.proto

package emu.grasscutter.net.proto;

public final class HomeFurnitureSuiteDataOuterClass {
  private HomeFurnitureSuiteDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeFurnitureSuiteDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeFurnitureSuiteData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector spawn_pos = 14;</code>
     * @return Whether the spawnPos field is set.
     */
    boolean hasSpawnPos();
    /**
     * <code>.Vector spawn_pos = 14;</code>
     * @return The spawnPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos();
    /**
     * <code>.Vector spawn_pos = 14;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();

    /**
     * <code>uint32 guid = 10;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>uint32 suite_id = 8;</code>
     * @return The suiteId.
     */
    int getSuiteId();

    /**
     * <code>repeated int32 included_furniture_index_list = 3;</code>
     * @return A list containing the includedFurnitureIndexList.
     */
    java.util.List<java.lang.Integer> getIncludedFurnitureIndexListList();
    /**
     * <code>repeated int32 included_furniture_index_list = 3;</code>
     * @return The count of includedFurnitureIndexList.
     */
    int getIncludedFurnitureIndexListCount();
    /**
     * <code>repeated int32 included_furniture_index_list = 3;</code>
     * @param index The index of the element to return.
     * @return The includedFurnitureIndexList at the given index.
     */
    int getIncludedFurnitureIndexList(int index);

    /**
     * <code>bool is_allow_summon = 7;</code>
     * @return The isAllowSummon.
     */
    boolean getIsAllowSummon();
  }
  /**
   * <pre>
   * Obf: EKELBKHKMLP
   * </pre>
   *
   * Protobuf type {@code HomeFurnitureSuiteData}
   */
  public static final class HomeFurnitureSuiteData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeFurnitureSuiteData)
      HomeFurnitureSuiteDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeFurnitureSuiteData.newBuilder() to construct.
    private HomeFurnitureSuiteData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeFurnitureSuiteData() {
      includedFurnitureIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeFurnitureSuiteData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.class, emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder.class);
    }

    public static final int SPAWN_POS_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector spawnPos_;
    /**
     * <code>.Vector spawn_pos = 14;</code>
     * @return Whether the spawnPos field is set.
     */
    @java.lang.Override
    public boolean hasSpawnPos() {
      return spawnPos_ != null;
    }
    /**
     * <code>.Vector spawn_pos = 14;</code>
     * @return The spawnPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos() {
      return spawnPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
    }
    /**
     * <code>.Vector spawn_pos = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
      return getSpawnPos();
    }

    public static final int GUID_FIELD_NUMBER = 10;
    private int guid_;
    /**
     * <code>uint32 guid = 10;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    public static final int SUITE_ID_FIELD_NUMBER = 8;
    private int suiteId_;
    /**
     * <code>uint32 suite_id = 8;</code>
     * @return The suiteId.
     */
    @java.lang.Override
    public int getSuiteId() {
      return suiteId_;
    }

    public static final int INCLUDED_FURNITURE_INDEX_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList includedFurnitureIndexList_;
    /**
     * <code>repeated int32 included_furniture_index_list = 3;</code>
     * @return A list containing the includedFurnitureIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getIncludedFurnitureIndexListList() {
      return includedFurnitureIndexList_;
    }
    /**
     * <code>repeated int32 included_furniture_index_list = 3;</code>
     * @return The count of includedFurnitureIndexList.
     */
    public int getIncludedFurnitureIndexListCount() {
      return includedFurnitureIndexList_.size();
    }
    /**
     * <code>repeated int32 included_furniture_index_list = 3;</code>
     * @param index The index of the element to return.
     * @return The includedFurnitureIndexList at the given index.
     */
    public int getIncludedFurnitureIndexList(int index) {
      return includedFurnitureIndexList_.getInt(index);
    }
    private int includedFurnitureIndexListMemoizedSerializedSize = -1;

    public static final int IS_ALLOW_SUMMON_FIELD_NUMBER = 7;
    private boolean isAllowSummon_;
    /**
     * <code>bool is_allow_summon = 7;</code>
     * @return The isAllowSummon.
     */
    @java.lang.Override
    public boolean getIsAllowSummon() {
      return isAllowSummon_;
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
      getSerializedSize();
      if (getIncludedFurnitureIndexListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(includedFurnitureIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < includedFurnitureIndexList_.size(); i++) {
        output.writeInt32NoTag(includedFurnitureIndexList_.getInt(i));
      }
      if (isAllowSummon_ != false) {
        output.writeBool(7, isAllowSummon_);
      }
      if (suiteId_ != 0) {
        output.writeUInt32(8, suiteId_);
      }
      if (guid_ != 0) {
        output.writeUInt32(10, guid_);
      }
      if (spawnPos_ != null) {
        output.writeMessage(14, getSpawnPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < includedFurnitureIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(includedFurnitureIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getIncludedFurnitureIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        includedFurnitureIndexListMemoizedSerializedSize = dataSize;
      }
      if (isAllowSummon_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isAllowSummon_);
      }
      if (suiteId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, suiteId_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, guid_);
      }
      if (spawnPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getSpawnPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData other = (emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData) obj;

      if (hasSpawnPos() != other.hasSpawnPos()) return false;
      if (hasSpawnPos()) {
        if (!getSpawnPos()
            .equals(other.getSpawnPos())) return false;
      }
      if (getGuid()
          != other.getGuid()) return false;
      if (getSuiteId()
          != other.getSuiteId()) return false;
      if (!getIncludedFurnitureIndexListList()
          .equals(other.getIncludedFurnitureIndexListList())) return false;
      if (getIsAllowSummon()
          != other.getIsAllowSummon()) return false;
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
      if (hasSpawnPos()) {
        hash = (37 * hash) + SPAWN_POS_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnPos().hashCode();
      }
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (37 * hash) + SUITE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSuiteId();
      if (getIncludedFurnitureIndexListCount() > 0) {
        hash = (37 * hash) + INCLUDED_FURNITURE_INDEX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getIncludedFurnitureIndexListList().hashCode();
      }
      hash = (37 * hash) + IS_ALLOW_SUMMON_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllowSummon());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData prototype) {
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
     * Obf: EKELBKHKMLP
     * </pre>
     *
     * Protobuf type {@code HomeFurnitureSuiteData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeFurnitureSuiteData)
        emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.class, emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }
        guid_ = 0;

        suiteId_ = 0;

        includedFurnitureIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isAllowSummon_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData build() {
        emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData buildPartial() {
        emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData result = new emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData(this);
        int from_bitField0_ = bitField0_;
        if (spawnPosBuilder_ == null) {
          result.spawnPos_ = spawnPos_;
        } else {
          result.spawnPos_ = spawnPosBuilder_.build();
        }
        result.guid_ = guid_;
        result.suiteId_ = suiteId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          includedFurnitureIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.includedFurnitureIndexList_ = includedFurnitureIndexList_;
        result.isAllowSummon_ = isAllowSummon_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData) {
          return mergeFrom((emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData other) {
        if (other == emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData.getDefaultInstance()) return this;
        if (other.hasSpawnPos()) {
          mergeSpawnPos(other.getSpawnPos());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        if (other.getSuiteId() != 0) {
          setSuiteId(other.getSuiteId());
        }
        if (!other.includedFurnitureIndexList_.isEmpty()) {
          if (includedFurnitureIndexList_.isEmpty()) {
            includedFurnitureIndexList_ = other.includedFurnitureIndexList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIncludedFurnitureIndexListIsMutable();
            includedFurnitureIndexList_.addAll(other.includedFurnitureIndexList_);
          }
          onChanged();
        }
        if (other.getIsAllowSummon() != false) {
          setIsAllowSummon(other.getIsAllowSummon());
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
              case 24: {
                int v = input.readInt32();
                ensureIncludedFurnitureIndexListIsMutable();
                includedFurnitureIndexList_.addInt(v);
                break;
              } // case 24
              case 26: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureIncludedFurnitureIndexListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  includedFurnitureIndexList_.addInt(input.readInt32());
                }
                input.popLimit(limit);
                break;
              } // case 26
              case 56: {
                isAllowSummon_ = input.readBool();

                break;
              } // case 56
              case 64: {
                suiteId_ = input.readUInt32();

                break;
              } // case 64
              case 80: {
                guid_ = input.readUInt32();

                break;
              } // case 80
              case 114: {
                input.readMessage(
                    getSpawnPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 114
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

      private emu.grasscutter.net.proto.VectorOuterClass.Vector spawnPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
      /**
       * <code>.Vector spawn_pos = 14;</code>
       * @return Whether the spawnPos field is set.
       */
      public boolean hasSpawnPos() {
        return spawnPosBuilder_ != null || spawnPos_ != null;
      }
      /**
       * <code>.Vector spawn_pos = 14;</code>
       * @return The spawnPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos() {
        if (spawnPosBuilder_ == null) {
          return spawnPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        } else {
          return spawnPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_pos = 14;</code>
       */
      public Builder setSpawnPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnPos_ = value;
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 14;</code>
       */
      public Builder setSpawnPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = builderForValue.build();
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 14;</code>
       */
      public Builder mergeSpawnPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (spawnPos_ != null) {
            spawnPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(spawnPos_).mergeFrom(value).buildPartial();
          } else {
            spawnPos_ = value;
          }
          onChanged();
        } else {
          spawnPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 14;</code>
       */
      public Builder clearSpawnPos() {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
          onChanged();
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
        
        onChanged();
        return getSpawnPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_pos = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
        if (spawnPosBuilder_ != null) {
          return spawnPosBuilder_.getMessageOrBuilder();
        } else {
          return spawnPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        }
      }
      /**
       * <code>.Vector spawn_pos = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnPosFieldBuilder() {
        if (spawnPosBuilder_ == null) {
          spawnPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnPos(),
                  getParentForChildren(),
                  isClean());
          spawnPos_ = null;
        }
        return spawnPosBuilder_;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 10;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 10;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
        onChanged();
        return this;
      }

      private int suiteId_ ;
      /**
       * <code>uint32 suite_id = 8;</code>
       * @return The suiteId.
       */
      @java.lang.Override
      public int getSuiteId() {
        return suiteId_;
      }
      /**
       * <code>uint32 suite_id = 8;</code>
       * @param value The suiteId to set.
       * @return This builder for chaining.
       */
      public Builder setSuiteId(int value) {
        
        suiteId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 suite_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuiteId() {
        
        suiteId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList includedFurnitureIndexList_ = emptyIntList();
      private void ensureIncludedFurnitureIndexListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          includedFurnitureIndexList_ = mutableCopy(includedFurnitureIndexList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 3;</code>
       * @return A list containing the includedFurnitureIndexList.
       */
      public java.util.List<java.lang.Integer>
          getIncludedFurnitureIndexListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(includedFurnitureIndexList_) : includedFurnitureIndexList_;
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 3;</code>
       * @return The count of includedFurnitureIndexList.
       */
      public int getIncludedFurnitureIndexListCount() {
        return includedFurnitureIndexList_.size();
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 3;</code>
       * @param index The index of the element to return.
       * @return The includedFurnitureIndexList at the given index.
       */
      public int getIncludedFurnitureIndexList(int index) {
        return includedFurnitureIndexList_.getInt(index);
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The includedFurnitureIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setIncludedFurnitureIndexList(
          int index, int value) {
        ensureIncludedFurnitureIndexListIsMutable();
        includedFurnitureIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 3;</code>
       * @param value The includedFurnitureIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addIncludedFurnitureIndexList(int value) {
        ensureIncludedFurnitureIndexListIsMutable();
        includedFurnitureIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 3;</code>
       * @param values The includedFurnitureIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllIncludedFurnitureIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureIncludedFurnitureIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, includedFurnitureIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 included_furniture_index_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIncludedFurnitureIndexList() {
        includedFurnitureIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isAllowSummon_ ;
      /**
       * <code>bool is_allow_summon = 7;</code>
       * @return The isAllowSummon.
       */
      @java.lang.Override
      public boolean getIsAllowSummon() {
        return isAllowSummon_;
      }
      /**
       * <code>bool is_allow_summon = 7;</code>
       * @param value The isAllowSummon to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllowSummon(boolean value) {
        
        isAllowSummon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_allow_summon = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllowSummon() {
        
        isAllowSummon_ = false;
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


      // @@protoc_insertion_point(builder_scope:HomeFurnitureSuiteData)
    }

    // @@protoc_insertion_point(class_scope:HomeFurnitureSuiteData)
    private static final emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData();
    }

    public static emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeFurnitureSuiteData>
        PARSER = new com.google.protobuf.AbstractParser<HomeFurnitureSuiteData>() {
      @java.lang.Override
      public HomeFurnitureSuiteData parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeFurnitureSuiteData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeFurnitureSuiteData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFurnitureSuiteDataOuterClass.HomeFurnitureSuiteData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeFurnitureSuiteData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeFurnitureSuiteData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeFurnitureSuiteData.proto\032\014Vector.p" +
      "roto\"\224\001\n\026HomeFurnitureSuiteData\022\032\n\tspawn" +
      "_pos\030\016 \001(\0132\007.Vector\022\014\n\004guid\030\n \001(\r\022\020\n\010sui" +
      "te_id\030\010 \001(\r\022%\n\035included_furniture_index_" +
      "list\030\003 \003(\005\022\027\n\017is_allow_summon\030\007 \001(\010B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_HomeFurnitureSuiteData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeFurnitureSuiteData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeFurnitureSuiteData_descriptor,
        new java.lang.String[] { "SpawnPos", "Guid", "SuiteId", "IncludedFurnitureIndexList", "IsAllowSummon", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
