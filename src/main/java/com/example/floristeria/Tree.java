package com.example.floristeria;

import javax.persistence.*;

@Entity
public class Tree extends Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int height;

    public Tree() {
    }

    public Tree(double cost,int stock, int height) throws Exception {
        super(cost,stock);
        checkHeight(height);
        this.height = height;
    }

    private void checkHeight(int height) throws Exception{
        if(height <= 0) throw new Exception("The height must have greater than 0");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws Exception{
        checkHeight(height);
        this.height = height;
    }
}
