package org.example.summer.service;

import org.example.summer.repository.OrderRepository;
import org.example.summer.model.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOrder {
    private OrderRepository order_repository;
    public List<Orders> order_FindAll(){return order_repository.findAll();}

}
