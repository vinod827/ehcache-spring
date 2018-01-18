package com.product.model;

import java.io.Serializable;

public class Product implements Serializable{

    int productId;
    String productName;
    String productDescription;
    String createdDate;
    String updatedDate;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product(int productId, String productName, String productDescription, String createdDate, String updatedDate) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
