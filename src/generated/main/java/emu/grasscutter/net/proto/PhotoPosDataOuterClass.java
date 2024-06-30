// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PhotoPosData.proto

package emu.grasscutter.net.proto;

public final class PhotoPosDataOuterClass {
  private PhotoPosDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PhotoPosDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PhotoPosData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>bool is_view = 9;</code>
     * @return The isView.
     */
    boolean getIsView();

    /**
     * <code>uint32 open_time = 2;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>.Vector center = 15;</code>
     * @return Whether the center field is set.
     */
    boolean hasCenter();
    /**
     * <code>.Vector center = 15;</code>
     * @return The center.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter();
    /**
     * <code>.Vector center = 15;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder();

    /**
     * <code>uint32 pos_id = 4;</code>
     * @return The posId.
     */
    int getPosId();
  }
  /**
   * <pre>
   * Obf: AOMHKNOLLMO
   * </pre>
   *
   * Protobuf type {@code PhotoPosData}
   */
  public static final class PhotoPosData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PhotoPosData)
      PhotoPosDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PhotoPosData.newBuilder() to construct.
    private PhotoPosData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PhotoPosData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PhotoPosData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PhotoPosDataOuterClass.internal_static_PhotoPosData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PhotoPosDataOuterClass.internal_static_PhotoPosData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData.class, emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 11;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int IS_VIEW_FIELD_NUMBER = 9;
    private boolean isView_;
    /**
     * <code>bool is_view = 9;</code>
     * @return The isView.
     */
    @java.lang.Override
    public boolean getIsView() {
      return isView_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 2;
    private int openTime_;
    /**
     * <code>uint32 open_time = 2;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int CENTER_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector center_;
    /**
     * <code>.Vector center = 15;</code>
     * @return Whether the center field is set.
     */
    @java.lang.Override
    public boolean hasCenter() {
      return center_ != null;
    }
    /**
     * <code>.Vector center = 15;</code>
     * @return The center.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter() {
      return center_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
    }
    /**
     * <code>.Vector center = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
      return getCenter();
    }

    public static final int POS_ID_FIELD_NUMBER = 4;
    private int posId_;
    /**
     * <code>uint32 pos_id = 4;</code>
     * @return The posId.
     */
    @java.lang.Override
    public int getPosId() {
      return posId_;
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
      if (openTime_ != 0) {
        output.writeUInt32(2, openTime_);
      }
      if (posId_ != 0) {
        output.writeUInt32(4, posId_);
      }
      if (isView_ != false) {
        output.writeBool(9, isView_);
      }
      if (isOpen_ != false) {
        output.writeBool(11, isOpen_);
      }
      if (center_ != null) {
        output.writeMessage(15, getCenter());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, openTime_);
      }
      if (posId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, posId_);
      }
      if (isView_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isView_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isOpen_);
      }
      if (center_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getCenter());
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
      if (!(obj instanceof emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData other = (emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getIsView()
          != other.getIsView()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (hasCenter() != other.hasCenter()) return false;
      if (hasCenter()) {
        if (!getCenter()
            .equals(other.getCenter())) return false;
      }
      if (getPosId()
          != other.getPosId()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + IS_VIEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsView());
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      if (hasCenter()) {
        hash = (37 * hash) + CENTER_FIELD_NUMBER;
        hash = (53 * hash) + getCenter().hashCode();
      }
      hash = (37 * hash) + POS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPosId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData prototype) {
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
     * Obf: AOMHKNOLLMO
     * </pre>
     *
     * Protobuf type {@code PhotoPosData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PhotoPosData)
        emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PhotoPosDataOuterClass.internal_static_PhotoPosData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PhotoPosDataOuterClass.internal_static_PhotoPosData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData.class, emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isOpen_ = false;

        isView_ = false;

        openTime_ = 0;

        if (centerBuilder_ == null) {
          center_ = null;
        } else {
          center_ = null;
          centerBuilder_ = null;
        }
        posId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PhotoPosDataOuterClass.internal_static_PhotoPosData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData build() {
        emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData buildPartial() {
        emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData result = new emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData(this);
        result.isOpen_ = isOpen_;
        result.isView_ = isView_;
        result.openTime_ = openTime_;
        if (centerBuilder_ == null) {
          result.center_ = center_;
        } else {
          result.center_ = centerBuilder_.build();
        }
        result.posId_ = posId_;
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
        if (other instanceof emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData) {
          return mergeFrom((emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData other) {
        if (other == emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getIsView() != false) {
          setIsView(other.getIsView());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.hasCenter()) {
          mergeCenter(other.getCenter());
        }
        if (other.getPosId() != 0) {
          setPosId(other.getPosId());
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
              case 16: {
                openTime_ = input.readUInt32();

                break;
              } // case 16
              case 32: {
                posId_ = input.readUInt32();

                break;
              } // case 32
              case 72: {
                isView_ = input.readBool();

                break;
              } // case 72
              case 88: {
                isOpen_ = input.readBool();

                break;
              } // case 88
              case 122: {
                input.readMessage(
                    getCenterFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 122
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

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 11;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 11;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private boolean isView_ ;
      /**
       * <code>bool is_view = 9;</code>
       * @return The isView.
       */
      @java.lang.Override
      public boolean getIsView() {
        return isView_;
      }
      /**
       * <code>bool is_view = 9;</code>
       * @param value The isView to set.
       * @return This builder for chaining.
       */
      public Builder setIsView(boolean value) {
        
        isView_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_view = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsView() {
        
        isView_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 2;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 2;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector center_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> centerBuilder_;
      /**
       * <code>.Vector center = 15;</code>
       * @return Whether the center field is set.
       */
      public boolean hasCenter() {
        return centerBuilder_ != null || center_ != null;
      }
      /**
       * <code>.Vector center = 15;</code>
       * @return The center.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter() {
        if (centerBuilder_ == null) {
          return center_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        } else {
          return centerBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector center = 15;</code>
       */
      public Builder setCenter(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          center_ = value;
          onChanged();
        } else {
          centerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 15;</code>
       */
      public Builder setCenter(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (centerBuilder_ == null) {
          center_ = builderForValue.build();
          onChanged();
        } else {
          centerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector center = 15;</code>
       */
      public Builder mergeCenter(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (center_ != null) {
            center_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(center_).mergeFrom(value).buildPartial();
          } else {
            center_ = value;
          }
          onChanged();
        } else {
          centerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 15;</code>
       */
      public Builder clearCenter() {
        if (centerBuilder_ == null) {
          center_ = null;
          onChanged();
        } else {
          center_ = null;
          centerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector center = 15;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCenterBuilder() {
        
        onChanged();
        return getCenterFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector center = 15;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
        if (centerBuilder_ != null) {
          return centerBuilder_.getMessageOrBuilder();
        } else {
          return center_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        }
      }
      /**
       * <code>.Vector center = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCenterFieldBuilder() {
        if (centerBuilder_ == null) {
          centerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCenter(),
                  getParentForChildren(),
                  isClean());
          center_ = null;
        }
        return centerBuilder_;
      }

      private int posId_ ;
      /**
       * <code>uint32 pos_id = 4;</code>
       * @return The posId.
       */
      @java.lang.Override
      public int getPosId() {
        return posId_;
      }
      /**
       * <code>uint32 pos_id = 4;</code>
       * @param value The posId to set.
       * @return This builder for chaining.
       */
      public Builder setPosId(int value) {
        
        posId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pos_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPosId() {
        
        posId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PhotoPosData)
    }

    // @@protoc_insertion_point(class_scope:PhotoPosData)
    private static final emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData();
    }

    public static emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PhotoPosData>
        PARSER = new com.google.protobuf.AbstractParser<PhotoPosData>() {
      @java.lang.Override
      public PhotoPosData parsePartialFrom(
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

    public static com.google.protobuf.Parser<PhotoPosData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PhotoPosData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PhotoPosDataOuterClass.PhotoPosData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PhotoPosData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PhotoPosData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022PhotoPosData.proto\032\014Vector.proto\"l\n\014Ph" +
      "otoPosData\022\017\n\007is_open\030\013 \001(\010\022\017\n\007is_view\030\t" +
      " \001(\010\022\021\n\topen_time\030\002 \001(\r\022\027\n\006center\030\017 \001(\0132" +
      "\007.Vector\022\016\n\006pos_id\030\004 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_PhotoPosData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PhotoPosData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PhotoPosData_descriptor,
        new java.lang.String[] { "IsOpen", "IsView", "OpenTime", "Center", "PosId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
