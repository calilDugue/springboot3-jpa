package com.estudocalil.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudocalil.course.entities.User;

@RestController //Indica que essa classe terá um controlador de recursos REST
@RequestMapping(value = "/users") //Indica o nome do recurso
public class UserResource {

    //Endpoint de acesso aos usuários
    @GetMapping
    public ResponseEntity<User> findAll() {
        //Estou instanciando um novo usuário a caráter de teste
        User u = new User(1L, "Maria", "4t7o5@example.com", "99999999999", "123456");
        return ResponseEntity.ok().body(u);  
    }
}
