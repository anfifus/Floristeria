package com.example.floristeria;

import javax.persistence.*;

@Entity
public class Decoration extends  Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private final static int WOOD = 1;
    private final static int PLASTIC = 2;
    private int material;


    public Decoration() {
    }

    public Decoration(double cost,int stock, int material) throws Exception {
        super(cost,stock);
        checkMaterial(material);
        this.material = material;
    }

    private void checkMaterial(int material) throws Exception{
        if(material < 1 || material > 2) throw new Exception("The material must be 1 for wood or 2 for plastic");
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) throws Exception{
        checkMaterial(material);
        this.material = material;
    }
}
