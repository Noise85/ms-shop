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
@Table(name="ADDRESS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Persistable<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="STREET")
	private String streetName;
	@Column(name="STREET_NUMBER")
	private String streetNumber;
	@Column(name="STREET_COMP_NUMBER")
	private String additionalStreetNumber;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE_NUMBER")
	private String phone;
	@ManyToOne
	@JoinColumn(name="ADDRESS_TYPE_ID")
	private AddressType type;
	@ManyToOne
	@JoinColumn(name="POST_PLACE_ID")
	private Place place;

}
