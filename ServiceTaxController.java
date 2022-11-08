package com.example.ServiceTax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTaxController {
	@Autowired
	ServiceTaxService st;
	@PostMapping(value="/store")
	public String store(@RequestBody List<ServiceTax> s) {
		return st.store(s);
		
	}
       @RequestMapping (value="/showtax/{a}")
	public int showtax(@PathVariable int a) {
		return st.showtax(a);
	}
       
	
}
