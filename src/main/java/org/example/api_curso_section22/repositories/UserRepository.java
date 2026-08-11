package org.example.api_curso_section22.repositories;

import org.example.api_curso_section22.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
