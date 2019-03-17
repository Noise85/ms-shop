package ch.iceage.shop.product.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="product-categories")
public interface ProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Long> {

}
