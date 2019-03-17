package ch.iceage.shop.order.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.iceage.shop.order.model.Invoice;

@RepositoryRestResource(path="/invoices")
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long>{

}
