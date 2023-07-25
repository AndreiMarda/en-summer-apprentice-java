package org.example.summer.controller;

import jakarta.persistence.criteria.Order;
import org.example.summer.dto.OrderDTO;
import org.example.summer.model.Orders;
import org.example.summer.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class OrderController {
    private OrdersService orderService;

    public OrderController(OrdersService serviceOrder) {
        this.orderService = serviceOrder;
    }

    @GetMapping("/orders")
    public List<Orders> getOrders() {
        return orderService.orderFindAll();
    }
    @PostMapping("/orders/create")
    public Order createOrder(@RequestBody OrderDTO orderDTO) throws Exception {
        return (Order) orderService.createOrder(orderDTO);
    }
}