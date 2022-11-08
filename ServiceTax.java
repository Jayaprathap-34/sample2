package com.example.ServiceTax;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicetax_details")
public class ServiceTax {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int tax;
	private int hsn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getHsn() {
		return hsn;
	}
	public void setHsn(int hsn) {
		this.hsn = hsn;
	}
	
}
