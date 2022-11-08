package com.example.ServiceTax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTaxService {
	@Autowired
	ServiceTaxDao sd;
	
	public String store(List<ServiceTax> s) {
		return sd.store(s);
	}
	public int showtax(int a) {		
		return sd.showtax(a);
	}
}
