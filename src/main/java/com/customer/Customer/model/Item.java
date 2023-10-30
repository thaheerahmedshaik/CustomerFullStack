package com.customer.Customer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,nullable = false)
	private long itemno;
	
	private String itemname;
	
	private double itemcost;
	
	private String itemquality;
	
	private String itemQuanity;
	
	private String imageUrl;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public long getItemno() {
		return itemno;
	}

	public void setItemno(long itemno) {
		this.itemno = itemno;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getItemcost() {
		return itemcost;
	}

	public void setItemcost(double itemcost) {
		this.itemcost = itemcost;
	}

	public String getItemquality() {
		return itemquality;
	}

	public void setItemquality(String itemquality) {
		this.itemquality = itemquality;
	}

	public String getItemQuanity() {
		return itemQuanity;
	}

	public void setItemQuanity(String itemQuanity) {
		this.itemQuanity = itemQuanity;
	}

	public Item(long itemno, String itemname, double itemcost, String itemquality, String itemQuanity,String imageUrl) {
		super();
		this.itemno = itemno;
		this.itemname = itemname;
		this.itemcost = itemcost;
		this.itemquality = itemquality;
		this.itemQuanity = itemQuanity;
		this.imageUrl=imageUrl;
	}
	
	public Item() {
		
	}

	@Override
	public String toString() {
		return "Item [itemno=" + itemno + ", itemname=" + itemname + ", itemcost=" + itemcost + ", itemquality="
				+ itemquality + ", itemQuanity=" + itemQuanity + ", imageUrl=" + imageUrl + "]";
	}




	
}
