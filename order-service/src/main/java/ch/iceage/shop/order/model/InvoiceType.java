package ch.iceage.shop.order.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="INVOICE_TYPE")
@Data
@EqualsAndHashCode(callSuper=true)
public class InvoiceType extends AbstractDecodifica {

}
