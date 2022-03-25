package com.example.floristeria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FloristeriaRestController {
    private FloristService floristService;
    @Autowired
    public FloristeriaRestController(FloristService floristService) {
        this.floristService = floristService;
    }

    @GetMapping("/florists")
    public List<Florist> getFlorists(){
        return floristService.getFlorists();
    }
    @PostMapping("/florists")
    public Florist postFlorists(@RequestBody Florist florist){
        return floristService.addFlorist(florist);
    }
    @DeleteMapping("/florists")
    public void deleteFlorists(){
        floristService.deleteAll();
    }
    @PostMapping("/florists/{id}/products")
    public Product addProduct(@PathVariable Long id,@RequestBody Product product){
        return floristService.addProduct(id,product);
    }
    @PostMapping("/florists/{id}/trees")
    public Product addProduct(@PathVariable Long id,@RequestBody Tree product){
        return floristService.addProduct(id,product);
    }
    @PostMapping("/florists/{id}/flowers")
    public Product addProduct(@PathVariable Long id,@RequestBody Flower product){
        return floristService.addProduct(id,product);
    }
    @PostMapping("/florists/{id}/decorations")
    public Product addProduct(@PathVariable Long id,@RequestBody Decoration product){
        return floristService.addProduct(id,product);
    }
    @DeleteMapping("/florists/{id}/")
    public void deleteProducts(@PathVariable Long id){
        floristService.deleteAllProduct(id);
    }
    @DeleteMapping("/florists/{id}/decorations/{idProduct}")
    public Product deleteProduct(@PathVariable Long id, @PathVariable Long idProduct){
        return floristService.deleteProduct(id,idProduct);
    }

    @PutMapping("/florists/{id}/products")
    public Product addProduct(@PathVariable Long id,@RequestBody Product product){
        return floristService.updateProduct(id,product);
    }
    @PutMapping("/florists/{id}/trees")
    public Product addProduct(@PathVariable Long id,@RequestBody Tree product){
        return floristService.updateProduct(id,product);
    }
    @PutMapping("/florists/{id}/flowers")
    public Product addProduct(@PathVariable Long id,@RequestBody Flower product){
        return floristService.updateProduct(id,product);
    }
    @PutMapping("/florists/{id}/decorations")
    public Product addProduct(@PathVariable Long id,@RequestBody Decoration product){
        return floristService.updateProduct(id,product);
    }

}
