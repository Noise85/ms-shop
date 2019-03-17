package ch.iceage.shop.delivery.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.delivery.model.AddressType;

@RepositoryRestResource(path="address-types")
public interface AddressTypeRepository extends PagingAndSortingRepository<AddressType, Long> {

}
