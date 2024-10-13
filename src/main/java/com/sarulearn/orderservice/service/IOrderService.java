package com.sarulearn.orderservice.service;


import com.sarulearn.orderservice.dto.OrderDTO;

public interface IOrderService {
    OrderDTO saveOrder(OrderDTO orderDTO);
}
