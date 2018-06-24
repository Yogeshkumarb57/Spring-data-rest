package com.springboot.tutorial.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.tutorial.data.rest.model.Product;

@RepositoryRestResource(path="/products",collectionResourceRel="/products")
public interface ProdutRepository extends JpaRepository<Product, Integer> {

}
