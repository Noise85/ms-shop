package ch.iceage.shop.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Persistable<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="DEFAULT_QUANTITY")
	private Float defaultQuantity;
	@Column(name="DEFAULT_PRICE")
	private Float defaultPrice;
	@Column(name="DISCOUNT_PRICE")
	private Float discountPrice;
	@Column(name="PRODUCT_AVALABILITY")
	private Boolean available;
	@Column(name="SUPPLYER_ID")
	private Long supplyerId;
	@ManyToOne
	@JoinColumn(name="UNIT_TYPE_ID")
	private UnitType unitType;
	@ManyToOne
	@JoinColumn(name="PRODUCT_CATEGORY_ID")
	private ProductCategory category;
	@ManyToOne
	@JoinColumn(name="PRODUCT_CERTIFICATION_ID")
	private ProductCertification certification;
	@ManyToOne
	@JoinColumn(name="RECYCLING_PACKAGE_TYPE_ID")
	private RecyclingPackageType packageType;
	
}
