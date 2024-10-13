package com.sarulearn.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private  Integer orderId;
    private UserDTO userDTO;
    private List<FoodItemDTO> foodItemDTOList;
    private Restaurant restaurant;
}
