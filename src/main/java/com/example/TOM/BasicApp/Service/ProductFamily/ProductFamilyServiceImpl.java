package com.example.TOM.BasicApp.Service.ProductFamily;

import com.example.TOM.BasicApp.Entity.ProductFamily;
import com.example.TOM.BasicApp.Repository.ProductFamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductFamilyServiceImpl implements ProductFamilyService{


    @Autowired
    private ProductFamilyRepository productFamilyRepository;

    @Override
    public void create(ProductFamily productFamily) {
        productFamilyRepository.save(productFamily);

    }

    @Override
    public void update(ProductFamily productFamily) {
        productFamilyRepository.save(productFamily);

    }

    @Override
    public void delete(ProductFamily productFamily) {
        productFamilyRepository.delete(productFamily);

    }

    @Override
    public void delete(Long id) {
        productFamilyRepository.deleteById(id);

    }

    @Override
    public Optional<ProductFamily> read(Long id) {
        return productFamilyRepository.findById(id);
    }

    @Override
    public List<ProductFamily> read() {
        return productFamilyRepository.findAll();
    }
}
