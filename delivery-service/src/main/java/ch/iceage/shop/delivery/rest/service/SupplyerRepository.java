package ch.iceage.shop.delivery.rest.service;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.delivery.model.Supplyer;

@RepositoryRestResource(path="suppliers")
public interface SupplyerRepository extends GenericEntityRepository<Supplyer> {

}
