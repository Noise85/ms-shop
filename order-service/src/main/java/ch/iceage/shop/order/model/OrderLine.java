package ch.iceage.shop.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ORDER_LINE")
@NoArgsConstructor
@Data
public class OrderLine implements Persistable<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	@Column(name="ORDERED_QUANTITY")
	private Float quantity;
	@Column(name="EFFECTIVE_QUANTITY")
	private Float effectiveQuantity;
	@Column(name="PRODUCT_ID")
	private Long productId;
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;
	
	protected OrderLine(Float quantity, Long productId, Order order) {
		this.id=null;
		this.quantity = quantity;
		this.productId=productId;
		this.order = order;
	}
	
}
