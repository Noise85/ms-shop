package ch.iceage.shop.delivery.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericEntityRepository<T> extends JpaRepository<T, Long> {

}
