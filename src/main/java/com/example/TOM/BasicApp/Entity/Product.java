package com.example.TOM.BasicApp.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Product extends ProductFamily implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;


    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private String productTaste;


    private long productWeight;
    private long productThickness;
    private long productWidth;
    private long productLength;

    @Column(nullable = false)
    private long productNumberOfPieces;

    private String description;

    @ManyToMany(mappedBy = "products")
    private List<Machine> machines;


    //getter and setter


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductTaste() {
        return productTaste;
    }

    public void setProductTaste(String productTaste) {
        this.productTaste = productTaste;
    }

    public long getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(long productWeight) {
        this.productWeight = productWeight;
    }

    public long getProductThickness() {
        return productThickness;
    }

    public void setProductThickness(long productThickness) {
        this.productThickness = productThickness;
    }

    public long getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(long productWidth) {
        this.productWidth = productWidth;
    }

    public long getProductLength() {
        return productLength;
    }

    public void setProductLength(long productLength) {
        this.productLength = productLength;
    }

    public long getProductNumberOfPieces() {
        return productNumberOfPieces;
    }

    public void setProductNumberOfPieces(long productNumberOfPieces) {
        this.productNumberOfPieces = productNumberOfPieces;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}
