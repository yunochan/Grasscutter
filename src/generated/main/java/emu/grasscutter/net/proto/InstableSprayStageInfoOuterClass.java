// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InstableSprayStageInfo.proto

package emu.grasscutter.net.proto;

public final class InstableSprayStageInfoOuterClass {
  private InstableSprayStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InstableSprayStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InstableSprayStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_score = 15;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo> 
        getTeamInfoListList();
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo getTeamInfoList(int index);
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    int getTeamInfoListCount();
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder> 
        getTeamInfoListOrBuilderList();
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder getTeamInfoListOrBuilder(
        int index);

    /**
     * <code>bool is_finished = 6;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * Obf: NPJGMLIPGAK
   * </pre>
   *
   * Protobuf type {@code InstableSprayStageInfo}
   */
  public static final class InstableSprayStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InstableSprayStageInfo)
      InstableSprayStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InstableSprayStageInfo.newBuilder() to construct.
    private InstableSprayStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InstableSprayStageInfo() {
      teamInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InstableSprayStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.internal_static_InstableSprayStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.internal_static_InstableSprayStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.class, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder.class);
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 15;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 15;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int TEAM_INFO_LIST_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo> teamInfoList_;
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo> getTeamInfoListList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder> 
        getTeamInfoListOrBuilderList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    @java.lang.Override
    public int getTeamInfoListCount() {
      return teamInfoList_.size();
    }
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo getTeamInfoList(int index) {
      return teamInfoList_.get(index);
    }
    /**
     * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder getTeamInfoListOrBuilder(
        int index) {
      return teamInfoList_.get(index);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 6;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 6;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 3;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (stageId_ != 0) {
        output.writeUInt32(3, stageId_);
      }
      if (isFinished_ != false) {
        output.writeBool(6, isFinished_);
      }
      for (int i = 0; i < teamInfoList_.size(); i++) {
        output.writeMessage(10, teamInfoList_.get(i));
      }
      if (maxScore_ != 0) {
        output.writeUInt32(15, maxScore_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stageId_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isFinished_);
      }
      for (int i = 0; i < teamInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, teamInfoList_.get(i));
      }
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, maxScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo other = (emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo) obj;

      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (!getTeamInfoListList()
          .equals(other.getTeamInfoListList())) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      if (getTeamInfoListCount() > 0) {
        hash = (37 * hash) + TEAM_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTeamInfoListList().hashCode();
      }
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo prototype) {
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
     * Obf: NPJGMLIPGAK
     * </pre>
     *
     * Protobuf type {@code InstableSprayStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InstableSprayStageInfo)
        emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.internal_static_InstableSprayStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.internal_static_InstableSprayStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.class, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        maxScore_ = 0;

        if (teamInfoListBuilder_ == null) {
          teamInfoList_ = java.util.Collections.emptyList();
        } else {
          teamInfoList_ = null;
          teamInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        isFinished_ = false;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.internal_static_InstableSprayStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo build() {
        emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo buildPartial() {
        emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo result = new emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo(this);
        int from_bitField0_ = bitField0_;
        result.maxScore_ = maxScore_;
        if (teamInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            teamInfoList_ = java.util.Collections.unmodifiableList(teamInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.teamInfoList_ = teamInfoList_;
        } else {
          result.teamInfoList_ = teamInfoListBuilder_.build();
        }
        result.isFinished_ = isFinished_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo) {
          return mergeFrom((emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo other) {
        if (other == emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.getDefaultInstance()) return this;
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (teamInfoListBuilder_ == null) {
          if (!other.teamInfoList_.isEmpty()) {
            if (teamInfoList_.isEmpty()) {
              teamInfoList_ = other.teamInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTeamInfoListIsMutable();
              teamInfoList_.addAll(other.teamInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.teamInfoList_.isEmpty()) {
            if (teamInfoListBuilder_.isEmpty()) {
              teamInfoListBuilder_.dispose();
              teamInfoListBuilder_ = null;
              teamInfoList_ = other.teamInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              teamInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTeamInfoListFieldBuilder() : null;
            } else {
              teamInfoListBuilder_.addAllMessages(other.teamInfoList_);
            }
          }
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
                stageId_ = input.readUInt32();

                break;
              } // case 24
              case 48: {
                isFinished_ = input.readBool();

                break;
              } // case 48
              case 82: {
                emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.parser(),
                        extensionRegistry);
                if (teamInfoListBuilder_ == null) {
                  ensureTeamInfoListIsMutable();
                  teamInfoList_.add(m);
                } else {
                  teamInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 82
              case 120: {
                maxScore_ = input.readUInt32();

                break;
              } // case 120
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

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 15;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 15;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo> teamInfoList_ =
        java.util.Collections.emptyList();
      private void ensureTeamInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          teamInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo>(teamInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder> teamInfoListBuilder_;

      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo> getTeamInfoListList() {
        if (teamInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        } else {
          return teamInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public int getTeamInfoListCount() {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.size();
        } else {
          return teamInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo getTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);
        } else {
          return teamInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.set(index, value);
          onChanged();
        } else {
          teamInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder addTeamInfoList(emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(value);
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(index, value);
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder addTeamInfoList(
          emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder addAllTeamInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo> values) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, teamInfoList_);
          onChanged();
        } else {
          teamInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder clearTeamInfoList() {
        if (teamInfoListBuilder_ == null) {
          teamInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          teamInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public Builder removeTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.remove(index);
          onChanged();
        } else {
          teamInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder getTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder getTeamInfoListOrBuilder(
          int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);  } else {
          return teamInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder> 
           getTeamInfoListOrBuilderList() {
        if (teamInfoListBuilder_ != null) {
          return teamInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        }
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder addTeamInfoListBuilder() {
        return getTeamInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder addTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InstableSprayTeamInfo team_info_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder> 
           getTeamInfoListBuilderList() {
        return getTeamInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder> 
          getTeamInfoListFieldBuilder() {
        if (teamInfoListBuilder_ == null) {
          teamInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfo.Builder, emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.InstableSprayTeamInfoOrBuilder>(
                  teamInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          teamInfoList_ = null;
        }
        return teamInfoListBuilder_;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 6;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 6;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InstableSprayStageInfo)
    }

    // @@protoc_insertion_point(class_scope:InstableSprayStageInfo)
    private static final emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo();
    }

    public static emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InstableSprayStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<InstableSprayStageInfo>() {
      @java.lang.Override
      public InstableSprayStageInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<InstableSprayStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstableSprayStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstableSprayStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstableSprayStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034InstableSprayStageInfo.proto\032\033Instable" +
      "SprayTeamInfo.proto\"\202\001\n\026InstableSpraySta" +
      "geInfo\022\021\n\tmax_score\030\017 \001(\r\022.\n\016team_info_l" +
      "ist\030\n \003(\0132\026.InstableSprayTeamInfo\022\023\n\013is_" +
      "finished\030\006 \001(\010\022\020\n\010stage_id\030\003 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.getDescriptor(),
        });
    internal_static_InstableSprayStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InstableSprayStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstableSprayStageInfo_descriptor,
        new java.lang.String[] { "MaxScore", "TeamInfoList", "IsFinished", "StageId", });
    emu.grasscutter.net.proto.InstableSprayTeamInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
