package com.ifpb.edu.couse.repositories;

import com.ifpb.edu.couse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
