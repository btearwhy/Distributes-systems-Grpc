// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AlmaOnline.proto

package org.example.AlmaOnline.server;

public interface RestaurantMOrBuilder extends
    // @@protoc_insertion_point(interface_extends:almaonline.RestaurantM)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.almaonline.MenuM menu = 3;</code>
   * @return Whether the menu field is set.
   */
  boolean hasMenu();
  /**
   * <code>.almaonline.MenuM menu = 3;</code>
   * @return The menu.
   */
  org.example.AlmaOnline.server.MenuM getMenu();
  /**
   * <code>.almaonline.MenuM menu = 3;</code>
   */
  org.example.AlmaOnline.server.MenuMOrBuilder getMenuOrBuilder();

  /**
   * <code>repeated .almaonline.OrderM orders = 4;</code>
   */
  java.util.List<org.example.AlmaOnline.server.OrderM> 
      getOrdersList();
  /**
   * <code>repeated .almaonline.OrderM orders = 4;</code>
   */
  org.example.AlmaOnline.server.OrderM getOrders(int index);
  /**
   * <code>repeated .almaonline.OrderM orders = 4;</code>
   */
  int getOrdersCount();
  /**
   * <code>repeated .almaonline.OrderM orders = 4;</code>
   */
  java.util.List<? extends org.example.AlmaOnline.server.OrderMOrBuilder> 
      getOrdersOrBuilderList();
  /**
   * <code>repeated .almaonline.OrderM orders = 4;</code>
   */
  org.example.AlmaOnline.server.OrderMOrBuilder getOrdersOrBuilder(
      int index);
}