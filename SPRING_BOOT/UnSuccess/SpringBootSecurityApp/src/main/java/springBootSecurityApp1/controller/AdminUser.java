package springBootSecurityApp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springBootSecurityApp1.dto.RequestResponse;
import springBootSecurityApp1.entity.Products;
import springBootSecurityApp1.repository.ProductsRepo;

@RestController
public class AdminUser {

	@Autowired
	private ProductsRepo productsRepo;
	
	@GetMapping("/public/product")
	public ResponseEntity<Object> getAllProducts(){
		
		return ResponseEntity.ok(productsRepo.findAll());
	}
	
	@PostMapping("/admin/saveproduct")
	public ResponseEntity<Object> saveProduct(@RequestBody RequestResponse productRequest){
		
		Products product= new Products();
		product.setName(productRequest.getName());
		
		return ResponseEntity.ok(productsRepo.save(product));
	}
	
	@GetMapping("/user/alone")
	public ResponseEntity<Object> userAlone(){
		
		return ResponseEntity.ok("User Alone can only access this API.");
	}
	
	@GetMapping("/adminuser/both")
	public ResponseEntity<Object> bothAdminAndUserGetAPI(){
		
		return ResponseEntity.ok("Both Admin and User can access this API.");
	}
	
	
	
	
	
}


















