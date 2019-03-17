package ch.iceage.shop.product.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.product.model.ProductCertification;

@RepositoryRestResource(path="product-certifications")
public interface ProductCertificationRepository extends PagingAndSortingRepository<ProductCertification, Long> {

}
