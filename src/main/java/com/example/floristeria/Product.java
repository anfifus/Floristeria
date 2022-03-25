package com.example.floristeria;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double cost;
    private int stock;
    @ManyToOne
    @JoinColumn(name = "florist_id")
    private Florist florist;

    public Product() {
    }

    public Product(double cost,int stock) throws Exception{
        checkCost(cost);
        checkStock(stock);
        this.cost = cost;
        this.stock = stock;
    }

    private void checkStock(int stock) throws Exception{
        if(stock <= 0) throw new Exception();
    }

    private void checkCost(double cost)throws Exception {
        if(cost<=0) throw new Exception("The cost must have greater than 0");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) throws Exception{
        checkCost(cost);
        this.cost = cost;
    }

    public void setFlorist(Florist florist) {
        this.florist = florist;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws Exception{
        checkStock(stock);
        this.stock = stock;
    }
}
