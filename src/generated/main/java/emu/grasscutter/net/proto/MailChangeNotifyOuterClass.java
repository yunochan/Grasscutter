// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MailChangeNotify.proto

package emu.grasscutter.net.proto;

public final class MailChangeNotifyOuterClass {
  private MailChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MailChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MailChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @return A list containing the delMailIdList.
     */
    java.util.List<java.lang.Integer> getDelMailIdListList();
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @return The count of delMailIdList.
     */
    int getDelMailIdListCount();
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The delMailIdList at the given index.
     */
    int getDelMailIdList(int index);

    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> 
        getMailListList();
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    emu.grasscutter.net.proto.MailDataOuterClass.MailData getMailList(int index);
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    int getMailListCount();
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> 
        getMailListOrBuilderList();
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 7569
   * Obf: COPGIOFFCBJ
   * </pre>
   *
   * Protobuf type {@code MailChangeNotify}
   */
  public static final class MailChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MailChangeNotify)
      MailChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MailChangeNotify.newBuilder() to construct.
    private MailChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MailChangeNotify() {
      delMailIdList_ = emptyIntList();
      mailList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MailChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MailChangeNotifyOuterClass.internal_static_MailChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify.class, emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify.Builder.class);
    }

    public static final int DEL_MAIL_ID_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList delMailIdList_;
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @return A list containing the delMailIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDelMailIdListList() {
      return delMailIdList_;
    }
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @return The count of delMailIdList.
     */
    public int getDelMailIdListCount() {
      return delMailIdList_.size();
    }
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The delMailIdList at the given index.
     */
    public int getDelMailIdList(int index) {
      return delMailIdList_.getInt(index);
    }
    private int delMailIdListMemoizedSerializedSize = -1;

    public static final int MAIL_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> mailList_;
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> getMailListList() {
      return mailList_;
    }
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> 
        getMailListOrBuilderList() {
      return mailList_;
    }
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @java.lang.Override
    public int getMailListCount() {
      return mailList_.size();
    }
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MailDataOuterClass.MailData getMailList(int index) {
      return mailList_.get(index);
    }
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
        int index) {
      return mailList_.get(index);
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
      for (int i = 0; i < mailList_.size(); i++) {
        output.writeMessage(3, mailList_.get(i));
      }
      if (getDelMailIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(delMailIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < delMailIdList_.size(); i++) {
        output.writeUInt32NoTag(delMailIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < mailList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, mailList_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < delMailIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(delMailIdList_.getInt(i));
        }
        size += dataSize;
        if (!getDelMailIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        delMailIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify other = (emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify) obj;

      if (!getDelMailIdListList()
          .equals(other.getDelMailIdListList())) return false;
      if (!getMailListList()
          .equals(other.getMailListList())) return false;
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
      if (getDelMailIdListCount() > 0) {
        hash = (37 * hash) + DEL_MAIL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDelMailIdListList().hashCode();
      }
      if (getMailListCount() > 0) {
        hash = (37 * hash) + MAIL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMailListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify prototype) {
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
     * CmdId: 7569
     * Obf: COPGIOFFCBJ
     * </pre>
     *
     * Protobuf type {@code MailChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MailChangeNotify)
        emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MailChangeNotifyOuterClass.internal_static_MailChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify.class, emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        delMailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (mailListBuilder_ == null) {
          mailList_ = java.util.Collections.emptyList();
        } else {
          mailList_ = null;
          mailListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify build() {
        emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify buildPartial() {
        emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify result = new emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          delMailIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.delMailIdList_ = delMailIdList_;
        if (mailListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            mailList_ = java.util.Collections.unmodifiableList(mailList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.mailList_ = mailList_;
        } else {
          result.mailList_ = mailListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify other) {
        if (other == emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify.getDefaultInstance()) return this;
        if (!other.delMailIdList_.isEmpty()) {
          if (delMailIdList_.isEmpty()) {
            delMailIdList_ = other.delMailIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDelMailIdListIsMutable();
            delMailIdList_.addAll(other.delMailIdList_);
          }
          onChanged();
        }
        if (mailListBuilder_ == null) {
          if (!other.mailList_.isEmpty()) {
            if (mailList_.isEmpty()) {
              mailList_ = other.mailList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureMailListIsMutable();
              mailList_.addAll(other.mailList_);
            }
            onChanged();
          }
        } else {
          if (!other.mailList_.isEmpty()) {
            if (mailListBuilder_.isEmpty()) {
              mailListBuilder_.dispose();
              mailListBuilder_ = null;
              mailList_ = other.mailList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              mailListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMailListFieldBuilder() : null;
            } else {
              mailListBuilder_.addAllMessages(other.mailList_);
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
              case 26: {
                emu.grasscutter.net.proto.MailDataOuterClass.MailData m =
                    input.readMessage(
                        emu.grasscutter.net.proto.MailDataOuterClass.MailData.parser(),
                        extensionRegistry);
                if (mailListBuilder_ == null) {
                  ensureMailListIsMutable();
                  mailList_.add(m);
                } else {
                  mailListBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 88: {
                int v = input.readUInt32();
                ensureDelMailIdListIsMutable();
                delMailIdList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureDelMailIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  delMailIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
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

      private com.google.protobuf.Internal.IntList delMailIdList_ = emptyIntList();
      private void ensureDelMailIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          delMailIdList_ = mutableCopy(delMailIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @return A list containing the delMailIdList.
       */
      public java.util.List<java.lang.Integer>
          getDelMailIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(delMailIdList_) : delMailIdList_;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @return The count of delMailIdList.
       */
      public int getDelMailIdListCount() {
        return delMailIdList_.size();
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The delMailIdList at the given index.
       */
      public int getDelMailIdList(int index) {
        return delMailIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The delMailIdList to set.
       * @return This builder for chaining.
       */
      public Builder setDelMailIdList(
          int index, int value) {
        ensureDelMailIdListIsMutable();
        delMailIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @param value The delMailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addDelMailIdList(int value) {
        ensureDelMailIdListIsMutable();
        delMailIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @param values The delMailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDelMailIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDelMailIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, delMailIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelMailIdList() {
        delMailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> mailList_ =
        java.util.Collections.emptyList();
      private void ensureMailListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          mailList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MailDataOuterClass.MailData>(mailList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MailDataOuterClass.MailData, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder, emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> mailListBuilder_;

      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> getMailListList() {
        if (mailListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mailList_);
        } else {
          return mailListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public int getMailListCount() {
        if (mailListBuilder_ == null) {
          return mailList_.size();
        } else {
          return mailListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailData getMailList(int index) {
        if (mailListBuilder_ == null) {
          return mailList_.get(index);
        } else {
          return mailListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder setMailList(
          int index, emu.grasscutter.net.proto.MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.set(index, value);
          onChanged();
        } else {
          mailListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder setMailList(
          int index, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.set(index, builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addMailList(emu.grasscutter.net.proto.MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.add(value);
          onChanged();
        } else {
          mailListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addMailList(
          int index, emu.grasscutter.net.proto.MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.add(index, value);
          onChanged();
        } else {
          mailListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addMailList(
          emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.add(builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addMailList(
          int index, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.add(index, builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addAllMailList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MailDataOuterClass.MailData> values) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, mailList_);
          onChanged();
        } else {
          mailListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder clearMailList() {
        if (mailListBuilder_ == null) {
          mailList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          mailListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder removeMailList(int index) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.remove(index);
          onChanged();
        } else {
          mailListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder getMailListBuilder(
          int index) {
        return getMailListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
          int index) {
        if (mailListBuilder_ == null) {
          return mailList_.get(index);  } else {
          return mailListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> 
           getMailListOrBuilderList() {
        if (mailListBuilder_ != null) {
          return mailListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mailList_);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder addMailListBuilder() {
        return getMailListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MailDataOuterClass.MailData.getDefaultInstance());
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder addMailListBuilder(
          int index) {
        return getMailListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MailDataOuterClass.MailData.getDefaultInstance());
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder> 
           getMailListBuilderList() {
        return getMailListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MailDataOuterClass.MailData, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder, emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> 
          getMailListFieldBuilder() {
        if (mailListBuilder_ == null) {
          mailListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MailDataOuterClass.MailData, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder, emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder>(
                  mailList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          mailList_ = null;
        }
        return mailListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MailChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:MailChangeNotify)
    private static final emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify();
    }

    public static emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MailChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<MailChangeNotify>() {
      @java.lang.Override
      public MailChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MailChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MailChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MailChangeNotifyOuterClass.MailChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MailChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MailChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MailChangeNotify.proto\032\016MailData.proto" +
      "\"J\n\020MailChangeNotify\022\030\n\020del_mail_id_list" +
      "\030\013 \003(\r\022\034\n\tmail_list\030\003 \003(\0132\t.MailDataB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MailDataOuterClass.getDescriptor(),
        });
    internal_static_MailChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MailChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MailChangeNotify_descriptor,
        new java.lang.String[] { "DelMailIdList", "MailList", });
    emu.grasscutter.net.proto.MailDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
