// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetInvestigationMonsterReq.proto

package emu.grasscutter.net.proto;

public final class GetInvestigationMonsterReqOuterClass {
  private GetInvestigationMonsterReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetInvestigationMonsterReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetInvestigationMonsterReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_for_mark = 12;</code>
     * @return The isForMark.
     */
    boolean getIsForMark();

    /**
     * <code>repeated uint32 city_id_list = 6;</code>
     * @return A list containing the cityIdList.
     */
    java.util.List<java.lang.Integer> getCityIdListList();
    /**
     * <code>repeated uint32 city_id_list = 6;</code>
     * @return The count of cityIdList.
     */
    int getCityIdListCount();
    /**
     * <code>repeated uint32 city_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The cityIdList at the given index.
     */
    int getCityIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 23800
   * Obf: DEMDDKHMDFD
   * </pre>
   *
   * Protobuf type {@code GetInvestigationMonsterReq}
   */
  public static final class GetInvestigationMonsterReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetInvestigationMonsterReq)
      GetInvestigationMonsterReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetInvestigationMonsterReq.newBuilder() to construct.
    private GetInvestigationMonsterReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetInvestigationMonsterReq() {
      cityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetInvestigationMonsterReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.class, emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.Builder.class);
    }

    public static final int IS_FOR_MARK_FIELD_NUMBER = 12;
    private boolean isForMark_;
    /**
     * <code>bool is_for_mark = 12;</code>
     * @return The isForMark.
     */
    @java.lang.Override
    public boolean getIsForMark() {
      return isForMark_;
    }

    public static final int CITY_ID_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList cityIdList_;
    /**
     * <code>repeated uint32 city_id_list = 6;</code>
     * @return A list containing the cityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCityIdListList() {
      return cityIdList_;
    }
    /**
     * <code>repeated uint32 city_id_list = 6;</code>
     * @return The count of cityIdList.
     */
    public int getCityIdListCount() {
      return cityIdList_.size();
    }
    /**
     * <code>repeated uint32 city_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The cityIdList at the given index.
     */
    public int getCityIdList(int index) {
      return cityIdList_.getInt(index);
    }
    private int cityIdListMemoizedSerializedSize = -1;

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
      if (getCityIdListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(cityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < cityIdList_.size(); i++) {
        output.writeUInt32NoTag(cityIdList_.getInt(i));
      }
      if (isForMark_ != false) {
        output.writeBool(12, isForMark_);
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
        for (int i = 0; i < cityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getCityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cityIdListMemoizedSerializedSize = dataSize;
      }
      if (isForMark_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isForMark_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq other = (emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq) obj;

      if (getIsForMark()
          != other.getIsForMark()) return false;
      if (!getCityIdListList()
          .equals(other.getCityIdListList())) return false;
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
      hash = (37 * hash) + IS_FOR_MARK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForMark());
      if (getCityIdListCount() > 0) {
        hash = (37 * hash) + CITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCityIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq prototype) {
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
     * CmdId: 23800
     * Obf: DEMDDKHMDFD
     * </pre>
     *
     * Protobuf type {@code GetInvestigationMonsterReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetInvestigationMonsterReq)
        emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.class, emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isForMark_ = false;

        cityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq build() {
        emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq buildPartial() {
        emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq result = new emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq(this);
        int from_bitField0_ = bitField0_;
        result.isForMark_ = isForMark_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cityIdList_ = cityIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq other) {
        if (other == emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.getDefaultInstance()) return this;
        if (other.getIsForMark() != false) {
          setIsForMark(other.getIsForMark());
        }
        if (!other.cityIdList_.isEmpty()) {
          if (cityIdList_.isEmpty()) {
            cityIdList_ = other.cityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCityIdListIsMutable();
            cityIdList_.addAll(other.cityIdList_);
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
              case 48: {
                int v = input.readUInt32();
                ensureCityIdListIsMutable();
                cityIdList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCityIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cityIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 96: {
                isForMark_ = input.readBool();

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

      private boolean isForMark_ ;
      /**
       * <code>bool is_for_mark = 12;</code>
       * @return The isForMark.
       */
      @java.lang.Override
      public boolean getIsForMark() {
        return isForMark_;
      }
      /**
       * <code>bool is_for_mark = 12;</code>
       * @param value The isForMark to set.
       * @return This builder for chaining.
       */
      public Builder setIsForMark(boolean value) {
        
        isForMark_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_for_mark = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForMark() {
        
        isForMark_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList cityIdList_ = emptyIntList();
      private void ensureCityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cityIdList_ = mutableCopy(cityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 city_id_list = 6;</code>
       * @return A list containing the cityIdList.
       */
      public java.util.List<java.lang.Integer>
          getCityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cityIdList_) : cityIdList_;
      }
      /**
       * <code>repeated uint32 city_id_list = 6;</code>
       * @return The count of cityIdList.
       */
      public int getCityIdListCount() {
        return cityIdList_.size();
      }
      /**
       * <code>repeated uint32 city_id_list = 6;</code>
       * @param index The index of the element to return.
       * @return The cityIdList at the given index.
       */
      public int getCityIdList(int index) {
        return cityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 city_id_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The cityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setCityIdList(
          int index, int value) {
        ensureCityIdListIsMutable();
        cityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 6;</code>
       * @param value The cityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addCityIdList(int value) {
        ensureCityIdListIsMutable();
        cityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 6;</code>
       * @param values The cityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityIdList() {
        cityIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GetInvestigationMonsterReq)
    }

    // @@protoc_insertion_point(class_scope:GetInvestigationMonsterReq)
    private static final emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq();
    }

    public static emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetInvestigationMonsterReq>
        PARSER = new com.google.protobuf.AbstractParser<GetInvestigationMonsterReq>() {
      @java.lang.Override
      public GetInvestigationMonsterReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetInvestigationMonsterReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetInvestigationMonsterReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetInvestigationMonsterReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetInvestigationMonsterReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GetInvestigationMonsterReq.proto\"G\n\032Ge" +
      "tInvestigationMonsterReq\022\023\n\013is_for_mark\030" +
      "\014 \001(\010\022\024\n\014city_id_list\030\006 \003(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetInvestigationMonsterReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetInvestigationMonsterReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetInvestigationMonsterReq_descriptor,
        new java.lang.String[] { "IsForMark", "CityIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
