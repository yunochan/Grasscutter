// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: H5ActivityInfo.proto

package emu.grasscutter.net.proto;

public final class H5ActivityInfoOuterClass {
  private H5ActivityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface H5ActivityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:H5ActivityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string prefab_path = 12;</code>
     * @return The prefabPath.
     */
    java.lang.String getPrefabPath();
    /**
     * <code>string prefab_path = 12;</code>
     * @return The bytes for prefabPath.
     */
    com.google.protobuf.ByteString
        getPrefabPathBytes();

    /**
     * <code>string url = 8;</code>
     * @return The url.
     */
    java.lang.String getUrl();
    /**
     * <code>string url = 8;</code>
     * @return The bytes for url.
     */
    com.google.protobuf.ByteString
        getUrlBytes();

    /**
     * <code>bool is_entrance_open = 1;</code>
     * @return The isEntranceOpen.
     */
    boolean getIsEntranceOpen();

    /**
     * <code>uint32 FMENOAFNGHO = 13;</code>
     * @return The fMENOAFNGHO.
     */
    int getFMENOAFNGHO();

    /**
     * <code>uint32 end_time = 3;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 content_close_time = 4;</code>
     * @return The contentCloseTime.
     */
    int getContentCloseTime();

    /**
     * <code>uint32 begin_time = 15;</code>
     * @return The beginTime.
     */
    int getBeginTime();

    /**
     * <code>uint32 JELEFCPLEJB = 14;</code>
     * @return The jELEFCPLEJB.
     */
    int getJELEFCPLEJB();
  }
  /**
   * <pre>
   * Obf: KDDLGDGMJJJ
   * </pre>
   *
   * Protobuf type {@code H5ActivityInfo}
   */
  public static final class H5ActivityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:H5ActivityInfo)
      H5ActivityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use H5ActivityInfo.newBuilder() to construct.
    private H5ActivityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private H5ActivityInfo() {
      prefabPath_ = "";
      url_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new H5ActivityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.H5ActivityInfoOuterClass.internal_static_H5ActivityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.H5ActivityInfoOuterClass.internal_static_H5ActivityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo.class, emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo.Builder.class);
    }

    public static final int PREFAB_PATH_FIELD_NUMBER = 12;
    private volatile java.lang.Object prefabPath_;
    /**
     * <code>string prefab_path = 12;</code>
     * @return The prefabPath.
     */
    @java.lang.Override
    public java.lang.String getPrefabPath() {
      java.lang.Object ref = prefabPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prefabPath_ = s;
        return s;
      }
    }
    /**
     * <code>string prefab_path = 12;</code>
     * @return The bytes for prefabPath.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPrefabPathBytes() {
      java.lang.Object ref = prefabPath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prefabPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int URL_FIELD_NUMBER = 8;
    private volatile java.lang.Object url_;
    /**
     * <code>string url = 8;</code>
     * @return The url.
     */
    @java.lang.Override
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      }
    }
    /**
     * <code>string url = 8;</code>
     * @return The bytes for url.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IS_ENTRANCE_OPEN_FIELD_NUMBER = 1;
    private boolean isEntranceOpen_;
    /**
     * <code>bool is_entrance_open = 1;</code>
     * @return The isEntranceOpen.
     */
    @java.lang.Override
    public boolean getIsEntranceOpen() {
      return isEntranceOpen_;
    }

    public static final int FMENOAFNGHO_FIELD_NUMBER = 13;
    private int fMENOAFNGHO_;
    /**
     * <code>uint32 FMENOAFNGHO = 13;</code>
     * @return The fMENOAFNGHO.
     */
    @java.lang.Override
    public int getFMENOAFNGHO() {
      return fMENOAFNGHO_;
    }

    public static final int END_TIME_FIELD_NUMBER = 3;
    private int endTime_;
    /**
     * <code>uint32 end_time = 3;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int CONTENT_CLOSE_TIME_FIELD_NUMBER = 4;
    private int contentCloseTime_;
    /**
     * <code>uint32 content_close_time = 4;</code>
     * @return The contentCloseTime.
     */
    @java.lang.Override
    public int getContentCloseTime() {
      return contentCloseTime_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 15;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 15;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }

    public static final int JELEFCPLEJB_FIELD_NUMBER = 14;
    private int jELEFCPLEJB_;
    /**
     * <code>uint32 JELEFCPLEJB = 14;</code>
     * @return The jELEFCPLEJB.
     */
    @java.lang.Override
    public int getJELEFCPLEJB() {
      return jELEFCPLEJB_;
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
      if (isEntranceOpen_ != false) {
        output.writeBool(1, isEntranceOpen_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(3, endTime_);
      }
      if (contentCloseTime_ != 0) {
        output.writeUInt32(4, contentCloseTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, url_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prefabPath_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, prefabPath_);
      }
      if (fMENOAFNGHO_ != 0) {
        output.writeUInt32(13, fMENOAFNGHO_);
      }
      if (jELEFCPLEJB_ != 0) {
        output.writeUInt32(14, jELEFCPLEJB_);
      }
      if (beginTime_ != 0) {
        output.writeUInt32(15, beginTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isEntranceOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isEntranceOpen_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, endTime_);
      }
      if (contentCloseTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, contentCloseTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, url_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prefabPath_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, prefabPath_);
      }
      if (fMENOAFNGHO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, fMENOAFNGHO_);
      }
      if (jELEFCPLEJB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, jELEFCPLEJB_);
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, beginTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo other = (emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo) obj;

      if (!getPrefabPath()
          .equals(other.getPrefabPath())) return false;
      if (!getUrl()
          .equals(other.getUrl())) return false;
      if (getIsEntranceOpen()
          != other.getIsEntranceOpen()) return false;
      if (getFMENOAFNGHO()
          != other.getFMENOAFNGHO()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getContentCloseTime()
          != other.getContentCloseTime()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (getJELEFCPLEJB()
          != other.getJELEFCPLEJB()) return false;
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
      hash = (37 * hash) + PREFAB_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPrefabPath().hashCode();
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
      hash = (37 * hash) + IS_ENTRANCE_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEntranceOpen());
      hash = (37 * hash) + FMENOAFNGHO_FIELD_NUMBER;
      hash = (53 * hash) + getFMENOAFNGHO();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + CONTENT_CLOSE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getContentCloseTime();
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (37 * hash) + JELEFCPLEJB_FIELD_NUMBER;
      hash = (53 * hash) + getJELEFCPLEJB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo prototype) {
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
     * Obf: KDDLGDGMJJJ
     * </pre>
     *
     * Protobuf type {@code H5ActivityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:H5ActivityInfo)
        emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.H5ActivityInfoOuterClass.internal_static_H5ActivityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.H5ActivityInfoOuterClass.internal_static_H5ActivityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo.class, emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        prefabPath_ = "";

        url_ = "";

        isEntranceOpen_ = false;

        fMENOAFNGHO_ = 0;

        endTime_ = 0;

        contentCloseTime_ = 0;

        beginTime_ = 0;

        jELEFCPLEJB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.H5ActivityInfoOuterClass.internal_static_H5ActivityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo build() {
        emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo buildPartial() {
        emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo result = new emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo(this);
        result.prefabPath_ = prefabPath_;
        result.url_ = url_;
        result.isEntranceOpen_ = isEntranceOpen_;
        result.fMENOAFNGHO_ = fMENOAFNGHO_;
        result.endTime_ = endTime_;
        result.contentCloseTime_ = contentCloseTime_;
        result.beginTime_ = beginTime_;
        result.jELEFCPLEJB_ = jELEFCPLEJB_;
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
        if (other instanceof emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo) {
          return mergeFrom((emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo other) {
        if (other == emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo.getDefaultInstance()) return this;
        if (!other.getPrefabPath().isEmpty()) {
          prefabPath_ = other.prefabPath_;
          onChanged();
        }
        if (!other.getUrl().isEmpty()) {
          url_ = other.url_;
          onChanged();
        }
        if (other.getIsEntranceOpen() != false) {
          setIsEntranceOpen(other.getIsEntranceOpen());
        }
        if (other.getFMENOAFNGHO() != 0) {
          setFMENOAFNGHO(other.getFMENOAFNGHO());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getContentCloseTime() != 0) {
          setContentCloseTime(other.getContentCloseTime());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
        }
        if (other.getJELEFCPLEJB() != 0) {
          setJELEFCPLEJB(other.getJELEFCPLEJB());
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
                isEntranceOpen_ = input.readBool();

                break;
              } // case 8
              case 24: {
                endTime_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                contentCloseTime_ = input.readUInt32();

                break;
              } // case 32
              case 66: {
                url_ = input.readStringRequireUtf8();

                break;
              } // case 66
              case 98: {
                prefabPath_ = input.readStringRequireUtf8();

                break;
              } // case 98
              case 104: {
                fMENOAFNGHO_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                jELEFCPLEJB_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                beginTime_ = input.readUInt32();

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

      private java.lang.Object prefabPath_ = "";
      /**
       * <code>string prefab_path = 12;</code>
       * @return The prefabPath.
       */
      public java.lang.String getPrefabPath() {
        java.lang.Object ref = prefabPath_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          prefabPath_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string prefab_path = 12;</code>
       * @return The bytes for prefabPath.
       */
      public com.google.protobuf.ByteString
          getPrefabPathBytes() {
        java.lang.Object ref = prefabPath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          prefabPath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string prefab_path = 12;</code>
       * @param value The prefabPath to set.
       * @return This builder for chaining.
       */
      public Builder setPrefabPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        prefabPath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string prefab_path = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPrefabPath() {
        
        prefabPath_ = getDefaultInstance().getPrefabPath();
        onChanged();
        return this;
      }
      /**
       * <code>string prefab_path = 12;</code>
       * @param value The bytes for prefabPath to set.
       * @return This builder for chaining.
       */
      public Builder setPrefabPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        prefabPath_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object url_ = "";
      /**
       * <code>string url = 8;</code>
       * @return The url.
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string url = 8;</code>
       * @return The bytes for url.
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string url = 8;</code>
       * @param value The url to set.
       * @return This builder for chaining.
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string url = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUrl() {
        
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string url = 8;</code>
       * @param value The bytes for url to set.
       * @return This builder for chaining.
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        url_ = value;
        onChanged();
        return this;
      }

      private boolean isEntranceOpen_ ;
      /**
       * <code>bool is_entrance_open = 1;</code>
       * @return The isEntranceOpen.
       */
      @java.lang.Override
      public boolean getIsEntranceOpen() {
        return isEntranceOpen_;
      }
      /**
       * <code>bool is_entrance_open = 1;</code>
       * @param value The isEntranceOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsEntranceOpen(boolean value) {
        
        isEntranceOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_entrance_open = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEntranceOpen() {
        
        isEntranceOpen_ = false;
        onChanged();
        return this;
      }

      private int fMENOAFNGHO_ ;
      /**
       * <code>uint32 FMENOAFNGHO = 13;</code>
       * @return The fMENOAFNGHO.
       */
      @java.lang.Override
      public int getFMENOAFNGHO() {
        return fMENOAFNGHO_;
      }
      /**
       * <code>uint32 FMENOAFNGHO = 13;</code>
       * @param value The fMENOAFNGHO to set.
       * @return This builder for chaining.
       */
      public Builder setFMENOAFNGHO(int value) {
        
        fMENOAFNGHO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FMENOAFNGHO = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearFMENOAFNGHO() {
        
        fMENOAFNGHO_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 3;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 3;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int contentCloseTime_ ;
      /**
       * <code>uint32 content_close_time = 4;</code>
       * @return The contentCloseTime.
       */
      @java.lang.Override
      public int getContentCloseTime() {
        return contentCloseTime_;
      }
      /**
       * <code>uint32 content_close_time = 4;</code>
       * @param value The contentCloseTime to set.
       * @return This builder for chaining.
       */
      public Builder setContentCloseTime(int value) {
        
        contentCloseTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 content_close_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearContentCloseTime() {
        
        contentCloseTime_ = 0;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 15;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 15;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
        onChanged();
        return this;
      }

      private int jELEFCPLEJB_ ;
      /**
       * <code>uint32 JELEFCPLEJB = 14;</code>
       * @return The jELEFCPLEJB.
       */
      @java.lang.Override
      public int getJELEFCPLEJB() {
        return jELEFCPLEJB_;
      }
      /**
       * <code>uint32 JELEFCPLEJB = 14;</code>
       * @param value The jELEFCPLEJB to set.
       * @return This builder for chaining.
       */
      public Builder setJELEFCPLEJB(int value) {
        
        jELEFCPLEJB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JELEFCPLEJB = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearJELEFCPLEJB() {
        
        jELEFCPLEJB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:H5ActivityInfo)
    }

    // @@protoc_insertion_point(class_scope:H5ActivityInfo)
    private static final emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo();
    }

    public static emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<H5ActivityInfo>
        PARSER = new com.google.protobuf.AbstractParser<H5ActivityInfo>() {
      @java.lang.Override
      public H5ActivityInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<H5ActivityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<H5ActivityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.H5ActivityInfoOuterClass.H5ActivityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_H5ActivityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_H5ActivityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024H5ActivityInfo.proto\"\270\001\n\016H5ActivityInf" +
      "o\022\023\n\013prefab_path\030\014 \001(\t\022\013\n\003url\030\010 \001(\t\022\030\n\020i" +
      "s_entrance_open\030\001 \001(\010\022\023\n\013FMENOAFNGHO\030\r \001" +
      "(\r\022\020\n\010end_time\030\003 \001(\r\022\032\n\022content_close_ti" +
      "me\030\004 \001(\r\022\022\n\nbegin_time\030\017 \001(\r\022\023\n\013JELEFCPL" +
      "EJB\030\016 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_H5ActivityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_H5ActivityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_H5ActivityInfo_descriptor,
        new java.lang.String[] { "PrefabPath", "Url", "IsEntranceOpen", "FMENOAFNGHO", "EndTime", "ContentCloseTime", "BeginTime", "JELEFCPLEJB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
