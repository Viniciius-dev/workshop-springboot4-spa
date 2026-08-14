package org.example.api_curso_section22.repositories;

import org.example.api_curso_section22.entities.Order;
import org.example.api_curso_section22.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
@RequestMapping(value = "/users")
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<User> id(Long id);
}
