package ch.iceage.shop.delivery.rest.service;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.delivery.model.Address;

@RepositoryRestResource(path="addresses")
public interface AddressRepository extends GenericEntityRepository<Address> {

}
