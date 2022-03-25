package com.example.floristeria;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Florist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "florist")
    private List<Product> product = new ArrayList<>();
    public Florist() {
    }

    public Florist(String name) throws Exception{
        checkName(name);
        this.name = name;
    }

    private void checkName(String name) throws Exception{
        if(name.length()==0 || name == null) throw new Exception("We don't have a correct name");
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        checkName(name);
        this.name = name;
    }

    public void addProduct(Product product) {
        product.setFlorist(this);
        this.product.add(product);
    }

    public List<Product> getProduct() {
        return product;
    }
}
