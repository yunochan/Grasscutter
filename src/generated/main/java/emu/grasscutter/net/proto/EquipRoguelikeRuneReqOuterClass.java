// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EquipRoguelikeRuneReq.proto

package emu.grasscutter.net.proto;

public final class EquipRoguelikeRuneReqOuterClass {
  private EquipRoguelikeRuneReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EquipRoguelikeRuneReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EquipRoguelikeRuneReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 rune_list = 13;</code>
     * @return A list containing the runeList.
     */
    java.util.List<java.lang.Integer> getRuneListList();
    /**
     * <code>repeated uint32 rune_list = 13;</code>
     * @return The count of runeList.
     */
    int getRuneListCount();
    /**
     * <code>repeated uint32 rune_list = 13;</code>
     * @param index The index of the element to return.
     * @return The runeList at the given index.
     */
    int getRuneList(int index);
  }
  /**
   * <pre>
   * CmdId: 5188
   * Obf: ELNJIICIBLI
   * </pre>
   *
   * Protobuf type {@code EquipRoguelikeRuneReq}
   */
  public static final class EquipRoguelikeRuneReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EquipRoguelikeRuneReq)
      EquipRoguelikeRuneReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EquipRoguelikeRuneReq.newBuilder() to construct.
    private EquipRoguelikeRuneReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EquipRoguelikeRuneReq() {
      runeList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EquipRoguelikeRuneReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.internal_static_EquipRoguelikeRuneReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.internal_static_EquipRoguelikeRuneReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq.class, emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq.Builder.class);
    }

    public static final int RUNE_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList runeList_;
    /**
     * <code>repeated uint32 rune_list = 13;</code>
     * @return A list containing the runeList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRuneListList() {
      return runeList_;
    }
    /**
     * <code>repeated uint32 rune_list = 13;</code>
     * @return The count of runeList.
     */
    public int getRuneListCount() {
      return runeList_.size();
    }
    /**
     * <code>repeated uint32 rune_list = 13;</code>
     * @param index The index of the element to return.
     * @return The runeList at the given index.
     */
    public int getRuneList(int index) {
      return runeList_.getInt(index);
    }
    private int runeListMemoizedSerializedSize = -1;

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
      if (getRuneListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(runeListMemoizedSerializedSize);
      }
      for (int i = 0; i < runeList_.size(); i++) {
        output.writeUInt32NoTag(runeList_.getInt(i));
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
        for (int i = 0; i < runeList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(runeList_.getInt(i));
        }
        size += dataSize;
        if (!getRuneListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        runeListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq other = (emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq) obj;

      if (!getRuneListList()
          .equals(other.getRuneListList())) return false;
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
      if (getRuneListCount() > 0) {
        hash = (37 * hash) + RUNE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRuneListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq prototype) {
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
     * CmdId: 5188
     * Obf: ELNJIICIBLI
     * </pre>
     *
     * Protobuf type {@code EquipRoguelikeRuneReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EquipRoguelikeRuneReq)
        emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.internal_static_EquipRoguelikeRuneReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.internal_static_EquipRoguelikeRuneReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq.class, emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        runeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.internal_static_EquipRoguelikeRuneReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq build() {
        emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq buildPartial() {
        emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq result = new emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          runeList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.runeList_ = runeList_;
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
        if (other instanceof emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq) {
          return mergeFrom((emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq other) {
        if (other == emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq.getDefaultInstance()) return this;
        if (!other.runeList_.isEmpty()) {
          if (runeList_.isEmpty()) {
            runeList_ = other.runeList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRuneListIsMutable();
            runeList_.addAll(other.runeList_);
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
              case 104: {
                int v = input.readUInt32();
                ensureRuneListIsMutable();
                runeList_.addInt(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureRuneListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  runeList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
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
      private int bitField0_;

      private com.google.protobuf.Internal.IntList runeList_ = emptyIntList();
      private void ensureRuneListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          runeList_ = mutableCopy(runeList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 rune_list = 13;</code>
       * @return A list containing the runeList.
       */
      public java.util.List<java.lang.Integer>
          getRuneListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(runeList_) : runeList_;
      }
      /**
       * <code>repeated uint32 rune_list = 13;</code>
       * @return The count of runeList.
       */
      public int getRuneListCount() {
        return runeList_.size();
      }
      /**
       * <code>repeated uint32 rune_list = 13;</code>
       * @param index The index of the element to return.
       * @return The runeList at the given index.
       */
      public int getRuneList(int index) {
        return runeList_.getInt(index);
      }
      /**
       * <code>repeated uint32 rune_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The runeList to set.
       * @return This builder for chaining.
       */
      public Builder setRuneList(
          int index, int value) {
        ensureRuneListIsMutable();
        runeList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rune_list = 13;</code>
       * @param value The runeList to add.
       * @return This builder for chaining.
       */
      public Builder addRuneList(int value) {
        ensureRuneListIsMutable();
        runeList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rune_list = 13;</code>
       * @param values The runeList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRuneList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRuneListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, runeList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rune_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRuneList() {
        runeList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:EquipRoguelikeRuneReq)
    }

    // @@protoc_insertion_point(class_scope:EquipRoguelikeRuneReq)
    private static final emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq();
    }

    public static emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EquipRoguelikeRuneReq>
        PARSER = new com.google.protobuf.AbstractParser<EquipRoguelikeRuneReq>() {
      @java.lang.Override
      public EquipRoguelikeRuneReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<EquipRoguelikeRuneReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EquipRoguelikeRuneReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EquipRoguelikeRuneReqOuterClass.EquipRoguelikeRuneReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EquipRoguelikeRuneReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EquipRoguelikeRuneReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EquipRoguelikeRuneReq.proto\"*\n\025EquipRo" +
      "guelikeRuneReq\022\021\n\trune_list\030\r \003(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EquipRoguelikeRuneReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EquipRoguelikeRuneReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EquipRoguelikeRuneReq_descriptor,
        new java.lang.String[] { "RuneList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
