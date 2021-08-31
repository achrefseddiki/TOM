package com.example.TOM.BasicApp.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class Machine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String machineName;
    @Column(nullable = false)
    private String machineBuilder;
    @Column(nullable = false)
    private String machineRole;
    @ManyToMany
    private List<Product> products;




    //getter and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineBuilder() {
        return machineBuilder;
    }

    public void setMachineBuilder(String machineBuilder) {
        this.machineBuilder = machineBuilder;
    }

    public String getMachineRole() {
        return machineRole;
    }

    public void setMachineRole(String machineRole) {
        this.machineRole = machineRole;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
