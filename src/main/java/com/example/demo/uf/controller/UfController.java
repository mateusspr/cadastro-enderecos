package com.example.demo.uf.controller;


import com.example.demo.uf.model.Uf;
import com.example.demo.uf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uf")
public class UfController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Uf> listAll(){
        return productService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Uf createUf(@RequestBody Uf product){
        return productService.saveProduct(product);
    }
}
