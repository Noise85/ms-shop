package ch.iceage.shop.delivery.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("1")
public class Manager extends User {

	@OneToMany(mappedBy="manager")
	private List<Customer> subscribers;
	
	public Manager() {
		super();
	}
	
	public Manager(String firstName, String lastName, String nickName, String password, Address address) {
		super(firstName, lastName, nickName, password, address);
		this.subscribers=new ArrayList<>();
	}
	
	public List<Customer> getSubscribers() {
		return subscribers;
	}
	
	public void add(Customer subscriber) {
		subscribers.add(subscriber);
		subscriber.setManager(this);
	}

	public boolean remove(Customer subscriber) {
		return subscribers.remove(subscriber);
	}
	
}
