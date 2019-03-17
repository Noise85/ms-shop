package ch.iceage.shop.delivery.rest.service;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.delivery.model.Manager;

@RepositoryRestResource(path="managers")
public interface ManagerRepository extends GenericEntityRepository<Manager> {

}
