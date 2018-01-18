package com.product.service.impl;

import com.product.model.Product;
import com.product.service.IProductInfo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository("iProductInfo")
public class ProductInfoImpl implements IProductInfo {

    //This "movieFindCache" is delcares in ehcache.xml
    @Cacheable(value="productFindCache", key="#id")
    public Product getProductById(int id) {
        slowQuery(2000L);
        System.out.println("getProductById is running...");
        return new Product(100,"Bathing Soap", "Glycerene", "18-Jan-18", "18-Jan-18");
    }

    private void slowQuery(long seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }


}
