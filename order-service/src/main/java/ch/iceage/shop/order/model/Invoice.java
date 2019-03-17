package ch.iceage.shop.order.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="INVOICE")
@AllArgsConstructor
@Data
public class Invoice implements Persistable<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	@Column(name="CUSTOMER_ID")
	private Long customerId;
	@Column(name="REFERENCE_NUMBER")
	private String referenceNumber;
	@Column(name="EMISSION_DATE")
	@Temporal(TemporalType.DATE)
	private Date emissionDate;
	@Column(name="EXPIRY_DATE")
	@Temporal(TemporalType.DATE)
	private Date expiryDate;
	@Column(name="PAYMENT_DATE")
	@Temporal(TemporalType.DATE)
	private Date paymentDate;
	@Column(name="COMMUNICATION_TEXT")
	private String text;
	@ManyToOne
	@JoinColumn(name="INVOICE_TYPE_ID")
	private InvoiceType invoiceType;
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;
	
	public Invoice() {
		this(null,null,null,null,null,null,null,null,null);
	}
	
}
