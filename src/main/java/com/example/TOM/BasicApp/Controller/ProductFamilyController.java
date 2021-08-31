package com.example.TOM.BasicApp.Controller;

import com.example.TOM.BasicApp.Entity.ProductFamily;
import com.example.TOM.BasicApp.Service.ProductFamily.ProductFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/productFamily")
@CrossOrigin(origins = "*")
public class ProductFamilyController {


    @Autowired
    private ProductFamilyService productFamilyService;


    @GetMapping(value = "/show")
    public List<ProductFamily> getProductFamily() {

        List<ProductFamily> productFamilies = productFamilyService.read();

        return productFamilies;
    }

    @GetMapping(value = "/show/{id}")
    public Optional<ProductFamily> getProductFamily(@PathVariable Long id) {

        Optional<ProductFamily> productFamilies = productFamilyService.read(id);

        return productFamilies;
    }

    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public void creatProductFamily(@RequestBody ProductFamily productFamily){
        productFamilyService.create(productFamily);

    }



    @DeleteMapping("/delete/{id}")
    public List<ProductFamily> deleteProductFamily(@PathVariable long id) {
        productFamilyService.delete(id);
        return getProductFamily();
    }

}
