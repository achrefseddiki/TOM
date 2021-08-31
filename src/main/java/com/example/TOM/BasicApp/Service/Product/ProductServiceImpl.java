package com.example.TOM.BasicApp.Service.Product;

import com.example.TOM.BasicApp.Entity.Product;
import com.example.TOM.BasicApp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService{



    @Autowired
    private ProductRepository productRepository;

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);

    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);

    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public Optional<Product> read(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> read() {
        return productRepository.findAll();
    }
}
