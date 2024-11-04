package io.pragra.learning.julyjdbctemplate.api;

import io.pragra.learning.julyjdbctemplate.dao.AutoDAO;
import io.pragra.learning.julyjdbctemplate.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class AutoAPI {
    @Autowired
    private AutoDAO autoDAO;



    @PostMapping("/add")
    public String InsertProduct(@RequestBody List<Product> products){
        System.out.println(products);
        for(Product p : products)
        autoDAO.saveProduct(p);
         return "Product Inserted Successfully";
    }
}
