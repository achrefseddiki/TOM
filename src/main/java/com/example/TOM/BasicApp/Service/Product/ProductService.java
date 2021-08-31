package com.example.TOM.BasicApp.Service.Product;

import com.example.TOM.BasicApp.Entity.Product;


import java.util.List;
import java.util.Optional;

public interface ProductService {
    void create(Product product);

    void update(Product product);

    void delete(Product product);

    void delete(Long id);

    Optional<Product> read(Long id);

    List<Product> read();
}
