package ch.iceage.shop.product.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.product.model.Product;

@RepositoryRestResource(path="products")
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}
