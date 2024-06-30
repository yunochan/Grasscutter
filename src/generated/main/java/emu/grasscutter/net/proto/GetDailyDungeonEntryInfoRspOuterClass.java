// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetDailyDungeonEntryInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetDailyDungeonEntryInfoRspOuterClass {
  private GetDailyDungeonEntryInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetDailyDungeonEntryInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetDailyDungeonEntryInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> 
        getDailyDungeonInfoListList();
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo getDailyDungeonInfoList(int index);
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    int getDailyDungeonInfoListCount();
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> 
        getDailyDungeonInfoListOrBuilderList();
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder getDailyDungeonInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 674
   * Obf: OENGIKKHMHC
   * </pre>
   *
   * Protobuf type {@code GetDailyDungeonEntryInfoRsp}
   */
  public static final class GetDailyDungeonEntryInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetDailyDungeonEntryInfoRsp)
      GetDailyDungeonEntryInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetDailyDungeonEntryInfoRsp.newBuilder() to construct.
    private GetDailyDungeonEntryInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetDailyDungeonEntryInfoRsp() {
      dailyDungeonInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetDailyDungeonEntryInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp.class, emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int DAILY_DUNGEON_INFO_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> dailyDungeonInfoList_;
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> getDailyDungeonInfoListList() {
      return dailyDungeonInfoList_;
    }
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> 
        getDailyDungeonInfoListOrBuilderList() {
      return dailyDungeonInfoList_;
    }
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    @java.lang.Override
    public int getDailyDungeonInfoListCount() {
      return dailyDungeonInfoList_.size();
    }
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo getDailyDungeonInfoList(int index) {
      return dailyDungeonInfoList_.get(index);
    }
    /**
     * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder getDailyDungeonInfoListOrBuilder(
        int index) {
      return dailyDungeonInfoList_.get(index);
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
      for (int i = 0; i < dailyDungeonInfoList_.size(); i++) {
        output.writeMessage(7, dailyDungeonInfoList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < dailyDungeonInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, dailyDungeonInfoList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp other = (emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getDailyDungeonInfoListList()
          .equals(other.getDailyDungeonInfoListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getDailyDungeonInfoListCount() > 0) {
        hash = (37 * hash) + DAILY_DUNGEON_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDailyDungeonInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp prototype) {
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
     * CmdId: 674
     * Obf: OENGIKKHMHC
     * </pre>
     *
     * Protobuf type {@code GetDailyDungeonEntryInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetDailyDungeonEntryInfoRsp)
        emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp.class, emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (dailyDungeonInfoListBuilder_ == null) {
          dailyDungeonInfoList_ = java.util.Collections.emptyList();
        } else {
          dailyDungeonInfoList_ = null;
          dailyDungeonInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp build() {
        emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp result = new emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (dailyDungeonInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            dailyDungeonInfoList_ = java.util.Collections.unmodifiableList(dailyDungeonInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.dailyDungeonInfoList_ = dailyDungeonInfoList_;
        } else {
          result.dailyDungeonInfoList_ = dailyDungeonInfoListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (dailyDungeonInfoListBuilder_ == null) {
          if (!other.dailyDungeonInfoList_.isEmpty()) {
            if (dailyDungeonInfoList_.isEmpty()) {
              dailyDungeonInfoList_ = other.dailyDungeonInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDailyDungeonInfoListIsMutable();
              dailyDungeonInfoList_.addAll(other.dailyDungeonInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.dailyDungeonInfoList_.isEmpty()) {
            if (dailyDungeonInfoListBuilder_.isEmpty()) {
              dailyDungeonInfoListBuilder_.dispose();
              dailyDungeonInfoListBuilder_ = null;
              dailyDungeonInfoList_ = other.dailyDungeonInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              dailyDungeonInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDailyDungeonInfoListFieldBuilder() : null;
            } else {
              dailyDungeonInfoListBuilder_.addAllMessages(other.dailyDungeonInfoList_);
            }
          }
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
              case 58: {
                emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.parser(),
                        extensionRegistry);
                if (dailyDungeonInfoListBuilder_ == null) {
                  ensureDailyDungeonInfoListIsMutable();
                  dailyDungeonInfoList_.add(m);
                } else {
                  dailyDungeonInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 58
              case 112: {
                retcode_ = input.readInt32();

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
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> dailyDungeonInfoList_ =
        java.util.Collections.emptyList();
      private void ensureDailyDungeonInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dailyDungeonInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo>(dailyDungeonInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> dailyDungeonInfoListBuilder_;

      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> getDailyDungeonInfoListList() {
        if (dailyDungeonInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(dailyDungeonInfoList_);
        } else {
          return dailyDungeonInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public int getDailyDungeonInfoListCount() {
        if (dailyDungeonInfoListBuilder_ == null) {
          return dailyDungeonInfoList_.size();
        } else {
          return dailyDungeonInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo getDailyDungeonInfoList(int index) {
        if (dailyDungeonInfoListBuilder_ == null) {
          return dailyDungeonInfoList_.get(index);
        } else {
          return dailyDungeonInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder setDailyDungeonInfoList(
          int index, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo value) {
        if (dailyDungeonInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyDungeonInfoListIsMutable();
          dailyDungeonInfoList_.set(index, value);
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder setDailyDungeonInfoList(
          int index, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder builderForValue) {
        if (dailyDungeonInfoListBuilder_ == null) {
          ensureDailyDungeonInfoListIsMutable();
          dailyDungeonInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder addDailyDungeonInfoList(emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo value) {
        if (dailyDungeonInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyDungeonInfoListIsMutable();
          dailyDungeonInfoList_.add(value);
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder addDailyDungeonInfoList(
          int index, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo value) {
        if (dailyDungeonInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyDungeonInfoListIsMutable();
          dailyDungeonInfoList_.add(index, value);
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder addDailyDungeonInfoList(
          emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder builderForValue) {
        if (dailyDungeonInfoListBuilder_ == null) {
          ensureDailyDungeonInfoListIsMutable();
          dailyDungeonInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder addDailyDungeonInfoList(
          int index, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder builderForValue) {
        if (dailyDungeonInfoListBuilder_ == null) {
          ensureDailyDungeonInfoListIsMutable();
          dailyDungeonInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder addAllDailyDungeonInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> values) {
        if (dailyDungeonInfoListBuilder_ == null) {
          ensureDailyDungeonInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, dailyDungeonInfoList_);
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder clearDailyDungeonInfoList() {
        if (dailyDungeonInfoListBuilder_ == null) {
          dailyDungeonInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public Builder removeDailyDungeonInfoList(int index) {
        if (dailyDungeonInfoListBuilder_ == null) {
          ensureDailyDungeonInfoListIsMutable();
          dailyDungeonInfoList_.remove(index);
          onChanged();
        } else {
          dailyDungeonInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder getDailyDungeonInfoListBuilder(
          int index) {
        return getDailyDungeonInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder getDailyDungeonInfoListOrBuilder(
          int index) {
        if (dailyDungeonInfoListBuilder_ == null) {
          return dailyDungeonInfoList_.get(index);  } else {
          return dailyDungeonInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> 
           getDailyDungeonInfoListOrBuilderList() {
        if (dailyDungeonInfoListBuilder_ != null) {
          return dailyDungeonInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(dailyDungeonInfoList_);
        }
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder addDailyDungeonInfoListBuilder() {
        return getDailyDungeonInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder addDailyDungeonInfoListBuilder(
          int index) {
        return getDailyDungeonInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DailyDungeonEntryInfo daily_dungeon_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder> 
           getDailyDungeonInfoListBuilderList() {
        return getDailyDungeonInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> 
          getDailyDungeonInfoListFieldBuilder() {
        if (dailyDungeonInfoListBuilder_ == null) {
          dailyDungeonInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder, emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder>(
                  dailyDungeonInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          dailyDungeonInfoList_ = null;
        }
        return dailyDungeonInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetDailyDungeonEntryInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetDailyDungeonEntryInfoRsp)
    private static final emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetDailyDungeonEntryInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetDailyDungeonEntryInfoRsp>() {
      @java.lang.Override
      public GetDailyDungeonEntryInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetDailyDungeonEntryInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetDailyDungeonEntryInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetDailyDungeonEntryInfoRspOuterClass.GetDailyDungeonEntryInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetDailyDungeonEntryInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetDailyDungeonEntryInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!GetDailyDungeonEntryInfoRsp.proto\032\033Dai" +
      "lyDungeonEntryInfo.proto\"g\n\033GetDailyDung" +
      "eonEntryInfoRsp\022\017\n\007retcode\030\016 \001(\005\0227\n\027dail" +
      "y_dungeon_info_list\030\007 \003(\0132\026.DailyDungeon" +
      "EntryInfoB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.getDescriptor(),
        });
    internal_static_GetDailyDungeonEntryInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetDailyDungeonEntryInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetDailyDungeonEntryInfoRsp_descriptor,
        new java.lang.String[] { "Retcode", "DailyDungeonInfoList", });
    emu.grasscutter.net.proto.DailyDungeonEntryInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
