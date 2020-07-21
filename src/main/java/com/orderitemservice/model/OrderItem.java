package com.orderitemservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 5513731828062327680L;
	
	@Id  
	private int itemId;
	
	@Column
	private String Productcode;
	@Column
	private String Productname;
	@Column
	private String Quantity;
	
	public String getProductcode() {
		return Productcode;
	}
	public void setProductcode(String productcode) {
		Productcode = productcode;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "OrderItem [Productcode=" + Productcode + ", Productname=" + Productname + ", Quantity=" + Quantity
				+ "]";
	}
	
	
	


}
