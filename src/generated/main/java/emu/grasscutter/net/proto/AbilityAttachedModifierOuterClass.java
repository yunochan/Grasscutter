// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityAttachedModifier.proto

package emu.grasscutter.net.proto;

public final class AbilityAttachedModifierOuterClass {
  private AbilityAttachedModifierOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityAttachedModifierOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityAttachedModifier)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_invalid = 1;</code>
     * @return The isInvalid.
     */
    boolean getIsInvalid();

    /**
     * <code>uint32 owner_entity_id = 2;</code>
     * @return The ownerEntityId.
     */
    int getOwnerEntityId();

    /**
     * <code>uint32 instanced_modifier_id = 3;</code>
     * @return The instancedModifierId.
     */
    int getInstancedModifierId();

    /**
     * <code>bool is_serverbuff_modifier = 4;</code>
     * @return The isServerbuffModifier.
     */
    boolean getIsServerbuffModifier();

    /**
     * <code>int32 attach_name_hash = 5;</code>
     * @return The attachNameHash.
     */
    int getAttachNameHash();
  }
  /**
   * <pre>
   * Obf: COGFLLLFFFC
   * </pre>
   *
   * Protobuf type {@code AbilityAttachedModifier}
   */
  public static final class AbilityAttachedModifier extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityAttachedModifier)
      AbilityAttachedModifierOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityAttachedModifier.newBuilder() to construct.
    private AbilityAttachedModifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityAttachedModifier() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityAttachedModifier();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.class, emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder.class);
    }

    public static final int IS_INVALID_FIELD_NUMBER = 1;
    private boolean isInvalid_;
    /**
     * <code>bool is_invalid = 1;</code>
     * @return The isInvalid.
     */
    @java.lang.Override
    public boolean getIsInvalid() {
      return isInvalid_;
    }

    public static final int OWNER_ENTITY_ID_FIELD_NUMBER = 2;
    private int ownerEntityId_;
    /**
     * <code>uint32 owner_entity_id = 2;</code>
     * @return The ownerEntityId.
     */
    @java.lang.Override
    public int getOwnerEntityId() {
      return ownerEntityId_;
    }

    public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 3;
    private int instancedModifierId_;
    /**
     * <code>uint32 instanced_modifier_id = 3;</code>
     * @return The instancedModifierId.
     */
    @java.lang.Override
    public int getInstancedModifierId() {
      return instancedModifierId_;
    }

    public static final int IS_SERVERBUFF_MODIFIER_FIELD_NUMBER = 4;
    private boolean isServerbuffModifier_;
    /**
     * <code>bool is_serverbuff_modifier = 4;</code>
     * @return The isServerbuffModifier.
     */
    @java.lang.Override
    public boolean getIsServerbuffModifier() {
      return isServerbuffModifier_;
    }

    public static final int ATTACH_NAME_HASH_FIELD_NUMBER = 5;
    private int attachNameHash_;
    /**
     * <code>int32 attach_name_hash = 5;</code>
     * @return The attachNameHash.
     */
    @java.lang.Override
    public int getAttachNameHash() {
      return attachNameHash_;
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
      if (isInvalid_ != false) {
        output.writeBool(1, isInvalid_);
      }
      if (ownerEntityId_ != 0) {
        output.writeUInt32(2, ownerEntityId_);
      }
      if (instancedModifierId_ != 0) {
        output.writeUInt32(3, instancedModifierId_);
      }
      if (isServerbuffModifier_ != false) {
        output.writeBool(4, isServerbuffModifier_);
      }
      if (attachNameHash_ != 0) {
        output.writeInt32(5, attachNameHash_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isInvalid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isInvalid_);
      }
      if (ownerEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, ownerEntityId_);
      }
      if (instancedModifierId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, instancedModifierId_);
      }
      if (isServerbuffModifier_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isServerbuffModifier_);
      }
      if (attachNameHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, attachNameHash_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier other = (emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier) obj;

      if (getIsInvalid()
          != other.getIsInvalid()) return false;
      if (getOwnerEntityId()
          != other.getOwnerEntityId()) return false;
      if (getInstancedModifierId()
          != other.getInstancedModifierId()) return false;
      if (getIsServerbuffModifier()
          != other.getIsServerbuffModifier()) return false;
      if (getAttachNameHash()
          != other.getAttachNameHash()) return false;
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
      hash = (37 * hash) + IS_INVALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInvalid());
      hash = (37 * hash) + OWNER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerEntityId();
      hash = (37 * hash) + INSTANCED_MODIFIER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedModifierId();
      hash = (37 * hash) + IS_SERVERBUFF_MODIFIER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsServerbuffModifier());
      hash = (37 * hash) + ATTACH_NAME_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAttachNameHash();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier prototype) {
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
     * Obf: COGFLLLFFFC
     * </pre>
     *
     * Protobuf type {@code AbilityAttachedModifier}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityAttachedModifier)
        emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.class, emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isInvalid_ = false;

        ownerEntityId_ = 0;

        instancedModifierId_ = 0;

        isServerbuffModifier_ = false;

        attachNameHash_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier build() {
        emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier buildPartial() {
        emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier result = new emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier(this);
        result.isInvalid_ = isInvalid_;
        result.ownerEntityId_ = ownerEntityId_;
        result.instancedModifierId_ = instancedModifierId_;
        result.isServerbuffModifier_ = isServerbuffModifier_;
        result.attachNameHash_ = attachNameHash_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier other) {
        if (other == emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.getDefaultInstance()) return this;
        if (other.getIsInvalid() != false) {
          setIsInvalid(other.getIsInvalid());
        }
        if (other.getOwnerEntityId() != 0) {
          setOwnerEntityId(other.getOwnerEntityId());
        }
        if (other.getInstancedModifierId() != 0) {
          setInstancedModifierId(other.getInstancedModifierId());
        }
        if (other.getIsServerbuffModifier() != false) {
          setIsServerbuffModifier(other.getIsServerbuffModifier());
        }
        if (other.getAttachNameHash() != 0) {
          setAttachNameHash(other.getAttachNameHash());
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
                isInvalid_ = input.readBool();

                break;
              } // case 8
              case 16: {
                ownerEntityId_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                instancedModifierId_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                isServerbuffModifier_ = input.readBool();

                break;
              } // case 32
              case 40: {
                attachNameHash_ = input.readInt32();

                break;
              } // case 40
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

      private boolean isInvalid_ ;
      /**
       * <code>bool is_invalid = 1;</code>
       * @return The isInvalid.
       */
      @java.lang.Override
      public boolean getIsInvalid() {
        return isInvalid_;
      }
      /**
       * <code>bool is_invalid = 1;</code>
       * @param value The isInvalid to set.
       * @return This builder for chaining.
       */
      public Builder setIsInvalid(boolean value) {
        
        isInvalid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_invalid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInvalid() {
        
        isInvalid_ = false;
        onChanged();
        return this;
      }

      private int ownerEntityId_ ;
      /**
       * <code>uint32 owner_entity_id = 2;</code>
       * @return The ownerEntityId.
       */
      @java.lang.Override
      public int getOwnerEntityId() {
        return ownerEntityId_;
      }
      /**
       * <code>uint32 owner_entity_id = 2;</code>
       * @param value The ownerEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerEntityId(int value) {
        
        ownerEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerEntityId() {
        
        ownerEntityId_ = 0;
        onChanged();
        return this;
      }

      private int instancedModifierId_ ;
      /**
       * <code>uint32 instanced_modifier_id = 3;</code>
       * @return The instancedModifierId.
       */
      @java.lang.Override
      public int getInstancedModifierId() {
        return instancedModifierId_;
      }
      /**
       * <code>uint32 instanced_modifier_id = 3;</code>
       * @param value The instancedModifierId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedModifierId(int value) {
        
        instancedModifierId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_modifier_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedModifierId() {
        
        instancedModifierId_ = 0;
        onChanged();
        return this;
      }

      private boolean isServerbuffModifier_ ;
      /**
       * <code>bool is_serverbuff_modifier = 4;</code>
       * @return The isServerbuffModifier.
       */
      @java.lang.Override
      public boolean getIsServerbuffModifier() {
        return isServerbuffModifier_;
      }
      /**
       * <code>bool is_serverbuff_modifier = 4;</code>
       * @param value The isServerbuffModifier to set.
       * @return This builder for chaining.
       */
      public Builder setIsServerbuffModifier(boolean value) {
        
        isServerbuffModifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_serverbuff_modifier = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsServerbuffModifier() {
        
        isServerbuffModifier_ = false;
        onChanged();
        return this;
      }

      private int attachNameHash_ ;
      /**
       * <code>int32 attach_name_hash = 5;</code>
       * @return The attachNameHash.
       */
      @java.lang.Override
      public int getAttachNameHash() {
        return attachNameHash_;
      }
      /**
       * <code>int32 attach_name_hash = 5;</code>
       * @param value The attachNameHash to set.
       * @return This builder for chaining.
       */
      public Builder setAttachNameHash(int value) {
        
        attachNameHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 attach_name_hash = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAttachNameHash() {
        
        attachNameHash_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityAttachedModifier)
    }

    // @@protoc_insertion_point(class_scope:AbilityAttachedModifier)
    private static final emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier();
    }

    public static emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityAttachedModifier>
        PARSER = new com.google.protobuf.AbstractParser<AbilityAttachedModifier>() {
      @java.lang.Override
      public AbilityAttachedModifier parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityAttachedModifier> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityAttachedModifier> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityAttachedModifier_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityAttachedModifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AbilityAttachedModifier.proto\"\237\001\n\027Abil" +
      "ityAttachedModifier\022\022\n\nis_invalid\030\001 \001(\010\022" +
      "\027\n\017owner_entity_id\030\002 \001(\r\022\035\n\025instanced_mo" +
      "difier_id\030\003 \001(\r\022\036\n\026is_serverbuff_modifie" +
      "r\030\004 \001(\010\022\030\n\020attach_name_hash\030\005 \001(\005B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityAttachedModifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityAttachedModifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityAttachedModifier_descriptor,
        new java.lang.String[] { "IsInvalid", "OwnerEntityId", "InstancedModifierId", "IsServerbuffModifier", "AttachNameHash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
