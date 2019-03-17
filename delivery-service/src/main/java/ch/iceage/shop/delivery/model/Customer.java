package ch.iceage.shop.delivery.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("2")
public class Customer extends User {

	@ManyToOne
	@JoinColumn(name="MANAGER_ID")
	private Manager manager;
	
	public Customer(Manager manager) {
		this(null,null,null,null,null,manager);
	}
	
	public Customer(String firstName, String lastName, String nickName, String password, Address address, Manager manager) {
		super(firstName, lastName, nickName, password, address);
		this.manager=manager;
	}

	public Manager getManager() {
		return manager;
	}

	protected void setManager(Manager manager) {
		this.manager = manager;
	}
	

}
