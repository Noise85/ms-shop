package ch.iceage.shop.delivery.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class AbstractDecodifica implements Persistable<Integer> {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer code;
	@Column(name="CHAR_CODE")
	private String charCode;
	@Column(name="SHORT_DESCRIPTION")
	private String shortDescription;
	private String description;
	
}
