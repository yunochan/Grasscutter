// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JigsawPictureData.proto

package emu.grasscutter.net.proto;

public final class JigsawPictureDataOuterClass {
  private JigsawPictureDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JigsawPictureDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JigsawPictureData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 7;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 MMGJJBELBHF = 11;</code>
     * @return The mMGJJBELBHF.
     */
    int getMMGJJBELBHF();

    /**
     * <code>uint32 EEMGKJOCHHK = 6;</code>
     * @return The eEMGKJOCHHK.
     */
    int getEEMGKJOCHHK();

    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Obf: NGJPKLPJAGG
   * </pre>
   *
   * Protobuf type {@code JigsawPictureData}
   */
  public static final class JigsawPictureData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JigsawPictureData)
      JigsawPictureDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JigsawPictureData.newBuilder() to construct.
    private JigsawPictureData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JigsawPictureData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JigsawPictureData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.class, emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 7;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 7;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int MMGJJBELBHF_FIELD_NUMBER = 11;
    private int mMGJJBELBHF_;
    /**
     * <code>uint32 MMGJJBELBHF = 11;</code>
     * @return The mMGJJBELBHF.
     */
    @java.lang.Override
    public int getMMGJJBELBHF() {
      return mMGJJBELBHF_;
    }

    public static final int EEMGKJOCHHK_FIELD_NUMBER = 6;
    private int eEMGKJOCHHK_;
    /**
     * <code>uint32 EEMGKJOCHHK = 6;</code>
     * @return The eEMGKJOCHHK.
     */
    @java.lang.Override
    public int getEEMGKJOCHHK() {
      return eEMGKJOCHHK_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 2;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (isOpen_ != false) {
        output.writeBool(2, isOpen_);
      }
      if (eEMGKJOCHHK_ != 0) {
        output.writeUInt32(6, eEMGKJOCHHK_);
      }
      if (isFinished_ != false) {
        output.writeBool(7, isFinished_);
      }
      if (mMGJJBELBHF_ != 0) {
        output.writeUInt32(11, mMGJJBELBHF_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isOpen_);
      }
      if (eEMGKJOCHHK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, eEMGKJOCHHK_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isFinished_);
      }
      if (mMGJJBELBHF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, mMGJJBELBHF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData other = (emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getMMGJJBELBHF()
          != other.getMMGJJBELBHF()) return false;
      if (getEEMGKJOCHHK()
          != other.getEEMGKJOCHHK()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + MMGJJBELBHF_FIELD_NUMBER;
      hash = (53 * hash) + getMMGJJBELBHF();
      hash = (37 * hash) + EEMGKJOCHHK_FIELD_NUMBER;
      hash = (53 * hash) + getEEMGKJOCHHK();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData prototype) {
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
     * Obf: NGJPKLPJAGG
     * </pre>
     *
     * Protobuf type {@code JigsawPictureData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JigsawPictureData)
        emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.class, emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isFinished_ = false;

        mMGJJBELBHF_ = 0;

        eEMGKJOCHHK_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData build() {
        emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData buildPartial() {
        emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData result = new emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData(this);
        result.isFinished_ = isFinished_;
        result.mMGJJBELBHF_ = mMGJJBELBHF_;
        result.eEMGKJOCHHK_ = eEMGKJOCHHK_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData) {
          return mergeFrom((emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData other) {
        if (other == emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getMMGJJBELBHF() != 0) {
          setMMGJJBELBHF(other.getMMGJJBELBHF());
        }
        if (other.getEEMGKJOCHHK() != 0) {
          setEEMGKJOCHHK(other.getEEMGKJOCHHK());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
                isOpen_ = input.readBool();

                break;
              } // case 16
              case 48: {
                eEMGKJOCHHK_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                isFinished_ = input.readBool();

                break;
              } // case 56
              case 88: {
                mMGJJBELBHF_ = input.readUInt32();

                break;
              } // case 88
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

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 7;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 7;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int mMGJJBELBHF_ ;
      /**
       * <code>uint32 MMGJJBELBHF = 11;</code>
       * @return The mMGJJBELBHF.
       */
      @java.lang.Override
      public int getMMGJJBELBHF() {
        return mMGJJBELBHF_;
      }
      /**
       * <code>uint32 MMGJJBELBHF = 11;</code>
       * @param value The mMGJJBELBHF to set.
       * @return This builder for chaining.
       */
      public Builder setMMGJJBELBHF(int value) {
        
        mMGJJBELBHF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MMGJJBELBHF = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMMGJJBELBHF() {
        
        mMGJJBELBHF_ = 0;
        onChanged();
        return this;
      }

      private int eEMGKJOCHHK_ ;
      /**
       * <code>uint32 EEMGKJOCHHK = 6;</code>
       * @return The eEMGKJOCHHK.
       */
      @java.lang.Override
      public int getEEMGKJOCHHK() {
        return eEMGKJOCHHK_;
      }
      /**
       * <code>uint32 EEMGKJOCHHK = 6;</code>
       * @param value The eEMGKJOCHHK to set.
       * @return This builder for chaining.
       */
      public Builder setEEMGKJOCHHK(int value) {
        
        eEMGKJOCHHK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EEMGKJOCHHK = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEEMGKJOCHHK() {
        
        eEMGKJOCHHK_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 2;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:JigsawPictureData)
    }

    // @@protoc_insertion_point(class_scope:JigsawPictureData)
    private static final emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData();
    }

    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JigsawPictureData>
        PARSER = new com.google.protobuf.AbstractParser<JigsawPictureData>() {
      @java.lang.Override
      public JigsawPictureData parsePartialFrom(
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

    public static com.google.protobuf.Parser<JigsawPictureData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JigsawPictureData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JigsawPictureData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JigsawPictureData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027JigsawPictureData.proto\"c\n\021JigsawPictu" +
      "reData\022\023\n\013is_finished\030\007 \001(\010\022\023\n\013MMGJJBELB" +
      "HF\030\013 \001(\r\022\023\n\013EEMGKJOCHHK\030\006 \001(\r\022\017\n\007is_open" +
      "\030\002 \001(\010B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JigsawPictureData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JigsawPictureData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JigsawPictureData_descriptor,
        new java.lang.String[] { "IsFinished", "MMGJJBELBHF", "EEMGKJOCHHK", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
