// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeBeHelpedNotify.proto

package emu.grasscutter.net.proto;

public final class FurnitureMakeBeHelpedNotifyOuterClass {
  private FurnitureMakeBeHelpedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeBeHelpedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeBeHelpedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
     * @return Whether the furnitureMakeHelpedData field is set.
     */
    boolean hasFurnitureMakeHelpedData();
    /**
     * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
     * @return The furnitureMakeHelpedData.
     */
    emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getFurnitureMakeHelpedData();
    /**
     * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
     */
    emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder getFurnitureMakeHelpedDataOrBuilder();

    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     * @return Whether the furnitureMakeSlot field is set.
     */
    boolean hasFurnitureMakeSlot();
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     * @return The furnitureMakeSlot.
     */
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot();
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     */
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 22219
   * Obf: JAIJGEPLECI
   * </pre>
   *
   * Protobuf type {@code FurnitureMakeBeHelpedNotify}
   */
  public static final class FurnitureMakeBeHelpedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeBeHelpedNotify)
      FurnitureMakeBeHelpedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeBeHelpedNotify.newBuilder() to construct.
    private FurnitureMakeBeHelpedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeBeHelpedNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeBeHelpedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.internal_static_FurnitureMakeBeHelpedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.internal_static_FurnitureMakeBeHelpedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify.class, emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify.Builder.class);
    }

    public static final int FURNITURE_MAKE_HELPED_DATA_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData furnitureMakeHelpedData_;
    /**
     * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
     * @return Whether the furnitureMakeHelpedData field is set.
     */
    @java.lang.Override
    public boolean hasFurnitureMakeHelpedData() {
      return furnitureMakeHelpedData_ != null;
    }
    /**
     * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
     * @return The furnitureMakeHelpedData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getFurnitureMakeHelpedData() {
      return furnitureMakeHelpedData_ == null ? emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.getDefaultInstance() : furnitureMakeHelpedData_;
    }
    /**
     * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder getFurnitureMakeHelpedDataOrBuilder() {
      return getFurnitureMakeHelpedData();
    }

    public static final int FURNITURE_MAKE_SLOT_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     * @return Whether the furnitureMakeSlot field is set.
     */
    @java.lang.Override
    public boolean hasFurnitureMakeSlot() {
      return furnitureMakeSlot_ != null;
    }
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     * @return The furnitureMakeSlot.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
      return furnitureMakeSlot_ == null ? emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
    }
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
      return getFurnitureMakeSlot();
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
      if (furnitureMakeSlot_ != null) {
        output.writeMessage(5, getFurnitureMakeSlot());
      }
      if (furnitureMakeHelpedData_ != null) {
        output.writeMessage(9, getFurnitureMakeHelpedData());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (furnitureMakeSlot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getFurnitureMakeSlot());
      }
      if (furnitureMakeHelpedData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getFurnitureMakeHelpedData());
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
      if (!(obj instanceof emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify other = (emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify) obj;

      if (hasFurnitureMakeHelpedData() != other.hasFurnitureMakeHelpedData()) return false;
      if (hasFurnitureMakeHelpedData()) {
        if (!getFurnitureMakeHelpedData()
            .equals(other.getFurnitureMakeHelpedData())) return false;
      }
      if (hasFurnitureMakeSlot() != other.hasFurnitureMakeSlot()) return false;
      if (hasFurnitureMakeSlot()) {
        if (!getFurnitureMakeSlot()
            .equals(other.getFurnitureMakeSlot())) return false;
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
      if (hasFurnitureMakeHelpedData()) {
        hash = (37 * hash) + FURNITURE_MAKE_HELPED_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureMakeHelpedData().hashCode();
      }
      if (hasFurnitureMakeSlot()) {
        hash = (37 * hash) + FURNITURE_MAKE_SLOT_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureMakeSlot().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify prototype) {
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
     * CmdId: 22219
     * Obf: JAIJGEPLECI
     * </pre>
     *
     * Protobuf type {@code FurnitureMakeBeHelpedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeBeHelpedNotify)
        emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.internal_static_FurnitureMakeBeHelpedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.internal_static_FurnitureMakeBeHelpedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify.class, emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (furnitureMakeHelpedDataBuilder_ == null) {
          furnitureMakeHelpedData_ = null;
        } else {
          furnitureMakeHelpedData_ = null;
          furnitureMakeHelpedDataBuilder_ = null;
        }
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlot_ = null;
        } else {
          furnitureMakeSlot_ = null;
          furnitureMakeSlotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.internal_static_FurnitureMakeBeHelpedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify build() {
        emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify buildPartial() {
        emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify result = new emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify(this);
        if (furnitureMakeHelpedDataBuilder_ == null) {
          result.furnitureMakeHelpedData_ = furnitureMakeHelpedData_;
        } else {
          result.furnitureMakeHelpedData_ = furnitureMakeHelpedDataBuilder_.build();
        }
        if (furnitureMakeSlotBuilder_ == null) {
          result.furnitureMakeSlot_ = furnitureMakeSlot_;
        } else {
          result.furnitureMakeSlot_ = furnitureMakeSlotBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify other) {
        if (other == emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify.getDefaultInstance()) return this;
        if (other.hasFurnitureMakeHelpedData()) {
          mergeFurnitureMakeHelpedData(other.getFurnitureMakeHelpedData());
        }
        if (other.hasFurnitureMakeSlot()) {
          mergeFurnitureMakeSlot(other.getFurnitureMakeSlot());
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
              case 42: {
                input.readMessage(
                    getFurnitureMakeSlotFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 42
              case 74: {
                input.readMessage(
                    getFurnitureMakeHelpedDataFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 74
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

      private emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData furnitureMakeHelpedData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData, emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder, emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder> furnitureMakeHelpedDataBuilder_;
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       * @return Whether the furnitureMakeHelpedData field is set.
       */
      public boolean hasFurnitureMakeHelpedData() {
        return furnitureMakeHelpedDataBuilder_ != null || furnitureMakeHelpedData_ != null;
      }
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       * @return The furnitureMakeHelpedData.
       */
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getFurnitureMakeHelpedData() {
        if (furnitureMakeHelpedDataBuilder_ == null) {
          return furnitureMakeHelpedData_ == null ? emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.getDefaultInstance() : furnitureMakeHelpedData_;
        } else {
          return furnitureMakeHelpedDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       */
      public Builder setFurnitureMakeHelpedData(emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData value) {
        if (furnitureMakeHelpedDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          furnitureMakeHelpedData_ = value;
          onChanged();
        } else {
          furnitureMakeHelpedDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       */
      public Builder setFurnitureMakeHelpedData(
          emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder builderForValue) {
        if (furnitureMakeHelpedDataBuilder_ == null) {
          furnitureMakeHelpedData_ = builderForValue.build();
          onChanged();
        } else {
          furnitureMakeHelpedDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       */
      public Builder mergeFurnitureMakeHelpedData(emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData value) {
        if (furnitureMakeHelpedDataBuilder_ == null) {
          if (furnitureMakeHelpedData_ != null) {
            furnitureMakeHelpedData_ =
              emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.newBuilder(furnitureMakeHelpedData_).mergeFrom(value).buildPartial();
          } else {
            furnitureMakeHelpedData_ = value;
          }
          onChanged();
        } else {
          furnitureMakeHelpedDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       */
      public Builder clearFurnitureMakeHelpedData() {
        if (furnitureMakeHelpedDataBuilder_ == null) {
          furnitureMakeHelpedData_ = null;
          onChanged();
        } else {
          furnitureMakeHelpedData_ = null;
          furnitureMakeHelpedDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder getFurnitureMakeHelpedDataBuilder() {
        
        onChanged();
        return getFurnitureMakeHelpedDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder getFurnitureMakeHelpedDataOrBuilder() {
        if (furnitureMakeHelpedDataBuilder_ != null) {
          return furnitureMakeHelpedDataBuilder_.getMessageOrBuilder();
        } else {
          return furnitureMakeHelpedData_ == null ?
              emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.getDefaultInstance() : furnitureMakeHelpedData_;
        }
      }
      /**
       * <code>.FurnitureMakeBeHelpedData furniture_make_helped_data = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData, emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder, emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder> 
          getFurnitureMakeHelpedDataFieldBuilder() {
        if (furnitureMakeHelpedDataBuilder_ == null) {
          furnitureMakeHelpedDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData, emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder, emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder>(
                  getFurnitureMakeHelpedData(),
                  getParentForChildren(),
                  isClean());
          furnitureMakeHelpedData_ = null;
        }
        return furnitureMakeHelpedDataBuilder_;
      }

      private emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> furnitureMakeSlotBuilder_;
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       * @return Whether the furnitureMakeSlot field is set.
       */
      public boolean hasFurnitureMakeSlot() {
        return furnitureMakeSlotBuilder_ != null || furnitureMakeSlot_ != null;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       * @return The furnitureMakeSlot.
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
        if (furnitureMakeSlotBuilder_ == null) {
          return furnitureMakeSlot_ == null ? emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
        } else {
          return furnitureMakeSlotBuilder_.getMessage();
        }
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public Builder setFurnitureMakeSlot(emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
        if (furnitureMakeSlotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          furnitureMakeSlot_ = value;
          onChanged();
        } else {
          furnitureMakeSlotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public Builder setFurnitureMakeSlot(
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder builderForValue) {
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlot_ = builderForValue.build();
          onChanged();
        } else {
          furnitureMakeSlotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public Builder mergeFurnitureMakeSlot(emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
        if (furnitureMakeSlotBuilder_ == null) {
          if (furnitureMakeSlot_ != null) {
            furnitureMakeSlot_ =
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder(furnitureMakeSlot_).mergeFrom(value).buildPartial();
          } else {
            furnitureMakeSlot_ = value;
          }
          onChanged();
        } else {
          furnitureMakeSlotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public Builder clearFurnitureMakeSlot() {
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlot_ = null;
          onChanged();
        } else {
          furnitureMakeSlot_ = null;
          furnitureMakeSlotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder getFurnitureMakeSlotBuilder() {
        
        onChanged();
        return getFurnitureMakeSlotFieldBuilder().getBuilder();
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
        if (furnitureMakeSlotBuilder_ != null) {
          return furnitureMakeSlotBuilder_.getMessageOrBuilder();
        } else {
          return furnitureMakeSlot_ == null ?
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
        }
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> 
          getFurnitureMakeSlotFieldBuilder() {
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder>(
                  getFurnitureMakeSlot(),
                  getParentForChildren(),
                  isClean());
          furnitureMakeSlot_ = null;
        }
        return furnitureMakeSlotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FurnitureMakeBeHelpedNotify)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeBeHelpedNotify)
    private static final emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify();
    }

    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeBeHelpedNotify>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeBeHelpedNotify>() {
      @java.lang.Override
      public FurnitureMakeBeHelpedNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FurnitureMakeBeHelpedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeBeHelpedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeBeHelpedNotifyOuterClass.FurnitureMakeBeHelpedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeBeHelpedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeBeHelpedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FurnitureMakeBeHelpedNotify.proto\032\037Fur" +
      "nitureMakeBeHelpedData.proto\032\027FurnitureM" +
      "akeSlot.proto\"\216\001\n\033FurnitureMakeBeHelpedN" +
      "otify\022>\n\032furniture_make_helped_data\030\t \001(" +
      "\0132\032.FurnitureMakeBeHelpedData\022/\n\023furnitu" +
      "re_make_slot\030\005 \001(\0132\022.FurnitureMakeSlotB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.getDescriptor(),
        });
    internal_static_FurnitureMakeBeHelpedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeBeHelpedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeBeHelpedNotify_descriptor,
        new java.lang.String[] { "FurnitureMakeHelpedData", "FurnitureMakeSlot", });
    emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.getDescriptor();
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
