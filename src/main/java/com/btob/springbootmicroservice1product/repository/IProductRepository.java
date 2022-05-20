package com.btob.springbootmicroservice1product.repository;

import com.btob.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nazanOk
 */
public interface IProductRepository extends JpaRepository<Product, Long>
{
}