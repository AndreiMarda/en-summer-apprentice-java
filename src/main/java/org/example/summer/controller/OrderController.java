package org.example.summer.controller;

import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.Order;
import org.example.summer.dto.OrderDTO;
import org.example.summer.model.Event;
import org.example.summer.model.Orders;
import org.example.summer.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping ("/findOrderId/{id}")
    public Orders findOrderById(@PathVariable int id){
        Orders order = new Orders();
        try{
            order = orderService.findById(id);
        } catch(EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return order;
    }

    @PostMapping("/orders/create")
    public Order createOrder(@RequestBody OrderDTO orderDTO) throws Exception {
        return (Order) orderService.createOrder(orderDTO);
    }
}