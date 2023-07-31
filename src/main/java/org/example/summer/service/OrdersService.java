package org.example.summer.service;

import exception.TicketCategoryNotValid;
import exception.UserNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.example.summer.dto.OrderDTO;
import org.example.summer.model.TicketCategory;
import org.example.summer.repository.CustomerRepository;
import org.example.summer.repository.OrdersRepository;
import org.example.summer.model.Orders;
import org.example.summer.repository.TicketCategoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {
    private OrdersRepository orderRepository;
    private CustomerRepository customerRepository;
    private TicketCategoryRepository ticketCategoryRepository;

    public OrdersService(OrdersRepository orderRepository, CustomerRepository customerRepository, TicketCategoryRepository ticketCategoryRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
    }
    public Orders findById(int id){
        Optional<Orders> orderFindById = orderRepository.findById(id);
        if (orderFindById.isPresent()) {
            return orderFindById.get();
        } else {
            throw new EntityNotFoundException("Event not found " + orderFindById);
        }
    }
    public List<Orders> orderFindAll(){
        return orderRepository.findAll();
    }
    public Orders createOrder(OrderDTO orderDTO) throws Exception {
        Orders order = new Orders();

        Optional<TicketCategory> ticketCategory = ticketCategoryRepository.findById(orderDTO.getTicketCategoryID());
        if (ticketCategory.isEmpty()) {
            throw new TicketCategoryNotValid("Ticket category not valid!");
        } else {
            order.setTicketCategory(ticketCategory.get());
            order.setNumberOfTickets(orderDTO.getNumberOfTickets());

            Float totalPrice = order.getNumberOfTickets() * ticketCategory.get().getPrice();
            order.setTotalPrice(totalPrice);

            order.setOrderedAt(LocalDate.now());
            if (customerRepository.findById(1).isEmpty()) {
                throw new UserNotFoundException("User does not exist!");
            } else {
                order.setCustomer(customerRepository.findById(1).get());
                return orderRepository.save(order);
            }
        }
    }
    public Optional<Orders> findCustomerOrders(int customerId) {
        return orderRepository.findById(customerId);
    }
}
