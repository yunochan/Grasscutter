// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DragonSpineChapterInfo.proto

package emu.grasscutter.net.proto;

public final class DragonSpineChapterInfoOuterClass {
  private DragonSpineChapterInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DragonSpineChapterInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DragonSpineChapterInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 finished_mission_num = 10;</code>
     * @return The finishedMissionNum.
     */
    int getFinishedMissionNum();

    /**
     * <code>uint32 progress = 3;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 open_time = 5;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 chapter_id = 13;</code>
     * @return The chapterId.
     */
    int getChapterId();
  }
  /**
   * <pre>
   * Obf: ANMOGBHGIFM
   * </pre>
   *
   * Protobuf type {@code DragonSpineChapterInfo}
   */
  public static final class DragonSpineChapterInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DragonSpineChapterInfo)
      DragonSpineChapterInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DragonSpineChapterInfo.newBuilder() to construct.
    private DragonSpineChapterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DragonSpineChapterInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DragonSpineChapterInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.internal_static_DragonSpineChapterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.internal_static_DragonSpineChapterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo.class, emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo.Builder.class);
    }

    public static final int FINISHED_MISSION_NUM_FIELD_NUMBER = 10;
    private int finishedMissionNum_;
    /**
     * <code>uint32 finished_mission_num = 10;</code>
     * @return The finishedMissionNum.
     */
    @java.lang.Override
    public int getFinishedMissionNum() {
      return finishedMissionNum_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 3;
    private int progress_;
    /**
     * <code>uint32 progress = 3;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 5;
    private int openTime_;
    /**
     * <code>uint32 open_time = 5;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 12;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 13;
    private int chapterId_;
    /**
     * <code>uint32 chapter_id = 13;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      return chapterId_;
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
      if (progress_ != 0) {
        output.writeUInt32(3, progress_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(5, openTime_);
      }
      if (finishedMissionNum_ != 0) {
        output.writeUInt32(10, finishedMissionNum_);
      }
      if (isOpen_ != false) {
        output.writeBool(12, isOpen_);
      }
      if (chapterId_ != 0) {
        output.writeUInt32(13, chapterId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, progress_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, openTime_);
      }
      if (finishedMissionNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, finishedMissionNum_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isOpen_);
      }
      if (chapterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, chapterId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo other = (emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo) obj;

      if (getFinishedMissionNum()
          != other.getFinishedMissionNum()) return false;
      if (getProgress()
          != other.getProgress()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getChapterId()
          != other.getChapterId()) return false;
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
      hash = (37 * hash) + FINISHED_MISSION_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getFinishedMissionNum();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChapterId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo prototype) {
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
     * Obf: ANMOGBHGIFM
     * </pre>
     *
     * Protobuf type {@code DragonSpineChapterInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DragonSpineChapterInfo)
        emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.internal_static_DragonSpineChapterInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.internal_static_DragonSpineChapterInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo.class, emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        finishedMissionNum_ = 0;

        progress_ = 0;

        openTime_ = 0;

        isOpen_ = false;

        chapterId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.internal_static_DragonSpineChapterInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo build() {
        emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo buildPartial() {
        emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo result = new emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo(this);
        result.finishedMissionNum_ = finishedMissionNum_;
        result.progress_ = progress_;
        result.openTime_ = openTime_;
        result.isOpen_ = isOpen_;
        result.chapterId_ = chapterId_;
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
        if (other instanceof emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo) {
          return mergeFrom((emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo other) {
        if (other == emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo.getDefaultInstance()) return this;
        if (other.getFinishedMissionNum() != 0) {
          setFinishedMissionNum(other.getFinishedMissionNum());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getChapterId() != 0) {
          setChapterId(other.getChapterId());
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
                progress_ = input.readUInt32();

                break;
              } // case 24
              case 40: {
                openTime_ = input.readUInt32();

                break;
              } // case 40
              case 80: {
                finishedMissionNum_ = input.readUInt32();

                break;
              } // case 80
              case 96: {
                isOpen_ = input.readBool();

                break;
              } // case 96
              case 104: {
                chapterId_ = input.readUInt32();

                break;
              } // case 104
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

      private int finishedMissionNum_ ;
      /**
       * <code>uint32 finished_mission_num = 10;</code>
       * @return The finishedMissionNum.
       */
      @java.lang.Override
      public int getFinishedMissionNum() {
        return finishedMissionNum_;
      }
      /**
       * <code>uint32 finished_mission_num = 10;</code>
       * @param value The finishedMissionNum to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedMissionNum(int value) {
        
        finishedMissionNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finished_mission_num = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedMissionNum() {
        
        finishedMissionNum_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 3;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 3;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 5;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 5;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 12;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int chapterId_ ;
      /**
       * <code>uint32 chapter_id = 13;</code>
       * @return The chapterId.
       */
      @java.lang.Override
      public int getChapterId() {
        return chapterId_;
      }
      /**
       * <code>uint32 chapter_id = 13;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        
        chapterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        
        chapterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DragonSpineChapterInfo)
    }

    // @@protoc_insertion_point(class_scope:DragonSpineChapterInfo)
    private static final emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo();
    }

    public static emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DragonSpineChapterInfo>
        PARSER = new com.google.protobuf.AbstractParser<DragonSpineChapterInfo>() {
      @java.lang.Override
      public DragonSpineChapterInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<DragonSpineChapterInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DragonSpineChapterInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DragonSpineChapterInfoOuterClass.DragonSpineChapterInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DragonSpineChapterInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DragonSpineChapterInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034DragonSpineChapterInfo.proto\"\200\001\n\026Drago" +
      "nSpineChapterInfo\022\034\n\024finished_mission_nu" +
      "m\030\n \001(\r\022\020\n\010progress\030\003 \001(\r\022\021\n\topen_time\030\005" +
      " \001(\r\022\017\n\007is_open\030\014 \001(\010\022\022\n\nchapter_id\030\r \001(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DragonSpineChapterInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DragonSpineChapterInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DragonSpineChapterInfo_descriptor,
        new java.lang.String[] { "FinishedMissionNum", "Progress", "OpenTime", "IsOpen", "ChapterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
