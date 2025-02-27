package com.estudocalil.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudocalil.course.entities.User;
import com.estudocalil.course.services.UserService;

import java.util.List;

@RestController //Indica que essa classe terá um controlador de recursos REST
@RequestMapping(value = "/users") //Indica o nome do recurso
public class UserResource {
    @Autowired
    private UserService service;
    //Endpoint de acesso aos usuários
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);  
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
