package com.projetospring.projeto.repositories;

import com.projetospring.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
