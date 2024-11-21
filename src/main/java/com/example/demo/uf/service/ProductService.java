package com.example.demo.uf.service;

import com.example.demo.uf.model.Uf;
import com.example.demo.uf.repository.UfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private UfRepository ufRepository;

    public List<Uf> listAll(){
        return ufRepository.findAll();
    }

    public Uf saveProduct(Uf product){
        return ufRepository.save(product);
    }

    public void deleteById(Long id) {
        ufRepository.deleteById(id);
    }
}
