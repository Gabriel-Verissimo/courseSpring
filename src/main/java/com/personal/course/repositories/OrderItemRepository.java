package com.personal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.course.entities.OrderItem;
import com.personal.course.entities.pk.OrderItemPK;

public interface  OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
