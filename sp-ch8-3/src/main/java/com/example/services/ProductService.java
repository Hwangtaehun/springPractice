package com.example.services;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> prodocts = new ArrayList<>();

    public void addProduct(Product p){
        prodocts.add(p);
    }

    public List<Product> findAll(){
        return prodocts;
    }
}
