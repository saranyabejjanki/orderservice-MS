package com.sarulearn.orderservice.controller;

import com.sarulearn.orderservice.dto.OrderDTO;
import com.sarulearn.orderservice.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="orders")
public class OrderController {

    @Autowired
    IOrderService orderService;

    public ResponseEntity<OrderDTO> saveOrder(OrderDTO  orderDTO){

        orderService.saveOrder(orderDTO);

    }


}
