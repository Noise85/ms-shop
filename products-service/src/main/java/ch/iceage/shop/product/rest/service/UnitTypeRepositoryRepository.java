package ch.iceage.shop.product.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.product.model.UnitType;

@RepositoryRestResource(path="unit-types")
public interface UnitTypeRepositoryRepository extends PagingAndSortingRepository<UnitType, Long> {

}
