// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AlmaOnline.proto

package org.example.AlmaOnline.server;

public interface DeliveryOrderMOrBuilder extends
    // @@protoc_insertion_point(interface_extends:almaonline.DeliveryOrderM)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.almaonline.OrderM order = 1;</code>
   * @return Whether the order field is set.
   */
  boolean hasOrder();
  /**
   * <code>.almaonline.OrderM order = 1;</code>
   * @return The order.
   */
  org.example.AlmaOnline.server.OrderM getOrder();
  /**
   * <code>.almaonline.OrderM order = 1;</code>
   */
  org.example.AlmaOnline.server.OrderMOrBuilder getOrderOrBuilder();

  /**
   * <code>string deliveryAddress = 2;</code>
   * @return The deliveryAddress.
   */
  java.lang.String getDeliveryAddress();
  /**
   * <code>string deliveryAddress = 2;</code>
   * @return The bytes for deliveryAddress.
   */
  com.google.protobuf.ByteString
      getDeliveryAddressBytes();
}
