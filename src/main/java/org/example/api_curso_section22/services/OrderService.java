package org.example.api_curso_section22.services;

import org.example.api_curso_section22.entities.Order;
import org.example.api_curso_section22.entities.User;
import org.example.api_curso_section22.repositories.OrderRepository;
import org.example.api_curso_section22.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll(){
        return OrderRepository.findAll();
    }

    public Order findById(Long id){
      Optional<Order> obj = OrderRepository.findById(id);
      return obj.get();
    }
}
