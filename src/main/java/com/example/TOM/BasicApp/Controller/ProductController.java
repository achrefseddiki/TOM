package com.example.TOM.BasicApp.Controller;

import com.example.TOM.BasicApp.Entity.Product;
import com.example.TOM.BasicApp.Service.Product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/product")
@CrossOrigin(origins = "*")
public class ProductController {



    @Autowired
    private ProductService productService;


    @GetMapping(value = "/show")
    public List<Product> getProduct() {

        List<Product> products = productService.read();

        return products;
    }

    @GetMapping(value = "/show/{id}")
    public Optional<Product> getProduct(@PathVariable Long id) {

        Optional<Product> products = productService.read(id);

        return products;
    }

    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public void creatProduct(@RequestBody Product product){
        productService.create(product);

    }



    @DeleteMapping("/delete/{id}")
    public List<Product> deleteProduct(@PathVariable long id) {
        productService.delete(id);
        return getProduct();
    }


}
