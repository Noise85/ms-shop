package ch.iceage.shop.delivery.model;

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
@Table(name="SUPPLYER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplyer implements Persistable<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	@Column(name="COUNTRY_CODE")
	private String countryCode;
	@ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	
}
