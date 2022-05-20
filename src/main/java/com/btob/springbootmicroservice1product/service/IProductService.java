package com.btob.springbootmicroservice1product.service;

import com.btob.springbootmicroservice1product.model.Product;

import java.util.List;

/**
 * @author nazanOk
 */
public interface IProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}