// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OtherPlayerEnterHomeNotify.proto

package emu.grasscutter.net.proto;

public final class OtherPlayerEnterHomeNotifyOuterClass {
  private OtherPlayerEnterHomeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OtherPlayerEnterHomeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OtherPlayerEnterHomeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string nickname = 13;</code>
     * @return The nickname.
     */
    java.lang.String getNickname();
    /**
     * <code>string nickname = 13;</code>
     * @return The bytes for nickname.
     */
    com.google.protobuf.ByteString
        getNicknameBytes();

    /**
     * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason getReason();
  }
  /**
   * <pre>
   * CmdId: 25817
   * Obf: MGNDPKIPKGO
   * </pre>
   *
   * Protobuf type {@code OtherPlayerEnterHomeNotify}
   */
  public static final class OtherPlayerEnterHomeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OtherPlayerEnterHomeNotify)
      OtherPlayerEnterHomeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OtherPlayerEnterHomeNotify.newBuilder() to construct.
    private OtherPlayerEnterHomeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OtherPlayerEnterHomeNotify() {
      nickname_ = "";
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OtherPlayerEnterHomeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.internal_static_OtherPlayerEnterHomeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.internal_static_OtherPlayerEnterHomeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.class, emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Builder.class);
    }

    /**
     * <pre>
     * Obf: CMPPPMNICGG
     * </pre>
     *
     * Protobuf enum {@code OtherPlayerEnterHomeNotify.Reason}
     */
    public enum Reason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>INVALID = 0;</code>
       */
      INVALID(0),
      /**
       * <code>ENTER = 1;</code>
       */
      ENTER(1),
      /**
       * <code>LEAVE = 2;</code>
       */
      LEAVE(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>INVALID = 0;</code>
       */
      public static final int INVALID_VALUE = 0;
      /**
       * <code>ENTER = 1;</code>
       */
      public static final int ENTER_VALUE = 1;
      /**
       * <code>LEAVE = 2;</code>
       */
      public static final int LEAVE_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Reason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Reason forNumber(int value) {
        switch (value) {
          case 0: return INVALID;
          case 1: return ENTER;
          case 2: return LEAVE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Reason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Reason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
              public Reason findValueByNumber(int number) {
                return Reason.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final Reason[] VALUES = values();

      public static Reason valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Reason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:OtherPlayerEnterHomeNotify.Reason)
    }

    public static final int NICKNAME_FIELD_NUMBER = 13;
    private volatile java.lang.Object nickname_;
    /**
     * <code>string nickname = 13;</code>
     * @return The nickname.
     */
    @java.lang.Override
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 13;</code>
     * @return The bytes for nickname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REASON_FIELD_NUMBER = 14;
    private int reason_;
    /**
     * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason result = emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason.UNRECOGNIZED : result;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, nickname_);
      }
      if (reason_ != emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason.INVALID.getNumber()) {
        output.writeEnum(14, reason_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, nickname_);
      }
      if (reason_ != emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason.INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify other = (emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify) obj;

      if (!getNickname()
          .equals(other.getNickname())) return false;
      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify prototype) {
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
     * CmdId: 25817
     * Obf: MGNDPKIPKGO
     * </pre>
     *
     * Protobuf type {@code OtherPlayerEnterHomeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OtherPlayerEnterHomeNotify)
        emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.internal_static_OtherPlayerEnterHomeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.internal_static_OtherPlayerEnterHomeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.class, emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        nickname_ = "";

        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.internal_static_OtherPlayerEnterHomeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify build() {
        emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify buildPartial() {
        emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify result = new emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify(this);
        result.nickname_ = nickname_;
        result.reason_ = reason_;
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
        if (other instanceof emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify other) {
        if (other == emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.getDefaultInstance()) return this;
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
              case 106: {
                nickname_ = input.readStringRequireUtf8();

                break;
              } // case 106
              case 112: {
                reason_ = input.readEnum();

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

      private java.lang.Object nickname_ = "";
      /**
       * <code>string nickname = 13;</code>
       * @return The nickname.
       */
      public java.lang.String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nickname = 13;</code>
       * @return The bytes for nickname.
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        java.lang.Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 13;</code>
       * @param value The nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 13;</code>
       * @param value The bytes for nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason result = emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason.UNRECOGNIZED : result;
      }
      /**
       * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify.Reason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.OtherPlayerEnterHomeNotify.Reason reason = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OtherPlayerEnterHomeNotify)
    }

    // @@protoc_insertion_point(class_scope:OtherPlayerEnterHomeNotify)
    private static final emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify();
    }

    public static emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OtherPlayerEnterHomeNotify>
        PARSER = new com.google.protobuf.AbstractParser<OtherPlayerEnterHomeNotify>() {
      @java.lang.Override
      public OtherPlayerEnterHomeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<OtherPlayerEnterHomeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OtherPlayerEnterHomeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OtherPlayerEnterHomeNotifyOuterClass.OtherPlayerEnterHomeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OtherPlayerEnterHomeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OtherPlayerEnterHomeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n OtherPlayerEnterHomeNotify.proto\"\217\001\n\032O" +
      "therPlayerEnterHomeNotify\022\020\n\010nickname\030\r " +
      "\001(\t\0222\n\006reason\030\016 \001(\0162\".OtherPlayerEnterHo" +
      "meNotify.Reason\"+\n\006Reason\022\013\n\007INVALID\020\000\022\t" +
      "\n\005ENTER\020\001\022\t\n\005LEAVE\020\002B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OtherPlayerEnterHomeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OtherPlayerEnterHomeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OtherPlayerEnterHomeNotify_descriptor,
        new java.lang.String[] { "Nickname", "Reason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
