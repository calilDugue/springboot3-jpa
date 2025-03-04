package com.estudocalil.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudocalil.course.entities.Product;
import com.estudocalil.course.services.ProductService;

import java.util.List;

@RestController //Indica que essa classe terá um controlador de recursos REST
@RequestMapping(value = "/products") //Indica o nome do recurso
public class ProductResource {
    @Autowired
    private ProductService service;
    //Endpoint de acesso aos usuários
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);  
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
