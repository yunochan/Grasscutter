// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuminanceStoneChallengeActivityDetailInfo.proto

package emu.grasscutter.net.proto;

public final class LuminanceStoneChallengeActivityDetailInfoOuterClass {
  private LuminanceStoneChallengeActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LuminanceStoneChallengeActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LuminanceStoneChallengeActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 best_score = 7;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 current_stage_id = 8;</code>
     * @return The currentStageId.
     */
    int getCurrentStageId();

    /**
     * <code>bool is_final_gallery_complete = 1;</code>
     * @return The isFinalGalleryComplete.
     */
    boolean getIsFinalGalleryComplete();

    /**
     * <code>bool is_content_closed = 9;</code>
     * @return The isContentClosed.
     */
    boolean getIsContentClosed();
  }
  /**
   * <pre>
   * Obf: HEELLKHPNAA
   * </pre>
   *
   * Protobuf type {@code LuminanceStoneChallengeActivityDetailInfo}
   */
  public static final class LuminanceStoneChallengeActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LuminanceStoneChallengeActivityDetailInfo)
      LuminanceStoneChallengeActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LuminanceStoneChallengeActivityDetailInfo.newBuilder() to construct.
    private LuminanceStoneChallengeActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LuminanceStoneChallengeActivityDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LuminanceStoneChallengeActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.class, emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.Builder.class);
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 7;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 7;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int CURRENT_STAGE_ID_FIELD_NUMBER = 8;
    private int currentStageId_;
    /**
     * <code>uint32 current_stage_id = 8;</code>
     * @return The currentStageId.
     */
    @java.lang.Override
    public int getCurrentStageId() {
      return currentStageId_;
    }

    public static final int IS_FINAL_GALLERY_COMPLETE_FIELD_NUMBER = 1;
    private boolean isFinalGalleryComplete_;
    /**
     * <code>bool is_final_gallery_complete = 1;</code>
     * @return The isFinalGalleryComplete.
     */
    @java.lang.Override
    public boolean getIsFinalGalleryComplete() {
      return isFinalGalleryComplete_;
    }

    public static final int IS_CONTENT_CLOSED_FIELD_NUMBER = 9;
    private boolean isContentClosed_;
    /**
     * <code>bool is_content_closed = 9;</code>
     * @return The isContentClosed.
     */
    @java.lang.Override
    public boolean getIsContentClosed() {
      return isContentClosed_;
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
      if (isFinalGalleryComplete_ != false) {
        output.writeBool(1, isFinalGalleryComplete_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(7, bestScore_);
      }
      if (currentStageId_ != 0) {
        output.writeUInt32(8, currentStageId_);
      }
      if (isContentClosed_ != false) {
        output.writeBool(9, isContentClosed_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinalGalleryComplete_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isFinalGalleryComplete_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, bestScore_);
      }
      if (currentStageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, currentStageId_);
      }
      if (isContentClosed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isContentClosed_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo other = (emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo) obj;

      if (getBestScore()
          != other.getBestScore()) return false;
      if (getCurrentStageId()
          != other.getCurrentStageId()) return false;
      if (getIsFinalGalleryComplete()
          != other.getIsFinalGalleryComplete()) return false;
      if (getIsContentClosed()
          != other.getIsContentClosed()) return false;
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
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + CURRENT_STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentStageId();
      hash = (37 * hash) + IS_FINAL_GALLERY_COMPLETE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinalGalleryComplete());
      hash = (37 * hash) + IS_CONTENT_CLOSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsContentClosed());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo prototype) {
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
     * Obf: HEELLKHPNAA
     * </pre>
     *
     * Protobuf type {@code LuminanceStoneChallengeActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LuminanceStoneChallengeActivityDetailInfo)
        emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.class, emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bestScore_ = 0;

        currentStageId_ = 0;

        isFinalGalleryComplete_ = false;

        isContentClosed_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo build() {
        emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo buildPartial() {
        emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo result = new emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo(this);
        result.bestScore_ = bestScore_;
        result.currentStageId_ = currentStageId_;
        result.isFinalGalleryComplete_ = isFinalGalleryComplete_;
        result.isContentClosed_ = isContentClosed_;
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
        if (other instanceof emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo other) {
        if (other == emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.getDefaultInstance()) return this;
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getCurrentStageId() != 0) {
          setCurrentStageId(other.getCurrentStageId());
        }
        if (other.getIsFinalGalleryComplete() != false) {
          setIsFinalGalleryComplete(other.getIsFinalGalleryComplete());
        }
        if (other.getIsContentClosed() != false) {
          setIsContentClosed(other.getIsContentClosed());
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
                isFinalGalleryComplete_ = input.readBool();

                break;
              } // case 8
              case 56: {
                bestScore_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                currentStageId_ = input.readUInt32();

                break;
              } // case 64
              case 72: {
                isContentClosed_ = input.readBool();

                break;
              } // case 72
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

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 7;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 7;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int currentStageId_ ;
      /**
       * <code>uint32 current_stage_id = 8;</code>
       * @return The currentStageId.
       */
      @java.lang.Override
      public int getCurrentStageId() {
        return currentStageId_;
      }
      /**
       * <code>uint32 current_stage_id = 8;</code>
       * @param value The currentStageId to set.
       * @return This builder for chaining.
       */
      public Builder setCurrentStageId(int value) {
        
        currentStageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 current_stage_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurrentStageId() {
        
        currentStageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinalGalleryComplete_ ;
      /**
       * <code>bool is_final_gallery_complete = 1;</code>
       * @return The isFinalGalleryComplete.
       */
      @java.lang.Override
      public boolean getIsFinalGalleryComplete() {
        return isFinalGalleryComplete_;
      }
      /**
       * <code>bool is_final_gallery_complete = 1;</code>
       * @param value The isFinalGalleryComplete to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinalGalleryComplete(boolean value) {
        
        isFinalGalleryComplete_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_final_gallery_complete = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinalGalleryComplete() {
        
        isFinalGalleryComplete_ = false;
        onChanged();
        return this;
      }

      private boolean isContentClosed_ ;
      /**
       * <code>bool is_content_closed = 9;</code>
       * @return The isContentClosed.
       */
      @java.lang.Override
      public boolean getIsContentClosed() {
        return isContentClosed_;
      }
      /**
       * <code>bool is_content_closed = 9;</code>
       * @param value The isContentClosed to set.
       * @return This builder for chaining.
       */
      public Builder setIsContentClosed(boolean value) {
        
        isContentClosed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_content_closed = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsContentClosed() {
        
        isContentClosed_ = false;
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


      // @@protoc_insertion_point(builder_scope:LuminanceStoneChallengeActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:LuminanceStoneChallengeActivityDetailInfo)
    private static final emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LuminanceStoneChallengeActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<LuminanceStoneChallengeActivityDetailInfo>() {
      @java.lang.Override
      public LuminanceStoneChallengeActivityDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<LuminanceStoneChallengeActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LuminanceStoneChallengeActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LuminanceStoneChallengeActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/LuminanceStoneChallengeActivityDetailI" +
      "nfo.proto\"\227\001\n)LuminanceStoneChallengeAct" +
      "ivityDetailInfo\022\022\n\nbest_score\030\007 \001(\r\022\030\n\020c" +
      "urrent_stage_id\030\010 \001(\r\022!\n\031is_final_galler" +
      "y_complete\030\001 \001(\010\022\031\n\021is_content_closed\030\t " +
      "\001(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LuminanceStoneChallengeActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor,
        new java.lang.String[] { "BestScore", "CurrentStageId", "IsFinalGalleryComplete", "IsContentClosed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
