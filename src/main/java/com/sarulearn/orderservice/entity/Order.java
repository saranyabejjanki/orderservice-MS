package com.sarulearn.orderservice.entity;


import com.sarulearn.orderservice.dto.FoodItemDTO;
import com.sarulearn.orderservice.dto.Restaurant;
import com.sarulearn.orderservice.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {
    private  Integer orderId;
    private UserDTO userDTO;
    private List<FoodItemDTO> foodItemDTOList;
    private Restaurant restaurant;

}
