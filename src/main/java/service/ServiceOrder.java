package service;

import com.endava.model.Orders;
import org.springframework.stereotype.Service;
import repository.OrderRepository;

import java.util.List;

@Service
public class ServiceOrder {
    private OrderRepository order_repository;
    public List<Orders> order_FindAll(){return order_repository.findAll();}

}
