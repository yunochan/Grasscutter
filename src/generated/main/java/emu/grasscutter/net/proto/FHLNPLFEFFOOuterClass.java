// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FHLNPLFEFFO.proto

package emu.grasscutter.net.proto;

public final class FHLNPLFEFFOOuterClass {
  private FHLNPLFEFFOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FHLNPLFEFFOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FHLNPLFEFFO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM> 
        getLevelInfoListList();
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM getLevelInfoList(int index);
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    int getLevelInfoListCount();
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder> 
        getLevelInfoListOrBuilderList();
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder getLevelInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code FHLNPLFEFFO}
   */
  public static final class FHLNPLFEFFO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FHLNPLFEFFO)
      FHLNPLFEFFOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FHLNPLFEFFO.newBuilder() to construct.
    private FHLNPLFEFFO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FHLNPLFEFFO() {
      levelInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FHLNPLFEFFO();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.internal_static_FHLNPLFEFFO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.internal_static_FHLNPLFEFFO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO.class, emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO.Builder.class);
    }

    public static final int LEVEL_INFO_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM> levelInfoList_;
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM> getLevelInfoListList() {
      return levelInfoList_;
    }
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder> 
        getLevelInfoListOrBuilderList() {
      return levelInfoList_;
    }
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    @java.lang.Override
    public int getLevelInfoListCount() {
      return levelInfoList_.size();
    }
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM getLevelInfoList(int index) {
      return levelInfoList_.get(index);
    }
    /**
     * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder getLevelInfoListOrBuilder(
        int index) {
      return levelInfoList_.get(index);
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
      for (int i = 0; i < levelInfoList_.size(); i++) {
        output.writeMessage(2, levelInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < levelInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, levelInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO other = (emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO) obj;

      if (!getLevelInfoListList()
          .equals(other.getLevelInfoListList())) return false;
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
      if (getLevelInfoListCount() > 0) {
        hash = (37 * hash) + LEVEL_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLevelInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO prototype) {
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
     * Protobuf type {@code FHLNPLFEFFO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FHLNPLFEFFO)
        emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.internal_static_FHLNPLFEFFO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.internal_static_FHLNPLFEFFO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO.class, emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (levelInfoListBuilder_ == null) {
          levelInfoList_ = java.util.Collections.emptyList();
        } else {
          levelInfoList_ = null;
          levelInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.internal_static_FHLNPLFEFFO_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO build() {
        emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO buildPartial() {
        emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO result = new emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO(this);
        int from_bitField0_ = bitField0_;
        if (levelInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            levelInfoList_ = java.util.Collections.unmodifiableList(levelInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.levelInfoList_ = levelInfoList_;
        } else {
          result.levelInfoList_ = levelInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO) {
          return mergeFrom((emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO other) {
        if (other == emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO.getDefaultInstance()) return this;
        if (levelInfoListBuilder_ == null) {
          if (!other.levelInfoList_.isEmpty()) {
            if (levelInfoList_.isEmpty()) {
              levelInfoList_ = other.levelInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLevelInfoListIsMutable();
              levelInfoList_.addAll(other.levelInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.levelInfoList_.isEmpty()) {
            if (levelInfoListBuilder_.isEmpty()) {
              levelInfoListBuilder_.dispose();
              levelInfoListBuilder_ = null;
              levelInfoList_ = other.levelInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              levelInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLevelInfoListFieldBuilder() : null;
            } else {
              levelInfoListBuilder_.addAllMessages(other.levelInfoList_);
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
              case 18: {
                emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM m =
                    input.readMessage(
                        emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.parser(),
                        extensionRegistry);
                if (levelInfoListBuilder_ == null) {
                  ensureLevelInfoListIsMutable();
                  levelInfoList_.add(m);
                } else {
                  levelInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 18
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

      private java.util.List<emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM> levelInfoList_ =
        java.util.Collections.emptyList();
      private void ensureLevelInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          levelInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM>(levelInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder> levelInfoListBuilder_;

      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM> getLevelInfoListList() {
        if (levelInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(levelInfoList_);
        } else {
          return levelInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public int getLevelInfoListCount() {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.size();
        } else {
          return levelInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM getLevelInfoList(int index) {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.get(index);
        } else {
          return levelInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder setLevelInfoList(
          int index, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.set(index, value);
          onChanged();
        } else {
          levelInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder setLevelInfoList(
          int index, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder addLevelInfoList(emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(value);
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder addLevelInfoList(
          int index, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(index, value);
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder addLevelInfoList(
          emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder addLevelInfoList(
          int index, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder addAllLevelInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM> values) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, levelInfoList_);
          onChanged();
        } else {
          levelInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder clearLevelInfoList() {
        if (levelInfoListBuilder_ == null) {
          levelInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          levelInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public Builder removeLevelInfoList(int index) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.remove(index);
          onChanged();
        } else {
          levelInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder getLevelInfoListBuilder(
          int index) {
        return getLevelInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder getLevelInfoListOrBuilder(
          int index) {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.get(index);  } else {
          return levelInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder> 
           getLevelInfoListOrBuilderList() {
        if (levelInfoListBuilder_ != null) {
          return levelInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(levelInfoList_);
        }
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder addLevelInfoListBuilder() {
        return getLevelInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.getDefaultInstance());
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder addLevelInfoListBuilder(
          int index) {
        return getLevelInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.getDefaultInstance());
      }
      /**
       * <code>repeated .LFCGDMNBBKM level_info_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder> 
           getLevelInfoListBuilderList() {
        return getLevelInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder> 
          getLevelInfoListFieldBuilder() {
        if (levelInfoListBuilder_ == null) {
          levelInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder>(
                  levelInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          levelInfoList_ = null;
        }
        return levelInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FHLNPLFEFFO)
    }

    // @@protoc_insertion_point(class_scope:FHLNPLFEFFO)
    private static final emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO();
    }

    public static emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FHLNPLFEFFO>
        PARSER = new com.google.protobuf.AbstractParser<FHLNPLFEFFO>() {
      @java.lang.Override
      public FHLNPLFEFFO parsePartialFrom(
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

    public static com.google.protobuf.Parser<FHLNPLFEFFO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FHLNPLFEFFO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FHLNPLFEFFOOuterClass.FHLNPLFEFFO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FHLNPLFEFFO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FHLNPLFEFFO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FHLNPLFEFFO.proto\032\021LFCGDMNBBKM.proto\"4" +
      "\n\013FHLNPLFEFFO\022%\n\017level_info_list\030\002 \003(\0132\014" +
      ".LFCGDMNBBKMB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.getDescriptor(),
        });
    internal_static_FHLNPLFEFFO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FHLNPLFEFFO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FHLNPLFEFFO_descriptor,
        new java.lang.String[] { "LevelInfoList", });
    emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
