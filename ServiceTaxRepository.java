package com.example.ServiceTax;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServiceTaxRepository extends JpaRepository<ServiceTax,Integer>{
	@Query(value="select tax from servicetax_details where hsn=?",nativeQuery=true)
	public int findByHsn(int a);
	
	
}

