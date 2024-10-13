package com.sarulearn.orderservice.service;

import com.sarulearn.orderservice.dto.OrderDTO;
import com.sarulearn.orderservice.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) {
        return null;
    }
}
