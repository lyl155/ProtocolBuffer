// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/PbFeedbackResult.proto

public final class PbFeedbackResultOuterClass {
  private PbFeedbackResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PbFeedbackResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PbFeedbackResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *是否成功
     * </pre>
     *
     * <code>required bool IsSuccess = 1;</code>
     */
    boolean hasIsSuccess();
    /**
     * <pre>
     *是否成功
     * </pre>
     *
     * <code>required bool IsSuccess = 1;</code>
     */
    boolean getIsSuccess();

    /**
     * <pre>
     *异常信息
     * </pre>
     *
     * <code>optional string ErrorMessage = 2;</code>
     */
    boolean hasErrorMessage();
    /**
     * <pre>
     *异常信息
     * </pre>
     *
     * <code>optional string ErrorMessage = 2;</code>
     */
    java.lang.String getErrorMessage();
    /**
     * <pre>
     *异常信息
     * </pre>
     *
     * <code>optional string ErrorMessage = 2;</code>
     */
    com.google.protobuf.ByteString
        getErrorMessageBytes();

    /**
     * <pre>
     *图片地址
     * </pre>
     *
     * <code>optional string Url = 3;</code>
     */
    boolean hasUrl();
    /**
     * <pre>
     *图片地址
     * </pre>
     *
     * <code>optional string Url = 3;</code>
     */
    java.lang.String getUrl();
    /**
     * <pre>
     *图片地址
     * </pre>
     *
     * <code>optional string Url = 3;</code>
     */
    com.google.protobuf.ByteString
        getUrlBytes();
  }
  /**
   * Protobuf type {@code PbFeedbackResult}
   */
  public  static final class PbFeedbackResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PbFeedbackResult)
      PbFeedbackResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PbFeedbackResult.newBuilder() to construct.
    private PbFeedbackResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PbFeedbackResult() {
      isSuccess_ = false;
      errorMessage_ = "";
      url_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PbFeedbackResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              isSuccess_ = input.readBool();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              errorMessage_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              url_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PbFeedbackResultOuterClass.internal_static_PbFeedbackResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PbFeedbackResultOuterClass.internal_static_PbFeedbackResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PbFeedbackResultOuterClass.PbFeedbackResult.class, PbFeedbackResultOuterClass.PbFeedbackResult.Builder.class);
    }

    private int bitField0_;
    public static final int ISSUCCESS_FIELD_NUMBER = 1;
    private boolean isSuccess_;
    /**
     * <pre>
     *是否成功
     * </pre>
     *
     * <code>required bool IsSuccess = 1;</code>
     */
    public boolean hasIsSuccess() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *是否成功
     * </pre>
     *
     * <code>required bool IsSuccess = 1;</code>
     */
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int ERRORMESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object errorMessage_;
    /**
     * <pre>
     *异常信息
     * </pre>
     *
     * <code>optional string ErrorMessage = 2;</code>
     */
    public boolean hasErrorMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *异常信息
     * </pre>
     *
     * <code>optional string ErrorMessage = 2;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorMessage_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     *异常信息
     * </pre>
     *
     * <code>optional string ErrorMessage = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int URL_FIELD_NUMBER = 3;
    private volatile java.lang.Object url_;
    /**
     * <pre>
     *图片地址
     * </pre>
     *
     * <code>optional string Url = 3;</code>
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     *图片地址
     * </pre>
     *
     * <code>optional string Url = 3;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          url_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     *图片地址
     * </pre>
     *
     * <code>optional string Url = 3;</code>
     */
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

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIsSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, isSuccess_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorMessage_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, url_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isSuccess_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorMessage_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, url_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof PbFeedbackResultOuterClass.PbFeedbackResult)) {
        return super.equals(obj);
      }
      PbFeedbackResultOuterClass.PbFeedbackResult other = (PbFeedbackResultOuterClass.PbFeedbackResult) obj;

      boolean result = true;
      result = result && (hasIsSuccess() == other.hasIsSuccess());
      if (hasIsSuccess()) {
        result = result && (getIsSuccess()
            == other.getIsSuccess());
      }
      result = result && (hasErrorMessage() == other.hasErrorMessage());
      if (hasErrorMessage()) {
        result = result && getErrorMessage()
            .equals(other.getErrorMessage());
      }
      result = result && (hasUrl() == other.hasUrl());
      if (hasUrl()) {
        result = result && getUrl()
            .equals(other.getUrl());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasIsSuccess()) {
        hash = (37 * hash) + ISSUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsSuccess());
      }
      if (hasErrorMessage()) {
        hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorMessage().hashCode();
      }
      if (hasUrl()) {
        hash = (37 * hash) + URL_FIELD_NUMBER;
        hash = (53 * hash) + getUrl().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PbFeedbackResultOuterClass.PbFeedbackResult parseFrom(
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
    public static Builder newBuilder(PbFeedbackResultOuterClass.PbFeedbackResult prototype) {
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
     * Protobuf type {@code PbFeedbackResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PbFeedbackResult)
        PbFeedbackResultOuterClass.PbFeedbackResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PbFeedbackResultOuterClass.internal_static_PbFeedbackResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PbFeedbackResultOuterClass.internal_static_PbFeedbackResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PbFeedbackResultOuterClass.PbFeedbackResult.class, PbFeedbackResultOuterClass.PbFeedbackResult.Builder.class);
      }

      // Construct using PbFeedbackResultOuterClass.PbFeedbackResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isSuccess_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        errorMessage_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        url_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PbFeedbackResultOuterClass.internal_static_PbFeedbackResult_descriptor;
      }

      @java.lang.Override
      public PbFeedbackResultOuterClass.PbFeedbackResult getDefaultInstanceForType() {
        return PbFeedbackResultOuterClass.PbFeedbackResult.getDefaultInstance();
      }

      @java.lang.Override
      public PbFeedbackResultOuterClass.PbFeedbackResult build() {
        PbFeedbackResultOuterClass.PbFeedbackResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PbFeedbackResultOuterClass.PbFeedbackResult buildPartial() {
        PbFeedbackResultOuterClass.PbFeedbackResult result = new PbFeedbackResultOuterClass.PbFeedbackResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isSuccess_ = isSuccess_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.errorMessage_ = errorMessage_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.url_ = url_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PbFeedbackResultOuterClass.PbFeedbackResult) {
          return mergeFrom((PbFeedbackResultOuterClass.PbFeedbackResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PbFeedbackResultOuterClass.PbFeedbackResult other) {
        if (other == PbFeedbackResultOuterClass.PbFeedbackResult.getDefaultInstance()) return this;
        if (other.hasIsSuccess()) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.hasErrorMessage()) {
          bitField0_ |= 0x00000002;
          errorMessage_ = other.errorMessage_;
          onChanged();
        }
        if (other.hasUrl()) {
          bitField0_ |= 0x00000004;
          url_ = other.url_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIsSuccess()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        PbFeedbackResultOuterClass.PbFeedbackResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PbFeedbackResultOuterClass.PbFeedbackResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isSuccess_ ;
      /**
       * <pre>
       *是否成功
       * </pre>
       *
       * <code>required bool IsSuccess = 1;</code>
       */
      public boolean hasIsSuccess() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       *是否成功
       * </pre>
       *
       * <code>required bool IsSuccess = 1;</code>
       */
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <pre>
       *是否成功
       * </pre>
       *
       * <code>required bool IsSuccess = 1;</code>
       */
      public Builder setIsSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *是否成功
       * </pre>
       *
       * <code>required bool IsSuccess = 1;</code>
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object errorMessage_ = "";
      /**
       * <pre>
       *异常信息
       * </pre>
       *
       * <code>optional string ErrorMessage = 2;</code>
       */
      public boolean hasErrorMessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <pre>
       *异常信息
       * </pre>
       *
       * <code>optional string ErrorMessage = 2;</code>
       */
      public java.lang.String getErrorMessage() {
        java.lang.Object ref = errorMessage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            errorMessage_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *异常信息
       * </pre>
       *
       * <code>optional string ErrorMessage = 2;</code>
       */
      public com.google.protobuf.ByteString
          getErrorMessageBytes() {
        java.lang.Object ref = errorMessage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorMessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *异常信息
       * </pre>
       *
       * <code>optional string ErrorMessage = 2;</code>
       */
      public Builder setErrorMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        errorMessage_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *异常信息
       * </pre>
       *
       * <code>optional string ErrorMessage = 2;</code>
       */
      public Builder clearErrorMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        errorMessage_ = getDefaultInstance().getErrorMessage();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *异常信息
       * </pre>
       *
       * <code>optional string ErrorMessage = 2;</code>
       */
      public Builder setErrorMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        errorMessage_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object url_ = "";
      /**
       * <pre>
       *图片地址
       * </pre>
       *
       * <code>optional string Url = 3;</code>
       */
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <pre>
       *图片地址
       * </pre>
       *
       * <code>optional string Url = 3;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            url_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *图片地址
       * </pre>
       *
       * <code>optional string Url = 3;</code>
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
       * <pre>
       *图片地址
       * </pre>
       *
       * <code>optional string Url = 3;</code>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片地址
       * </pre>
       *
       * <code>optional string Url = 3;</code>
       */
      public Builder clearUrl() {
        bitField0_ = (bitField0_ & ~0x00000004);
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片地址
       * </pre>
       *
       * <code>optional string Url = 3;</code>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        url_ = value;
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


      // @@protoc_insertion_point(builder_scope:PbFeedbackResult)
    }

    // @@protoc_insertion_point(class_scope:PbFeedbackResult)
    private static final PbFeedbackResultOuterClass.PbFeedbackResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PbFeedbackResultOuterClass.PbFeedbackResult();
    }

    public static PbFeedbackResultOuterClass.PbFeedbackResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<PbFeedbackResult>
        PARSER = new com.google.protobuf.AbstractParser<PbFeedbackResult>() {
      @java.lang.Override
      public PbFeedbackResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PbFeedbackResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PbFeedbackResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PbFeedbackResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PbFeedbackResultOuterClass.PbFeedbackResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PbFeedbackResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PbFeedbackResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035protos/PbFeedbackResult.proto\"H\n\020PbFee" +
      "dbackResult\022\021\n\tIsSuccess\030\001 \002(\010\022\024\n\014ErrorM" +
      "essage\030\002 \001(\t\022\013\n\003Url\030\003 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_PbFeedbackResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PbFeedbackResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PbFeedbackResult_descriptor,
        new java.lang.String[] { "IsSuccess", "ErrorMessage", "Url", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
