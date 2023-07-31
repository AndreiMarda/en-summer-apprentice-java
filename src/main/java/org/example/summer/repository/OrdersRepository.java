package org.example.summer.repository;

import jakarta.persistence.criteria.Order;
import org.example.summer.model.Customer;
import org.example.summer.model.Event;
import org.example.summer.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    @Query("SELECT o FROM Orders o WHERE o.ticketCategory.ticketCategoryId = :ticket_category_id AND o.customer.customerName = :customer_name")
    List<Event> searchByCustomerAndTicketCategory(@Param("ticket_category_id") int ticket_category_id, @Param("customer_name") String customer_name);

    @Query("SELECT o FROM Orders o WHERE o.ticketCategory.ticketCategoryId = :ticket_category_id")
    List <Event> searchByTicketCategory(@Param("ticket_category_id") Integer ticket_category_id);

    @Query("SELECT 0 FROM Orders o WHERE o.customer.customerName = :customer_name")
    List<Event> searchByCustomer(@Param("customer_name") String customer_name);
}