package com.wellsfargo.counselor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.counselor.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}