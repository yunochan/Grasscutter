// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PrivateChatReq.proto

package emu.grasscutter.net.proto;

public final class PrivateChatReqOuterClass {
  private PrivateChatReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PrivateChatReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PrivateChatReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 5;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>string text = 12;</code>
     * @return Whether the text field is set.
     */
    boolean hasText();
    /**
     * <code>string text = 12;</code>
     * @return The text.
     */
    java.lang.String getText();
    /**
     * <code>string text = 12;</code>
     * @return The bytes for text.
     */
    com.google.protobuf.ByteString
        getTextBytes();

    /**
     * <code>uint32 icon = 11;</code>
     * @return Whether the icon field is set.
     */
    boolean hasIcon();
    /**
     * <code>uint32 icon = 11;</code>
     * @return The icon.
     */
    int getIcon();

    public emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq.ContentCase getContentCase();
  }
  /**
   * <pre>
   * CmdId: 8163
   * Obf: LOHLOJMOCAG
   * </pre>
   *
   * Protobuf type {@code PrivateChatReq}
   */
  public static final class PrivateChatReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PrivateChatReq)
      PrivateChatReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PrivateChatReq.newBuilder() to construct.
    private PrivateChatReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PrivateChatReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PrivateChatReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PrivateChatReqOuterClass.internal_static_PrivateChatReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PrivateChatReqOuterClass.internal_static_PrivateChatReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq.class, emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq.Builder.class);
    }

    private int contentCase_ = 0;
    private java.lang.Object content_;
    public enum ContentCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      TEXT(12),
      ICON(11),
      CONTENT_NOT_SET(0);
      private final int value;
      private ContentCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ContentCase valueOf(int value) {
        return forNumber(value);
      }

      public static ContentCase forNumber(int value) {
        switch (value) {
          case 12: return TEXT;
          case 11: return ICON;
          case 0: return CONTENT_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ContentCase
    getContentCase() {
      return ContentCase.forNumber(
          contentCase_);
    }

    public static final int TARGET_UID_FIELD_NUMBER = 5;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 5;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int TEXT_FIELD_NUMBER = 12;
    /**
     * <code>string text = 12;</code>
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return contentCase_ == 12;
    }
    /**
     * <code>string text = 12;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = "";
      if (contentCase_ == 12) {
        ref = content_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (contentCase_ == 12) {
          content_ = s;
        }
        return s;
      }
    }
    /**
     * <code>string text = 12;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = "";
      if (contentCase_ == 12) {
        ref = content_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (contentCase_ == 12) {
          content_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ICON_FIELD_NUMBER = 11;
    /**
     * <code>uint32 icon = 11;</code>
     * @return Whether the icon field is set.
     */
    @java.lang.Override
    public boolean hasIcon() {
      return contentCase_ == 11;
    }
    /**
     * <code>uint32 icon = 11;</code>
     * @return The icon.
     */
    @java.lang.Override
    public int getIcon() {
      if (contentCase_ == 11) {
        return (java.lang.Integer) content_;
      }
      return 0;
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
      if (targetUid_ != 0) {
        output.writeUInt32(5, targetUid_);
      }
      if (contentCase_ == 11) {
        output.writeUInt32(
            11, (int)((java.lang.Integer) content_));
      }
      if (contentCase_ == 12) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, content_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, targetUid_);
      }
      if (contentCase_ == 11) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              11, (int)((java.lang.Integer) content_));
      }
      if (contentCase_ == 12) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, content_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq other = (emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (!getContentCase().equals(other.getContentCase())) return false;
      switch (contentCase_) {
        case 12:
          if (!getText()
              .equals(other.getText())) return false;
          break;
        case 11:
          if (getIcon()
              != other.getIcon()) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      switch (contentCase_) {
        case 12:
          hash = (37 * hash) + TEXT_FIELD_NUMBER;
          hash = (53 * hash) + getText().hashCode();
          break;
        case 11:
          hash = (37 * hash) + ICON_FIELD_NUMBER;
          hash = (53 * hash) + getIcon();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq prototype) {
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
     * CmdId: 8163
     * Obf: LOHLOJMOCAG
     * </pre>
     *
     * Protobuf type {@code PrivateChatReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PrivateChatReq)
        emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PrivateChatReqOuterClass.internal_static_PrivateChatReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PrivateChatReqOuterClass.internal_static_PrivateChatReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq.class, emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetUid_ = 0;

        contentCase_ = 0;
        content_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PrivateChatReqOuterClass.internal_static_PrivateChatReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq build() {
        emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq buildPartial() {
        emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq result = new emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq(this);
        result.targetUid_ = targetUid_;
        if (contentCase_ == 12) {
          result.content_ = content_;
        }
        if (contentCase_ == 11) {
          result.content_ = content_;
        }
        result.contentCase_ = contentCase_;
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
        if (other instanceof emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq) {
          return mergeFrom((emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq other) {
        if (other == emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        switch (other.getContentCase()) {
          case TEXT: {
            contentCase_ = 12;
            content_ = other.content_;
            onChanged();
            break;
          }
          case ICON: {
            setIcon(other.getIcon());
            break;
          }
          case CONTENT_NOT_SET: {
            break;
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
              case 40: {
                targetUid_ = input.readUInt32();

                break;
              } // case 40
              case 88: {
                content_ = input.readUInt32();
                contentCase_ = 11;
                break;
              } // case 88
              case 98: {
                java.lang.String s = input.readStringRequireUtf8();
                contentCase_ = 12;
                content_ = s;
                break;
              } // case 98
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
      private int contentCase_ = 0;
      private java.lang.Object content_;
      public ContentCase
          getContentCase() {
        return ContentCase.forNumber(
            contentCase_);
      }

      public Builder clearContent() {
        contentCase_ = 0;
        content_ = null;
        onChanged();
        return this;
      }


      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 5;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 5;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>string text = 12;</code>
       * @return Whether the text field is set.
       */
      @java.lang.Override
      public boolean hasText() {
        return contentCase_ == 12;
      }
      /**
       * <code>string text = 12;</code>
       * @return The text.
       */
      @java.lang.Override
      public java.lang.String getText() {
        java.lang.Object ref = "";
        if (contentCase_ == 12) {
          ref = content_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (contentCase_ == 12) {
            content_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string text = 12;</code>
       * @return The bytes for text.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = "";
        if (contentCase_ == 12) {
          ref = content_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (contentCase_ == 12) {
            content_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string text = 12;</code>
       * @param value The text to set.
       * @return This builder for chaining.
       */
      public Builder setText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  contentCase_ = 12;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string text = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearText() {
        if (contentCase_ == 12) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>string text = 12;</code>
       * @param value The bytes for text to set.
       * @return This builder for chaining.
       */
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        contentCase_ = 12;
        content_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>uint32 icon = 11;</code>
       * @return Whether the icon field is set.
       */
      public boolean hasIcon() {
        return contentCase_ == 11;
      }
      /**
       * <code>uint32 icon = 11;</code>
       * @return The icon.
       */
      public int getIcon() {
        if (contentCase_ == 11) {
          return (java.lang.Integer) content_;
        }
        return 0;
      }
      /**
       * <code>uint32 icon = 11;</code>
       * @param value The icon to set.
       * @return This builder for chaining.
       */
      public Builder setIcon(int value) {
        contentCase_ = 11;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 icon = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIcon() {
        if (contentCase_ == 11) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:PrivateChatReq)
    }

    // @@protoc_insertion_point(class_scope:PrivateChatReq)
    private static final emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq();
    }

    public static emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PrivateChatReq>
        PARSER = new com.google.protobuf.AbstractParser<PrivateChatReq>() {
      @java.lang.Override
      public PrivateChatReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PrivateChatReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PrivateChatReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PrivateChatReqOuterClass.PrivateChatReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PrivateChatReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PrivateChatReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024PrivateChatReq.proto\"O\n\016PrivateChatReq" +
      "\022\022\n\ntarget_uid\030\005 \001(\r\022\016\n\004text\030\014 \001(\tH\000\022\016\n\004" +
      "icon\030\013 \001(\rH\000B\t\n\007contentB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PrivateChatReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PrivateChatReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PrivateChatReq_descriptor,
        new java.lang.String[] { "TargetUid", "Text", "Icon", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
