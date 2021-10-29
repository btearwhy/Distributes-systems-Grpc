package org.example.AlmaOnline.required;


import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import org.example.AlmaOnline.defaults.Initializer;
import org.example.AlmaOnline.provided.client.AlmaOnlineClientAdapter;
import org.example.AlmaOnline.provided.server.AlmaOnlineServerAdapter;
import org.example.AlmaOnline.provided.service.*;
import org.example.AlmaOnline.server.*;
import org.example.AlmaOnline.provided.service.exceptions.OrderException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

// AlmaOnlineServerGrpcAdapter implements the grpc-server side of the application.
// The implementation should not contain any additional business logic, only implement
// the code here that is required to couple your IDL definitions to the provided business logic.
public class AlmaOnlineServerGrpcAdapter extends AlmaOnlineGrpc.AlmaOnlineImplBase implements AlmaOnlineServerAdapter {

    // the service field contains the AlmaOnline service that the server will
    // call during testing.
    private final AlmaOnlineService service;

    public AlmaOnlineServerGrpcAdapter() {
        this.service = this.getInitializer().initialize();
    }

    // -- Put the code for your implementation down below -- //


    @Override
    public void getRestaurants(Empty request, StreamObserver<RestaurantsInformation> responseObserver) {
        Collection<Restaurant> res = service.getRestaurants();
        var resInfo = RestaurantsInformation.newBuilder();
        for (Restaurant r:res
        ) {
            var rInfo = RestaurantInformation.newBuilder().setId(r.getId()).setName(r.getName());
            resInfo.addRestaurantInfo(rInfo);
        }
        responseObserver.onNext(resInfo.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getMenu(RestaurantIDRequest request, StreamObserver<MenuM> responseObserver) {
        Menu menu = service.getRestaurantMenu(request.getId()).get();
        var menuBuilder = MenuM.newBuilder();
        for (Item item:menu.getItems()
        ) {
            var itemBuilder = ItemM.newBuilder().setName(item.getName()).setPrice(item.getPrice());
            menuBuilder.addItem(itemBuilder);
        }
        responseObserver.onNext(menuBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void createDineInOrder(DineInOrderRequest request, StreamObserver<SuccessOrNot> responseObserver) {
        try {
            OrderM orderM = request.getOrder().getOrder();
            List<ItemM> itemsM = orderM.getItemsList();
            List<String> items = new ArrayList<String>();
            for (ItemM itemM:itemsM
                 ) {
                items.add(itemM.getName());
            }
            DineInOrderQuote dIOQ = new DineInOrderQuote(orderM.getId(),
                    new SimpleDateFormat("yyyy-MM-dd").parse(orderM.getCreationDate()),
                    orderM.getCustomer(), items, new SimpleDateFormat("yyyy-MM-dd").parse(request.getOrder().getReservationDate()));
            service.createDineInOrder(request.getRestaurantId(), dIOQ);
            responseObserver.onNext(SuccessOrNot.newBuilder().setStatusCode(200).build());
        }catch (ParseException e){
            e.printStackTrace();
        }catch (OrderException e){
            e.printStackTrace();
            responseObserver.onNext(SuccessOrNot.newBuilder().setStatusCode(400).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void createDeliveryOrder(DeliveryOrderRequest request, StreamObserver<SuccessOrNot> responseObserver) {
        try {
            OrderM orderM = request.getOrder().getOrder();
            List<ItemM> itemsM = orderM.getItemsList();
            List<String> items = new ArrayList<String>();
            for (ItemM itemM:itemsM
            ) {
                items.add(itemM.getName());
            }
            DeliveryOrderQuote dOQ = new DeliveryOrderQuote(orderM.getId(),
                    new SimpleDateFormat("yyyy-MM-DD").parse(orderM.getCreationDate()),
                    orderM.getCustomer(), items, request.getOrder().getDeliveryAddress());
            service.createDeliveryOrder(request.getRestaurantId(),dOQ);
            responseObserver.onNext(SuccessOrNot.newBuilder().setStatusCode(200).build());
        }catch (ParseException e){
            e.printStackTrace();
        }catch (OrderException e){
            e.printStackTrace();
            responseObserver.onNext(SuccessOrNot.newBuilder().setStatusCode(400).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getOrder(OrderRequest request, StreamObserver<OrderM> responseObserver) {
        Order order = service.getOrder(request.getRestaurantId(), request.getOrderId()).get();
        var orderBuilder = OrderM.newBuilder();
        orderBuilder.setId(order.getId())
                    .setCreationDate(new SimpleDateFormat("yyyy-DD-MM").format(order.getCreationDate()))
                    .setCustomer(order.getCustomer());
        for (Item item:order.getItems()
             ) {
            var itemMBuilder = ItemM.newBuilder().setName(item.getName()).setPrice(item.getPrice());
            orderBuilder.addItems(itemMBuilder);
        }
        responseObserver.onNext(orderBuilder.build());
        responseObserver.onCompleted();
    }
}
