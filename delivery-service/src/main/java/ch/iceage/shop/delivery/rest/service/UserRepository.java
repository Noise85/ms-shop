package ch.iceage.shop.delivery.rest.service;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.delivery.model.User;

@RepositoryRestResource(path="users")
public interface UserRepository extends GenericEntityRepository<User> {

}
