package myPackage.E_Comm;

public class ProductService {
	
	private Product product;
	
	
	public ProductService(String name, double price, int quantity) {
		this.product= new Product(name, price, quantity);
	}
	
	public void reduceQuantity(int SoldQty) {
		product.setQuantity(product.getQuantity()-SoldQty);
	}
	
	public boolean checkAvailability() {
		
		return product.getQuantity()>0;
	}
	

}
