package com.DeepJSF;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

//Looks like most of the Java Server Faces things is deprecated..

@NoneScoped
@ViewScoped
@SessionScoped
@javax.faces.bean.SessionScoped
@ApplicationScoped
@CustomScoped(value = "")




@RequestScoped
@Named
public class DeepCatalogItemFromBean {

	private String name;
	private String manufacturer;
	private String sku;
	
	
	
	public DeepCatalogItemFromBean(String name, String manufacturer, String sku) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.sku = sku;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	
}
