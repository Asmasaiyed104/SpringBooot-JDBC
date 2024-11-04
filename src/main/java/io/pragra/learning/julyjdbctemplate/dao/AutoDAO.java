package io.pragra.learning.julyjdbctemplate.dao;

import io.pragra.learning.julyjdbctemplate.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AutoDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean saveProduct(Product product){
      int numbRowAffected =  jdbcTemplate.update("insert into PRODUCT values (?,?,?)",product.getProductId(),product.getProductMake(),product.getProductModel());
     return numbRowAffected>0;
    }

}
