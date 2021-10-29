// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AlmaOnline.proto

package org.example.AlmaOnline.server;

/**
 * Protobuf type {@code almaonline.RestaurantsInformation}
 */
public final class RestaurantsInformation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:almaonline.RestaurantsInformation)
    RestaurantsInformationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RestaurantsInformation.newBuilder() to construct.
  private RestaurantsInformation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RestaurantsInformation() {
    restaurantInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RestaurantsInformation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RestaurantsInformation(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              restaurantInfo_ = new java.util.ArrayList<org.example.AlmaOnline.server.RestaurantInformation>();
              mutable_bitField0_ |= 0x00000001;
            }
            restaurantInfo_.add(
                input.readMessage(org.example.AlmaOnline.server.RestaurantInformation.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        restaurantInfo_ = java.util.Collections.unmodifiableList(restaurantInfo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.AlmaOnline.server.AlmaOnlineProto.internal_static_almaonline_RestaurantsInformation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.AlmaOnline.server.AlmaOnlineProto.internal_static_almaonline_RestaurantsInformation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.AlmaOnline.server.RestaurantsInformation.class, org.example.AlmaOnline.server.RestaurantsInformation.Builder.class);
  }

  public static final int RESTAURANTINFO_FIELD_NUMBER = 1;
  private java.util.List<org.example.AlmaOnline.server.RestaurantInformation> restaurantInfo_;
  /**
   * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.AlmaOnline.server.RestaurantInformation> getRestaurantInfoList() {
    return restaurantInfo_;
  }
  /**
   * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.AlmaOnline.server.RestaurantInformationOrBuilder> 
      getRestaurantInfoOrBuilderList() {
    return restaurantInfo_;
  }
  /**
   * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
   */
  @java.lang.Override
  public int getRestaurantInfoCount() {
    return restaurantInfo_.size();
  }
  /**
   * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
   */
  @java.lang.Override
  public org.example.AlmaOnline.server.RestaurantInformation getRestaurantInfo(int index) {
    return restaurantInfo_.get(index);
  }
  /**
   * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
   */
  @java.lang.Override
  public org.example.AlmaOnline.server.RestaurantInformationOrBuilder getRestaurantInfoOrBuilder(
      int index) {
    return restaurantInfo_.get(index);
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
    for (int i = 0; i < restaurantInfo_.size(); i++) {
      output.writeMessage(1, restaurantInfo_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < restaurantInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, restaurantInfo_.get(i));
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
    if (!(obj instanceof org.example.AlmaOnline.server.RestaurantsInformation)) {
      return super.equals(obj);
    }
    org.example.AlmaOnline.server.RestaurantsInformation other = (org.example.AlmaOnline.server.RestaurantsInformation) obj;

    if (!getRestaurantInfoList()
        .equals(other.getRestaurantInfoList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRestaurantInfoCount() > 0) {
      hash = (37 * hash) + RESTAURANTINFO_FIELD_NUMBER;
      hash = (53 * hash) + getRestaurantInfoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.AlmaOnline.server.RestaurantsInformation parseFrom(
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
  public static Builder newBuilder(org.example.AlmaOnline.server.RestaurantsInformation prototype) {
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
   * Protobuf type {@code almaonline.RestaurantsInformation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:almaonline.RestaurantsInformation)
      org.example.AlmaOnline.server.RestaurantsInformationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.AlmaOnline.server.AlmaOnlineProto.internal_static_almaonline_RestaurantsInformation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.AlmaOnline.server.AlmaOnlineProto.internal_static_almaonline_RestaurantsInformation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.AlmaOnline.server.RestaurantsInformation.class, org.example.AlmaOnline.server.RestaurantsInformation.Builder.class);
    }

    // Construct using org.example.AlmaOnline.server.RestaurantsInformation.newBuilder()
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
        getRestaurantInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (restaurantInfoBuilder_ == null) {
        restaurantInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        restaurantInfoBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.AlmaOnline.server.AlmaOnlineProto.internal_static_almaonline_RestaurantsInformation_descriptor;
    }

    @java.lang.Override
    public org.example.AlmaOnline.server.RestaurantsInformation getDefaultInstanceForType() {
      return org.example.AlmaOnline.server.RestaurantsInformation.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.AlmaOnline.server.RestaurantsInformation build() {
      org.example.AlmaOnline.server.RestaurantsInformation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.AlmaOnline.server.RestaurantsInformation buildPartial() {
      org.example.AlmaOnline.server.RestaurantsInformation result = new org.example.AlmaOnline.server.RestaurantsInformation(this);
      int from_bitField0_ = bitField0_;
      if (restaurantInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          restaurantInfo_ = java.util.Collections.unmodifiableList(restaurantInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.restaurantInfo_ = restaurantInfo_;
      } else {
        result.restaurantInfo_ = restaurantInfoBuilder_.build();
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
      if (other instanceof org.example.AlmaOnline.server.RestaurantsInformation) {
        return mergeFrom((org.example.AlmaOnline.server.RestaurantsInformation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.AlmaOnline.server.RestaurantsInformation other) {
      if (other == org.example.AlmaOnline.server.RestaurantsInformation.getDefaultInstance()) return this;
      if (restaurantInfoBuilder_ == null) {
        if (!other.restaurantInfo_.isEmpty()) {
          if (restaurantInfo_.isEmpty()) {
            restaurantInfo_ = other.restaurantInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRestaurantInfoIsMutable();
            restaurantInfo_.addAll(other.restaurantInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.restaurantInfo_.isEmpty()) {
          if (restaurantInfoBuilder_.isEmpty()) {
            restaurantInfoBuilder_.dispose();
            restaurantInfoBuilder_ = null;
            restaurantInfo_ = other.restaurantInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            restaurantInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRestaurantInfoFieldBuilder() : null;
          } else {
            restaurantInfoBuilder_.addAllMessages(other.restaurantInfo_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.example.AlmaOnline.server.RestaurantsInformation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.AlmaOnline.server.RestaurantsInformation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.example.AlmaOnline.server.RestaurantInformation> restaurantInfo_ =
      java.util.Collections.emptyList();
    private void ensureRestaurantInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        restaurantInfo_ = new java.util.ArrayList<org.example.AlmaOnline.server.RestaurantInformation>(restaurantInfo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.AlmaOnline.server.RestaurantInformation, org.example.AlmaOnline.server.RestaurantInformation.Builder, org.example.AlmaOnline.server.RestaurantInformationOrBuilder> restaurantInfoBuilder_;

    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public java.util.List<org.example.AlmaOnline.server.RestaurantInformation> getRestaurantInfoList() {
      if (restaurantInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(restaurantInfo_);
      } else {
        return restaurantInfoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public int getRestaurantInfoCount() {
      if (restaurantInfoBuilder_ == null) {
        return restaurantInfo_.size();
      } else {
        return restaurantInfoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public org.example.AlmaOnline.server.RestaurantInformation getRestaurantInfo(int index) {
      if (restaurantInfoBuilder_ == null) {
        return restaurantInfo_.get(index);
      } else {
        return restaurantInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder setRestaurantInfo(
        int index, org.example.AlmaOnline.server.RestaurantInformation value) {
      if (restaurantInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantInfoIsMutable();
        restaurantInfo_.set(index, value);
        onChanged();
      } else {
        restaurantInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder setRestaurantInfo(
        int index, org.example.AlmaOnline.server.RestaurantInformation.Builder builderForValue) {
      if (restaurantInfoBuilder_ == null) {
        ensureRestaurantInfoIsMutable();
        restaurantInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        restaurantInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder addRestaurantInfo(org.example.AlmaOnline.server.RestaurantInformation value) {
      if (restaurantInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantInfoIsMutable();
        restaurantInfo_.add(value);
        onChanged();
      } else {
        restaurantInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder addRestaurantInfo(
        int index, org.example.AlmaOnline.server.RestaurantInformation value) {
      if (restaurantInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantInfoIsMutable();
        restaurantInfo_.add(index, value);
        onChanged();
      } else {
        restaurantInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder addRestaurantInfo(
        org.example.AlmaOnline.server.RestaurantInformation.Builder builderForValue) {
      if (restaurantInfoBuilder_ == null) {
        ensureRestaurantInfoIsMutable();
        restaurantInfo_.add(builderForValue.build());
        onChanged();
      } else {
        restaurantInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder addRestaurantInfo(
        int index, org.example.AlmaOnline.server.RestaurantInformation.Builder builderForValue) {
      if (restaurantInfoBuilder_ == null) {
        ensureRestaurantInfoIsMutable();
        restaurantInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        restaurantInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder addAllRestaurantInfo(
        java.lang.Iterable<? extends org.example.AlmaOnline.server.RestaurantInformation> values) {
      if (restaurantInfoBuilder_ == null) {
        ensureRestaurantInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, restaurantInfo_);
        onChanged();
      } else {
        restaurantInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder clearRestaurantInfo() {
      if (restaurantInfoBuilder_ == null) {
        restaurantInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        restaurantInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public Builder removeRestaurantInfo(int index) {
      if (restaurantInfoBuilder_ == null) {
        ensureRestaurantInfoIsMutable();
        restaurantInfo_.remove(index);
        onChanged();
      } else {
        restaurantInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public org.example.AlmaOnline.server.RestaurantInformation.Builder getRestaurantInfoBuilder(
        int index) {
      return getRestaurantInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public org.example.AlmaOnline.server.RestaurantInformationOrBuilder getRestaurantInfoOrBuilder(
        int index) {
      if (restaurantInfoBuilder_ == null) {
        return restaurantInfo_.get(index);  } else {
        return restaurantInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public java.util.List<? extends org.example.AlmaOnline.server.RestaurantInformationOrBuilder> 
         getRestaurantInfoOrBuilderList() {
      if (restaurantInfoBuilder_ != null) {
        return restaurantInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(restaurantInfo_);
      }
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public org.example.AlmaOnline.server.RestaurantInformation.Builder addRestaurantInfoBuilder() {
      return getRestaurantInfoFieldBuilder().addBuilder(
          org.example.AlmaOnline.server.RestaurantInformation.getDefaultInstance());
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public org.example.AlmaOnline.server.RestaurantInformation.Builder addRestaurantInfoBuilder(
        int index) {
      return getRestaurantInfoFieldBuilder().addBuilder(
          index, org.example.AlmaOnline.server.RestaurantInformation.getDefaultInstance());
    }
    /**
     * <code>repeated .almaonline.RestaurantInformation restaurantInfo = 1;</code>
     */
    public java.util.List<org.example.AlmaOnline.server.RestaurantInformation.Builder> 
         getRestaurantInfoBuilderList() {
      return getRestaurantInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.AlmaOnline.server.RestaurantInformation, org.example.AlmaOnline.server.RestaurantInformation.Builder, org.example.AlmaOnline.server.RestaurantInformationOrBuilder> 
        getRestaurantInfoFieldBuilder() {
      if (restaurantInfoBuilder_ == null) {
        restaurantInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.AlmaOnline.server.RestaurantInformation, org.example.AlmaOnline.server.RestaurantInformation.Builder, org.example.AlmaOnline.server.RestaurantInformationOrBuilder>(
                restaurantInfo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        restaurantInfo_ = null;
      }
      return restaurantInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:almaonline.RestaurantsInformation)
  }

  // @@protoc_insertion_point(class_scope:almaonline.RestaurantsInformation)
  private static final org.example.AlmaOnline.server.RestaurantsInformation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.AlmaOnline.server.RestaurantsInformation();
  }

  public static org.example.AlmaOnline.server.RestaurantsInformation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestaurantsInformation>
      PARSER = new com.google.protobuf.AbstractParser<RestaurantsInformation>() {
    @java.lang.Override
    public RestaurantsInformation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RestaurantsInformation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RestaurantsInformation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestaurantsInformation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.AlmaOnline.server.RestaurantsInformation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
