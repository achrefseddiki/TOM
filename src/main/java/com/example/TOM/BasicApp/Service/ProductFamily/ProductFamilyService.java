package com.example.TOM.BasicApp.Service.ProductFamily;

import com.example.TOM.BasicApp.Entity.ProductFamily;


import java.util.List;
import java.util.Optional;

public interface ProductFamilyService {


    void create(ProductFamily productFamily);

    void update(ProductFamily productFamily);

    void delete(ProductFamily productFamily);

    void delete(Long id);

    Optional<ProductFamily> read(Long id);

    List<ProductFamily> read();
}
