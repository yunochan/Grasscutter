// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerTimeNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerTimeNotifyOuterClass {
  private PlayerTimeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerTimeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerTimeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 player_time = 9;</code>
     * @return The playerTime.
     */
    long getPlayerTime();

    /**
     * <code>uint64 server_time = 12;</code>
     * @return The serverTime.
     */
    long getServerTime();

    /**
     * <code>bool is_paused = 15;</code>
     * @return The isPaused.
     */
    boolean getIsPaused();
  }
  /**
   * <pre>
   * CmdId: 9057
   * Obf: FFDLNGLDKCG
   * </pre>
   *
   * Protobuf type {@code PlayerTimeNotify}
   */
  public static final class PlayerTimeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerTimeNotify)
      PlayerTimeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerTimeNotify.newBuilder() to construct.
    private PlayerTimeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerTimeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerTimeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.class, emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.Builder.class);
    }

    public static final int PLAYER_TIME_FIELD_NUMBER = 9;
    private long playerTime_;
    /**
     * <code>uint64 player_time = 9;</code>
     * @return The playerTime.
     */
    @java.lang.Override
    public long getPlayerTime() {
      return playerTime_;
    }

    public static final int SERVER_TIME_FIELD_NUMBER = 12;
    private long serverTime_;
    /**
     * <code>uint64 server_time = 12;</code>
     * @return The serverTime.
     */
    @java.lang.Override
    public long getServerTime() {
      return serverTime_;
    }

    public static final int IS_PAUSED_FIELD_NUMBER = 15;
    private boolean isPaused_;
    /**
     * <code>bool is_paused = 15;</code>
     * @return The isPaused.
     */
    @java.lang.Override
    public boolean getIsPaused() {
      return isPaused_;
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
      if (playerTime_ != 0L) {
        output.writeUInt64(9, playerTime_);
      }
      if (serverTime_ != 0L) {
        output.writeUInt64(12, serverTime_);
      }
      if (isPaused_ != false) {
        output.writeBool(15, isPaused_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, playerTime_);
      }
      if (serverTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, serverTime_);
      }
      if (isPaused_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isPaused_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify other = (emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify) obj;

      if (getPlayerTime()
          != other.getPlayerTime()) return false;
      if (getServerTime()
          != other.getServerTime()) return false;
      if (getIsPaused()
          != other.getIsPaused()) return false;
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
      hash = (37 * hash) + PLAYER_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPlayerTime());
      hash = (37 * hash) + SERVER_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getServerTime());
      hash = (37 * hash) + IS_PAUSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPaused());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify prototype) {
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
     * CmdId: 9057
     * Obf: FFDLNGLDKCG
     * </pre>
     *
     * Protobuf type {@code PlayerTimeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerTimeNotify)
        emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.class, emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        playerTime_ = 0L;

        serverTime_ = 0L;

        isPaused_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify build() {
        emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify result = new emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify(this);
        result.playerTime_ = playerTime_;
        result.serverTime_ = serverTime_;
        result.isPaused_ = isPaused_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.getDefaultInstance()) return this;
        if (other.getPlayerTime() != 0L) {
          setPlayerTime(other.getPlayerTime());
        }
        if (other.getServerTime() != 0L) {
          setServerTime(other.getServerTime());
        }
        if (other.getIsPaused() != false) {
          setIsPaused(other.getIsPaused());
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
              case 72: {
                playerTime_ = input.readUInt64();

                break;
              } // case 72
              case 96: {
                serverTime_ = input.readUInt64();

                break;
              } // case 96
              case 120: {
                isPaused_ = input.readBool();

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

      private long playerTime_ ;
      /**
       * <code>uint64 player_time = 9;</code>
       * @return The playerTime.
       */
      @java.lang.Override
      public long getPlayerTime() {
        return playerTime_;
      }
      /**
       * <code>uint64 player_time = 9;</code>
       * @param value The playerTime to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerTime(long value) {
        
        playerTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 player_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerTime() {
        
        playerTime_ = 0L;
        onChanged();
        return this;
      }

      private long serverTime_ ;
      /**
       * <code>uint64 server_time = 12;</code>
       * @return The serverTime.
       */
      @java.lang.Override
      public long getServerTime() {
        return serverTime_;
      }
      /**
       * <code>uint64 server_time = 12;</code>
       * @param value The serverTime to set.
       * @return This builder for chaining.
       */
      public Builder setServerTime(long value) {
        
        serverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 server_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerTime() {
        
        serverTime_ = 0L;
        onChanged();
        return this;
      }

      private boolean isPaused_ ;
      /**
       * <code>bool is_paused = 15;</code>
       * @return The isPaused.
       */
      @java.lang.Override
      public boolean getIsPaused() {
        return isPaused_;
      }
      /**
       * <code>bool is_paused = 15;</code>
       * @param value The isPaused to set.
       * @return This builder for chaining.
       */
      public Builder setIsPaused(boolean value) {
        
        isPaused_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_paused = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPaused() {
        
        isPaused_ = false;
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


      // @@protoc_insertion_point(builder_scope:PlayerTimeNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerTimeNotify)
    private static final emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify();
    }

    public static emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerTimeNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerTimeNotify>() {
      @java.lang.Override
      public PlayerTimeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerTimeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerTimeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerTimeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerTimeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PlayerTimeNotify.proto\"O\n\020PlayerTimeNo" +
      "tify\022\023\n\013player_time\030\t \001(\004\022\023\n\013server_time" +
      "\030\014 \001(\004\022\021\n\tis_paused\030\017 \001(\010B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerTimeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerTimeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerTimeNotify_descriptor,
        new java.lang.String[] { "PlayerTime", "ServerTime", "IsPaused", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
