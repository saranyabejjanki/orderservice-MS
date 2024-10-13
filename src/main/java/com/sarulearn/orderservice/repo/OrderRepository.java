package com.sarulearn.orderservice.repo;

import com.sarulearn.orderservice.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order,Integer> {
}
