package com.jaylai.springbootmall.service.impl;

import com.jaylai.springbootmall.dao.ProductDao;
import com.jaylai.springbootmall.model.Product;
import com.jaylai.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
