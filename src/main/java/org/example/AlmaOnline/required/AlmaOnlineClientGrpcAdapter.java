package org.example.AlmaOnline.required;

import com.google.common.util.concurrent.ListenableFuture;
import org.example.AlmaOnline.provided.client.*;
import org.example.AlmaOnline.provided.service.Item;
import org.example.AlmaOnline.server.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// AlmaOnlineClientGrpcAdapter provides your own implementation of the AlmaOnlineClientAdapter
public class AlmaOnlineClientGrpcAdapter implements AlmaOnlineClientAdapter {
    // getRestaurants should retrieve the information on all the available restaurants.
    @Override
    public List<RestaurantInfo> getRestaurants(AlmaOnlineGrpc.AlmaOnlineBlockingStub stub) {
        var request = Empty.newBuilder().build();
        var response = stub.getRestaurants(request);
        List<RestaurantInfo> Rinfos = new ArrayList<>();
        for (RestaurantInformation res:response.getRestaurantInfoList()
             ) {
            Rinfos.add(new RestaurantInfo(res.getId(), res.getName()));
        }
        return Rinfos;
    }

    // getMenu should return the menu of a given restaurant
    @Override
    public MenuInfo getMenu(AlmaOnlineGrpc.AlmaOnlineBlockingStub stub, String restaurantId) {
        var request = RestaurantIDRequest.newBuilder().setId(restaurantId).build();
        var response = stub.getMenu(request);
        Map<String, Double> items = new HashMap();
        for (ItemM itemsM:response.getItemList()
             ) {
            items.put(itemsM.getName(), itemsM.getPrice());
        }
        return new MenuInfo(items);
    }

    // createDineInOrder should create the given dine-in order at the AlmaOnline server
    @Override
    public ListenableFuture<?> createDineInOrder(AlmaOnlineGrpc.AlmaOnlineFutureStub stub, DineInOrderQuote order) {
        var orderM = OrderM.newBuilder();
        for (String itemName:order.getItems()
             ) {
            orderM.addItems(ItemM.newBuilder().setName(itemName));
        }
        orderM.setCustomer(order.getCustomer()).setCreationDate(new SimpleDateFormat("yyyy-MM-DD").format(new Date()))
                .setId(order.getOrderId());
        var dIOM = DineInOrderM.newBuilder().setOrder(orderM)
                .setReservationDate(new SimpleDateFormat("yyyy-MM-DD").format(order.getReservationDate()));
        var request = DineInOrderRequest.newBuilder().setRestaurantId(order.getRestaurantId()).setOrder(dIOM).build();
        var response = stub.createDineInOrder(request);
        return response;
    }

    // createDeliveryOrder should create the given delivery order at the AlmaOnline server
    @Override
    public ListenableFuture<?> createDeliveryOrder(AlmaOnlineGrpc.AlmaOnlineFutureStub stub, DeliveryOrder order) {
        var orderM = OrderM.newBuilder();
        for (String itemName:order.getItems()
        ) {
            orderM.addItems(ItemM.newBuilder().setName(itemName));
        }
        orderM.setCustomer(order.getCustomer()).setCreationDate(new SimpleDateFormat("yyyy-MM-DD").format(new Date()))
                .setId(order.getOrderId());
        var dOM = DeliveryOrderM.newBuilder().setOrder(orderM).setDeliveryAddress(order.getDeliveryAddress());
        var request = DeliveryOrderRequest.newBuilder().setRestaurantId(order.getRestaurantId()).setOrder(dOM).build();
        var response = stub.createDeliveryOrder(request);
        return response;
    }

    // getOrder should retrieve the order information at the AlmaOnline server given the restaurant the order is
    // placed at and the id of the order.
    @Override
    public BaseOrderInfo getOrder(AlmaOnlineGrpc.AlmaOnlineBlockingStub stub, String restaurantId, String orderId) {
        try {
            var request = OrderRequest.newBuilder().setOrderId(orderId).setRestaurantId(restaurantId).build();
            var response = stub.getOrder(request);
            List<ItemInfo> iInfos = new ArrayList<>();
            for (ItemM itemM:response.getItemsList()
                 ) {
                iInfos.add(new ItemInfo(itemM.getName(), itemM.getPrice()));
            }
            return new BaseOrderInfo(response.getCustomer(), new SimpleDateFormat("yyyy-MM-DD").parse(response.getCreationDate()), iInfos);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    // getScript returns the script the application will run during testing.
    // You can leave the default implementation, as it will test most of the functionality.
    // Alternatively, you can provide your own implementation to test your own edge-cases.
    @Override
    public AppScript getScript() {
        return AlmaOnlineClientAdapter.super.getScript();
    }
}
