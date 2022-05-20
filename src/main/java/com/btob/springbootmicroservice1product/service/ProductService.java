package com.btob.springbootmicroservice1product.service;

import com.btob.springbootmicroservice1product.model.Product;
import com.btob.springbootmicroservice1product.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author nazanOk
 */
@Service
public class ProductService implements IProductService
{
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product)
    {
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId)
    {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts()
    {
        return productRepository.findAll();
    }
}
