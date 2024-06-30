// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: INLACFDCBDF.proto

package emu.grasscutter.net.proto;

public final class INLACFDCBDFOuterClass {
  private INLACFDCBDFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface INLACFDCBDFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:INLACFDCBDF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 max_score = 2;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 INHKDNJEOAP = 15;</code>
     * @return The iNHKDNJEOAP.
     */
    int getINHKDNJEOAP();
  }
  /**
   * Protobuf type {@code INLACFDCBDF}
   */
  public static final class INLACFDCBDF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:INLACFDCBDF)
      INLACFDCBDFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use INLACFDCBDF.newBuilder() to construct.
    private INLACFDCBDF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private INLACFDCBDF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new INLACFDCBDF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.INLACFDCBDFOuterClass.internal_static_INLACFDCBDF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.INLACFDCBDFOuterClass.internal_static_INLACFDCBDF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF.class, emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF.Builder.class);
    }

    public static final int IS_FINISH_FIELD_NUMBER = 10;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 2;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 2;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 14;
    private int levelId_;
    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 4;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int INHKDNJEOAP_FIELD_NUMBER = 15;
    private int iNHKDNJEOAP_;
    /**
     * <code>uint32 INHKDNJEOAP = 15;</code>
     * @return The iNHKDNJEOAP.
     */
    @java.lang.Override
    public int getINHKDNJEOAP() {
      return iNHKDNJEOAP_;
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
      if (maxScore_ != 0) {
        output.writeUInt32(2, maxScore_);
      }
      if (isOpen_ != false) {
        output.writeBool(4, isOpen_);
      }
      if (isFinish_ != false) {
        output.writeBool(10, isFinish_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(14, levelId_);
      }
      if (iNHKDNJEOAP_ != 0) {
        output.writeUInt32(15, iNHKDNJEOAP_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, maxScore_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isOpen_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFinish_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, levelId_);
      }
      if (iNHKDNJEOAP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, iNHKDNJEOAP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF other = (emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF) obj;

      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getINHKDNJEOAP()
          != other.getINHKDNJEOAP()) return false;
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
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + INHKDNJEOAP_FIELD_NUMBER;
      hash = (53 * hash) + getINHKDNJEOAP();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF prototype) {
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
     * Protobuf type {@code INLACFDCBDF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:INLACFDCBDF)
        emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.INLACFDCBDFOuterClass.internal_static_INLACFDCBDF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.INLACFDCBDFOuterClass.internal_static_INLACFDCBDF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF.class, emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isFinish_ = false;

        maxScore_ = 0;

        levelId_ = 0;

        isOpen_ = false;

        iNHKDNJEOAP_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.INLACFDCBDFOuterClass.internal_static_INLACFDCBDF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF build() {
        emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF buildPartial() {
        emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF result = new emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF(this);
        result.isFinish_ = isFinish_;
        result.maxScore_ = maxScore_;
        result.levelId_ = levelId_;
        result.isOpen_ = isOpen_;
        result.iNHKDNJEOAP_ = iNHKDNJEOAP_;
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
        if (other instanceof emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF) {
          return mergeFrom((emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF other) {
        if (other == emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF.getDefaultInstance()) return this;
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getINHKDNJEOAP() != 0) {
          setINHKDNJEOAP(other.getINHKDNJEOAP());
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
                maxScore_ = input.readUInt32();

                break;
              } // case 16
              case 32: {
                isOpen_ = input.readBool();

                break;
              } // case 32
              case 80: {
                isFinish_ = input.readBool();

                break;
              } // case 80
              case 112: {
                levelId_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                iNHKDNJEOAP_ = input.readUInt32();

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

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 10;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 10;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 2;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 2;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 14;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 4;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int iNHKDNJEOAP_ ;
      /**
       * <code>uint32 INHKDNJEOAP = 15;</code>
       * @return The iNHKDNJEOAP.
       */
      @java.lang.Override
      public int getINHKDNJEOAP() {
        return iNHKDNJEOAP_;
      }
      /**
       * <code>uint32 INHKDNJEOAP = 15;</code>
       * @param value The iNHKDNJEOAP to set.
       * @return This builder for chaining.
       */
      public Builder setINHKDNJEOAP(int value) {
        
        iNHKDNJEOAP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 INHKDNJEOAP = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearINHKDNJEOAP() {
        
        iNHKDNJEOAP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:INLACFDCBDF)
    }

    // @@protoc_insertion_point(class_scope:INLACFDCBDF)
    private static final emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF();
    }

    public static emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<INLACFDCBDF>
        PARSER = new com.google.protobuf.AbstractParser<INLACFDCBDF>() {
      @java.lang.Override
      public INLACFDCBDF parsePartialFrom(
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

    public static com.google.protobuf.Parser<INLACFDCBDF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<INLACFDCBDF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.INLACFDCBDFOuterClass.INLACFDCBDF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_INLACFDCBDF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_INLACFDCBDF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021INLACFDCBDF.proto\"k\n\013INLACFDCBDF\022\021\n\tis" +
      "_finish\030\n \001(\010\022\021\n\tmax_score\030\002 \001(\r\022\020\n\010leve" +
      "l_id\030\016 \001(\r\022\017\n\007is_open\030\004 \001(\010\022\023\n\013INHKDNJEO" +
      "AP\030\017 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_INLACFDCBDF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_INLACFDCBDF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_INLACFDCBDF_descriptor,
        new java.lang.String[] { "IsFinish", "MaxScore", "LevelId", "IsOpen", "INHKDNJEOAP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
