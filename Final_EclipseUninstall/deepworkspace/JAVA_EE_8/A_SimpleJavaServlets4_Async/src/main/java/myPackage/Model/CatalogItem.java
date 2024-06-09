package myPackage.Model;

public class CatalogItem {
	
	private String name;
	private String manufacturer;
	private String sku;
	
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

	public CatalogItem(String name, String manufacturer, String sku) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.sku = sku;
	}
	
	@Override
	public String toString() {
		return "CatalogItem [name=" + name + ", manufacturer=" + manufacturer + ", sku=" + sku + "]";
	}
	
	
	

}
