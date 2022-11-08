package com.example.ServiceTax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ServiceTaxDao {
@Autowired
	ServiceTaxRepository sr;
	public String store(List<ServiceTax> s) {
		sr.saveAll(s);
		return "store succesfully";
	}

	public int showtax(int a) {
		
		return sr.findByHsn(a);
	}

}
