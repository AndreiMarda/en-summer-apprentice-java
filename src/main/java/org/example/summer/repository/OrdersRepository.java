package org.example.summer.repository;

import jakarta.persistence.criteria.Order;
import org.example.summer.model.Customer;
import org.example.summer.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    List<Order> searchByCustomer(Customer customer);
}