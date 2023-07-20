package service;

import repository.OrderRepository;

public class ServiceOrder {
    private OrderRepository order_repository;
    public ServiceOrder(OrderRepository order_repository){
        this.order_repository = order_repository;
    }

}
