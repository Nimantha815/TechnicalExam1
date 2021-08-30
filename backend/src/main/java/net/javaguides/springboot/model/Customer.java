package net.javaguides.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "person")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long person_id;
	
	@Column(name = "per_f_name")
	private String per_f_name;
	
	@Column(name = "per_l_name")
	private String per_l_name;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "nic")
	private String nic;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "address")
	private String address;
	
	
	
	
	public Customer() {
		
	}
	
	public Customer(String firstname , String lastName, Date dob, String phone , String nic, String gender, String address) {
		super();
		this.per_f_name = firstname;
		this.per_l_name = lastName;
		this.dob = dob;
		this.phone = phone;
		this.nic =nic;
		this.gender = gender;
		this.address =address;
		
	}
	public long getId() {
		return person_id;
	}
	public void setId(long person_id) {
		this.person_id = person_id;
	}
	public String getFirstName() {
		return per_f_name;
		
	
}
	public String getLastName() {
		return per_l_name;
}
	public Date getDob() {
		return dob;
}
	public String getPhone() {
		return phone;
}
	public String getNic() {
		return nic;
}
	public String getGender() {
		return gender;
}
	public String getAddress() {
		return address;
}
}