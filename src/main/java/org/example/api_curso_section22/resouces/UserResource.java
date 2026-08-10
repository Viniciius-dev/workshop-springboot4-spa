package org.example.api_curso_section22.resouces;

import org.example.api_curso_section22.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getUser() {
        User u = new User(1L,"Maria", "maria@gemail", "94350", "12948");
        return ResponseEntity.ok().body(u);
    }
}
