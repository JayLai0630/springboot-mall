package com.jaylai.springbootmall.dao;

import com.jaylai.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
