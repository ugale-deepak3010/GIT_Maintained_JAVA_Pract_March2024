package myPackage;

import myPackage.E_Comm.ProductService;
import myPackage.LibraryManagement.Library;

public class Ain {

	public static void main(String[] args) {


		System.out.println("Heloo");
		
		
		
		ProductService productService= new ProductService("SOAP", 11.00, 5);
		
		productService.reduceQuantity(4);
		boolean isAvailable=  productService.checkAvailability();
		
		System.out.println(isAvailable);
		
		System.err.println("-------------------------------------");
		
		Library library= new Library();
		library.addBook("TheDeepak", "Deepak Ugale", "Biography");
		library.addBook("TheKing", "King Ugale", "Biography");
		library.addBook("TheSudam", "Mohan Ugale", "Biography");
		library.addBook("TheSuper", "Super Team Ugale", "Biography");
		library.addBook("Fly", "Super Flyer", "History");
		
		library.searchBookByTitle("Fly");
		System.out.println("------");
		library.displayByGenre("Biography");
		
		System.err.println("-------------------------------------");
		
		
		
	}

}
