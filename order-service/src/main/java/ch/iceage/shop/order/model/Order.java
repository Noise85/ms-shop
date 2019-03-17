package ch.iceage.shop.order.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="CORDER")
@AllArgsConstructor
@Data
public class Order implements Persistable<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	private String code;
	@Column(name="CREATION_DATE")
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	@Column(name="EMISSION_DATE")
	@Temporal(TemporalType.DATE)
	private Date emissionDate;
	@OneToMany(mappedBy="order",
			   cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@Fetch(FetchMode.SUBSELECT)
	private List<OrderLine> lines;
	@OneToMany(mappedBy="order",
			   cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Invoice> invoices;
	
	public Order() {
		this(null,null,null,null,new ArrayList<>(), new ArrayList<>());
	}
	
	public void addLine(Long productId, Float quantity) {
		OrderLine line = new OrderLine();
		line.setProductId(productId);
		line.setOrder(this);
		line.setQuantity(quantity);
		this.lines.add(line);
	}
	
	public void removeLine(OrderLine line) {
		this.lines.remove(line);
	}

	public void addInvoice(Invoice invoice) {
		this.invoices.add(invoice);
		invoice.setOrder(this);
	}
	
}
