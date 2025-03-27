package com.supriya;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Factory {
	@Id
	   // @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	
		private String name;
    
		@OneToMany(mappedBy = "factory",cascade = CascadeType.ALL)
		private List<Product> products= new ArrayList<>();
	    
	    public Long getId() {
		return id;
	}

	public void setId(Long idfactory) {
		this.id = idfactory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
}
