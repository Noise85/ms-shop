package ch.iceage.shop.product.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.product.model.RecyclingPackageType;

@RepositoryRestResource(path="package-types")
public interface RecyclingPackageTypeRepository extends PagingAndSortingRepository<RecyclingPackageType, Long> {

}
