package com.ifpb.edu.couse.repositories;

import com.ifpb.edu.couse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
