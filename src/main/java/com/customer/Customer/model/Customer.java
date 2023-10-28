package com.customer.Customer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(updatable = false,nullable = false)
private Long id;

private String custname;

private String custemail;

@Column(updatable = false,nullable = false)
private String custid;

private String email;

private String itemname;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCustname() {
	return custname;
}

public void setCustname(String custname) {
	this.custname = custname;
}

public String getCustemail() {
	return custemail;
}

public void setCustemail(String custemail) {
	this.custemail = custemail;
}

public String getCustid() {
	return custid;
}

public void setCustid(String custid) {
	this.custid = custid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getItemname() {
	return itemname;
}

public void setItemname(String itemname) {
	this.itemname = itemname;
}

public Customer(Long id, String custname, String custemail, String custid, String email, String itemname) {
	super();
	this.id = id;
	this.custname = custname;
	this.custemail = custemail;
	this.custid = custid;
	this.email = email;
	this.itemname = itemname;
}
public Customer() {
	
}

@Override
public String toString() {
	return "Customer [id=" + id + ", custname=" + custname + ", custemail=" + custemail + ", custid=" + custid
			+ ", email=" + email + ", itemname=" + itemname + "]";
}

}
