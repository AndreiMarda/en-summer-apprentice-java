package org.example.summer.service.mapper;

import org.example.summer.dto.OrderDTO;
import org.example.summer.model.Orders;

public class OrdersMapper {
    public static OrderDTO converter (Orders order){
        OrderDTO orderDto = new OrderDTO();
        order.setOrderID(orderDto.getOrderId());
        order.setCustomer(orderDto.getCustomer());
        order.setNumberOfTickets(orderDto.getNumberOfTickets());
        order.setTicketCategory(orderDto.getTicketCategory());
        order.setTotalPrice(orderDto.getTotalPrice());
        return orderDto;
    }
}
