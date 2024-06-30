// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneTeamUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class SceneTeamUpdateNotifyOuterClass {
  private SceneTeamUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneTeamUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneTeamUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_in_mp = 4;</code>
     * @return The isInMp.
     */
    boolean getIsInMp();

    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    java.util.List<emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar> 
        getSceneTeamAvatarListList();
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar getSceneTeamAvatarList(int index);
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    int getSceneTeamAvatarListCount();
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> 
        getSceneTeamAvatarListOrBuilderList();
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder getSceneTeamAvatarListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 4509
   * Obf: CJJPNPLKBCA
   * </pre>
   *
   * Protobuf type {@code SceneTeamUpdateNotify}
   */
  public static final class SceneTeamUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneTeamUpdateNotify)
      SceneTeamUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneTeamUpdateNotify.newBuilder() to construct.
    private SceneTeamUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneTeamUpdateNotify() {
      sceneTeamAvatarList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneTeamUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.class, emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.Builder.class);
    }

    public static final int IS_IN_MP_FIELD_NUMBER = 4;
    private boolean isInMp_;
    /**
     * <code>bool is_in_mp = 4;</code>
     * @return The isInMp.
     */
    @java.lang.Override
    public boolean getIsInMp() {
      return isInMp_;
    }

    public static final int SCENE_TEAM_AVATAR_LIST_FIELD_NUMBER = 13;
    private java.util.List<emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar> sceneTeamAvatarList_;
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar> getSceneTeamAvatarListList() {
      return sceneTeamAvatarList_;
    }
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> 
        getSceneTeamAvatarListOrBuilderList() {
      return sceneTeamAvatarList_;
    }
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    @java.lang.Override
    public int getSceneTeamAvatarListCount() {
      return sceneTeamAvatarList_.size();
    }
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar getSceneTeamAvatarList(int index) {
      return sceneTeamAvatarList_.get(index);
    }
    /**
     * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder getSceneTeamAvatarListOrBuilder(
        int index) {
      return sceneTeamAvatarList_.get(index);
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
      if (isInMp_ != false) {
        output.writeBool(4, isInMp_);
      }
      for (int i = 0; i < sceneTeamAvatarList_.size(); i++) {
        output.writeMessage(13, sceneTeamAvatarList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isInMp_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isInMp_);
      }
      for (int i = 0; i < sceneTeamAvatarList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, sceneTeamAvatarList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify other = (emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify) obj;

      if (getIsInMp()
          != other.getIsInMp()) return false;
      if (!getSceneTeamAvatarListList()
          .equals(other.getSceneTeamAvatarListList())) return false;
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
      hash = (37 * hash) + IS_IN_MP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInMp());
      if (getSceneTeamAvatarListCount() > 0) {
        hash = (37 * hash) + SCENE_TEAM_AVATAR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneTeamAvatarListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify prototype) {
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
     * CmdId: 4509
     * Obf: CJJPNPLKBCA
     * </pre>
     *
     * Protobuf type {@code SceneTeamUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneTeamUpdateNotify)
        emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.class, emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isInMp_ = false;

        if (sceneTeamAvatarListBuilder_ == null) {
          sceneTeamAvatarList_ = java.util.Collections.emptyList();
        } else {
          sceneTeamAvatarList_ = null;
          sceneTeamAvatarListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify build() {
        emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify result = new emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        result.isInMp_ = isInMp_;
        if (sceneTeamAvatarListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            sceneTeamAvatarList_ = java.util.Collections.unmodifiableList(sceneTeamAvatarList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.sceneTeamAvatarList_ = sceneTeamAvatarList_;
        } else {
          result.sceneTeamAvatarList_ = sceneTeamAvatarListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.getDefaultInstance()) return this;
        if (other.getIsInMp() != false) {
          setIsInMp(other.getIsInMp());
        }
        if (sceneTeamAvatarListBuilder_ == null) {
          if (!other.sceneTeamAvatarList_.isEmpty()) {
            if (sceneTeamAvatarList_.isEmpty()) {
              sceneTeamAvatarList_ = other.sceneTeamAvatarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSceneTeamAvatarListIsMutable();
              sceneTeamAvatarList_.addAll(other.sceneTeamAvatarList_);
            }
            onChanged();
          }
        } else {
          if (!other.sceneTeamAvatarList_.isEmpty()) {
            if (sceneTeamAvatarListBuilder_.isEmpty()) {
              sceneTeamAvatarListBuilder_.dispose();
              sceneTeamAvatarListBuilder_ = null;
              sceneTeamAvatarList_ = other.sceneTeamAvatarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              sceneTeamAvatarListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSceneTeamAvatarListFieldBuilder() : null;
            } else {
              sceneTeamAvatarListBuilder_.addAllMessages(other.sceneTeamAvatarList_);
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
              case 32: {
                isInMp_ = input.readBool();

                break;
              } // case 32
              case 106: {
                emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar m =
                    input.readMessage(
                        emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.parser(),
                        extensionRegistry);
                if (sceneTeamAvatarListBuilder_ == null) {
                  ensureSceneTeamAvatarListIsMutable();
                  sceneTeamAvatarList_.add(m);
                } else {
                  sceneTeamAvatarListBuilder_.addMessage(m);
                }
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

      private boolean isInMp_ ;
      /**
       * <code>bool is_in_mp = 4;</code>
       * @return The isInMp.
       */
      @java.lang.Override
      public boolean getIsInMp() {
        return isInMp_;
      }
      /**
       * <code>bool is_in_mp = 4;</code>
       * @param value The isInMp to set.
       * @return This builder for chaining.
       */
      public Builder setIsInMp(boolean value) {
        
        isInMp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_in_mp = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInMp() {
        
        isInMp_ = false;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar> sceneTeamAvatarList_ =
        java.util.Collections.emptyList();
      private void ensureSceneTeamAvatarListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneTeamAvatarList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar>(sceneTeamAvatarList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> sceneTeamAvatarListBuilder_;

      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar> getSceneTeamAvatarListList() {
        if (sceneTeamAvatarListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(sceneTeamAvatarList_);
        } else {
          return sceneTeamAvatarListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public int getSceneTeamAvatarListCount() {
        if (sceneTeamAvatarListBuilder_ == null) {
          return sceneTeamAvatarList_.size();
        } else {
          return sceneTeamAvatarListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar getSceneTeamAvatarList(int index) {
        if (sceneTeamAvatarListBuilder_ == null) {
          return sceneTeamAvatarList_.get(index);
        } else {
          return sceneTeamAvatarListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder setSceneTeamAvatarList(
          int index, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar value) {
        if (sceneTeamAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneTeamAvatarListIsMutable();
          sceneTeamAvatarList_.set(index, value);
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder setSceneTeamAvatarList(
          int index, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder builderForValue) {
        if (sceneTeamAvatarListBuilder_ == null) {
          ensureSceneTeamAvatarListIsMutable();
          sceneTeamAvatarList_.set(index, builderForValue.build());
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder addSceneTeamAvatarList(emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar value) {
        if (sceneTeamAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneTeamAvatarListIsMutable();
          sceneTeamAvatarList_.add(value);
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder addSceneTeamAvatarList(
          int index, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar value) {
        if (sceneTeamAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneTeamAvatarListIsMutable();
          sceneTeamAvatarList_.add(index, value);
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder addSceneTeamAvatarList(
          emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder builderForValue) {
        if (sceneTeamAvatarListBuilder_ == null) {
          ensureSceneTeamAvatarListIsMutable();
          sceneTeamAvatarList_.add(builderForValue.build());
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder addSceneTeamAvatarList(
          int index, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder builderForValue) {
        if (sceneTeamAvatarListBuilder_ == null) {
          ensureSceneTeamAvatarListIsMutable();
          sceneTeamAvatarList_.add(index, builderForValue.build());
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder addAllSceneTeamAvatarList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar> values) {
        if (sceneTeamAvatarListBuilder_ == null) {
          ensureSceneTeamAvatarListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, sceneTeamAvatarList_);
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder clearSceneTeamAvatarList() {
        if (sceneTeamAvatarListBuilder_ == null) {
          sceneTeamAvatarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public Builder removeSceneTeamAvatarList(int index) {
        if (sceneTeamAvatarListBuilder_ == null) {
          ensureSceneTeamAvatarListIsMutable();
          sceneTeamAvatarList_.remove(index);
          onChanged();
        } else {
          sceneTeamAvatarListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder getSceneTeamAvatarListBuilder(
          int index) {
        return getSceneTeamAvatarListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder getSceneTeamAvatarListOrBuilder(
          int index) {
        if (sceneTeamAvatarListBuilder_ == null) {
          return sceneTeamAvatarList_.get(index);  } else {
          return sceneTeamAvatarListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> 
           getSceneTeamAvatarListOrBuilderList() {
        if (sceneTeamAvatarListBuilder_ != null) {
          return sceneTeamAvatarListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(sceneTeamAvatarList_);
        }
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder addSceneTeamAvatarListBuilder() {
        return getSceneTeamAvatarListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder addSceneTeamAvatarListBuilder(
          int index) {
        return getSceneTeamAvatarListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneTeamAvatar scene_team_avatar_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder> 
           getSceneTeamAvatarListBuilderList() {
        return getSceneTeamAvatarListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> 
          getSceneTeamAvatarListFieldBuilder() {
        if (sceneTeamAvatarListBuilder_ == null) {
          sceneTeamAvatarListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder, emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder>(
                  sceneTeamAvatarList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          sceneTeamAvatarList_ = null;
        }
        return sceneTeamAvatarListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneTeamUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneTeamUpdateNotify)
    private static final emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify();
    }

    public static emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneTeamUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneTeamUpdateNotify>() {
      @java.lang.Override
      public SceneTeamUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneTeamUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneTeamUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneTeamUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneTeamUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SceneTeamUpdateNotify.proto\032\025SceneTeam" +
      "Avatar.proto\"[\n\025SceneTeamUpdateNotify\022\020\n" +
      "\010is_in_mp\030\004 \001(\010\0220\n\026scene_team_avatar_lis" +
      "t\030\r \003(\0132\020.SceneTeamAvatarB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.getDescriptor(),
        });
    internal_static_SceneTeamUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneTeamUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneTeamUpdateNotify_descriptor,
        new java.lang.String[] { "IsInMp", "SceneTeamAvatarList", });
    emu.grasscutter.net.proto.SceneTeamAvatarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
