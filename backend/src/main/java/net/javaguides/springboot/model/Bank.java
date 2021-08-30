package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank")
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bank_id;
	
	@Column(name = "bank_name")
	private String bank_name;
	
	
	
	
	public Bank() {
		
	}
	
	public Bank(String bankname) {
		super();
		this.bank_name = bankname;
		
	}
	public long getId() {
		return bank_id;
	}
	public void setId(long bank_id) {
		this.bank_id = bank_id;
	}
	public String getFirstName() {
		return bank_name;
	}
	
	
	
	
	

}