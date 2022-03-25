package com.example.floristeria;

import javax.persistence.*;

@Entity
public class Flower extends Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String color;


    public Flower() {
    }

    public Flower(double cost,int stock, String color) throws Exception {
        super(cost,stock);
        checkColor(color);
        this.color = color;
    }

    private void checkColor(String color) throws Exception{
        if (color.length() == 0 || color == null) throw new Exception("The color must have value");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws Exception{
        checkColor(color);
        this.color = color;
    }
}
