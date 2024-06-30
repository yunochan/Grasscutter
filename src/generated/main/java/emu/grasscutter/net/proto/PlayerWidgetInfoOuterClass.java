// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerWidgetInfo.proto

package emu.grasscutter.net.proto;

public final class PlayerWidgetInfoOuterClass {
  private PlayerWidgetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerWidgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerWidgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> 
        getSlotListList();
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index);
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    int getSlotListCount();
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
        getSlotListOrBuilderList();
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
        int index);

    /**
     * <code>uint32 uid = 6;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * Obf: IEIPNDOKJIG
   * </pre>
   *
   * Protobuf type {@code PlayerWidgetInfo}
   */
  public static final class PlayerWidgetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerWidgetInfo)
      PlayerWidgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerWidgetInfo.newBuilder() to construct.
    private PlayerWidgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerWidgetInfo() {
      slotList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerWidgetInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.class, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder.class);
    }

    public static final int SLOT_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
      return slotList_;
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
        getSlotListOrBuilderList() {
      return slotList_;
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    @java.lang.Override
    public int getSlotListCount() {
      return slotList_.size();
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index) {
      return slotList_.get(index);
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
        int index) {
      return slotList_.get(index);
    }

    public static final int UID_FIELD_NUMBER = 6;
    private int uid_;
    /**
     * <code>uint32 uid = 6;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (uid_ != 0) {
        output.writeUInt32(6, uid_);
      }
      for (int i = 0; i < slotList_.size(); i++) {
        output.writeMessage(15, slotList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, uid_);
      }
      for (int i = 0; i < slotList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, slotList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo other = (emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo) obj;

      if (!getSlotListList()
          .equals(other.getSlotListList())) return false;
      if (getUid()
          != other.getUid()) return false;
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
      if (getSlotListCount() > 0) {
        hash = (37 * hash) + SLOT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSlotListList().hashCode();
      }
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo prototype) {
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
     * Obf: IEIPNDOKJIG
     * </pre>
     *
     * Protobuf type {@code PlayerWidgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerWidgetInfo)
        emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.class, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (slotListBuilder_ == null) {
          slotList_ = java.util.Collections.emptyList();
        } else {
          slotList_ = null;
          slotListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.internal_static_PlayerWidgetInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo build() {
        emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo buildPartial() {
        emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo result = new emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo(this);
        int from_bitField0_ = bitField0_;
        if (slotListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            slotList_ = java.util.Collections.unmodifiableList(slotList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.slotList_ = slotList_;
        } else {
          result.slotList_ = slotListBuilder_.build();
        }
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo other) {
        if (other == emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.getDefaultInstance()) return this;
        if (slotListBuilder_ == null) {
          if (!other.slotList_.isEmpty()) {
            if (slotList_.isEmpty()) {
              slotList_ = other.slotList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSlotListIsMutable();
              slotList_.addAll(other.slotList_);
            }
            onChanged();
          }
        } else {
          if (!other.slotList_.isEmpty()) {
            if (slotListBuilder_.isEmpty()) {
              slotListBuilder_.dispose();
              slotListBuilder_ = null;
              slotList_ = other.slotList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              slotListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSlotListFieldBuilder() : null;
            } else {
              slotListBuilder_.addAllMessages(other.slotList_);
            }
          }
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
                uid_ = input.readUInt32();

                break;
              } // case 48
              case 122: {
                emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData m =
                    input.readMessage(
                        emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.parser(),
                        extensionRegistry);
                if (slotListBuilder_ == null) {
                  ensureSlotListIsMutable();
                  slotList_.add(m);
                } else {
                  slotListBuilder_.addMessage(m);
                }
                break;
              } // case 122
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

      private java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> slotList_ =
        java.util.Collections.emptyList();
      private void ensureSlotListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          slotList_ = new java.util.ArrayList<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData>(slotList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> slotListBuilder_;

      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
        if (slotListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(slotList_);
        } else {
          return slotListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public int getSlotListCount() {
        if (slotListBuilder_ == null) {
          return slotList_.size();
        } else {
          return slotListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index) {
        if (slotListBuilder_ == null) {
          return slotList_.get(index);
        } else {
          return slotListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder setSlotList(
          int index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.set(index, value);
          onChanged();
        } else {
          slotListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder setSlotList(
          int index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.set(index, builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder addSlotList(emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.add(value);
          onChanged();
        } else {
          slotListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder addSlotList(
          int index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.add(index, value);
          onChanged();
        } else {
          slotListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder addSlotList(
          emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.add(builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder addSlotList(
          int index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.add(index, builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder addAllSlotList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> values) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, slotList_);
          onChanged();
        } else {
          slotListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder clearSlotList() {
        if (slotListBuilder_ == null) {
          slotList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          slotListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public Builder removeSlotList(int index) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.remove(index);
          onChanged();
        } else {
          slotListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder getSlotListBuilder(
          int index) {
        return getSlotListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
          int index) {
        if (slotListBuilder_ == null) {
          return slotList_.get(index);  } else {
          return slotListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
           getSlotListOrBuilderList() {
        if (slotListBuilder_ != null) {
          return slotListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(slotList_);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder() {
        return getSlotListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder(
          int index) {
        return getSlotListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder> 
           getSlotListBuilderList() {
        return getSlotListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
          getSlotListFieldBuilder() {
        if (slotListBuilder_ == null) {
          slotListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(
                  slotList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          slotList_ = null;
        }
        return slotListBuilder_;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 6;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 6;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerWidgetInfo)
    }

    // @@protoc_insertion_point(class_scope:PlayerWidgetInfo)
    private static final emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo();
    }

    public static emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerWidgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayerWidgetInfo>() {
      @java.lang.Override
      public PlayerWidgetInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerWidgetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerWidgetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerWidgetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerWidgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PlayerWidgetInfo.proto\032\024WidgetSlotData" +
      ".proto\"C\n\020PlayerWidgetInfo\022\"\n\tslot_list\030" +
      "\017 \003(\0132\017.WidgetSlotData\022\013\n\003uid\030\006 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WidgetSlotDataOuterClass.getDescriptor(),
        });
    internal_static_PlayerWidgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerWidgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerWidgetInfo_descriptor,
        new java.lang.String[] { "SlotList", "Uid", });
    emu.grasscutter.net.proto.WidgetSlotDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
