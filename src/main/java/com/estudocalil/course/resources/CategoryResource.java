package com.estudocalil.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudocalil.course.entities.Category;
import com.estudocalil.course.services.CategoryService;

import java.util.List;

@RestController //Indica que essa classe terá um controlador de recursos REST
@RequestMapping(value = "/categories") //Indica o nome do recurso
public class CategoryResource {
    @Autowired
    private CategoryService service;
    //Endpoint de acesso aos usuários
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);  
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
