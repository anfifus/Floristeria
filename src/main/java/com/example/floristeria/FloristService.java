package com.example.floristeria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FloristService {
    private FloristRepository floristRepository;
    private ProductRepository productRepository;
    @Autowired
    public FloristService(FloristRepository floristRepository,ProductRepository productRepository) {
        this.floristRepository = floristRepository;
        this.productRepository = productRepository;
    }

    public List<Florist> getFlorists() {
        return (List<Florist>) floristRepository.findAll();
    }

    public Florist addFlorist(Florist florist) {
        return floristRepository.save(florist);
    }

    public void deleteAll() {
        floristRepository.deleteAll();
    }

    public Product addProduct(Long id, Product product) {
        Florist florist = floristRepository.findById(id).get();
        florist.addProduct(product);
        productRepository.save(product);
        return product;
    }

    public void deleteAllProduct(Long id) {
        Florist florist = floristRepository.findById(id).get();
        productRepository.deleteAll();
    }


    public Product deleteProduct(Long id, Long idProduct) {
        Florist florist = floristRepository.findById(id).get();
        Product product = productRepository.findById(idProduct).get();
        productRepository.delete(product);
        return product;
    }
}
