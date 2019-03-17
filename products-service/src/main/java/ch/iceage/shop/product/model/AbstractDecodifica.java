package ch.iceage.shop.product.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractDecodifica implements Persistable<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;
	protected Integer code;
	@Column(name="CHAR_CODE")
	protected String charCode;
	@Column(name="SHORT_DESCRIPTION")
	protected String shortDescription;
	protected String description;
	
	public AbstractDecodifica(Integer code, String charCode, String shortDescription, String description) {
		this.code = code;
		this.charCode = charCode;
		this.shortDescription = shortDescription;
		this.description = description;
	}
	
	public AbstractDecodifica() {
		this(null,null,null,null);
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getCharCode() {
		return charCode;
	}
	public void setCharCode(String charCode) {
		this.charCode = charCode;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
}
