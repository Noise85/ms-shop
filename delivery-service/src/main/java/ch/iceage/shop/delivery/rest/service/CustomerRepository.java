package ch.iceage.shop.delivery.rest.service;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.delivery.model.Customer;

@RepositoryRestResource(path="customers")
public interface CustomerRepository extends GenericEntityRepository<Customer> {

}
