package springBootSecurityApp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springBootSecurityApp1.entity.Products;

public interface ProductsRepo extends JpaRepository<Products, Integer> {

}
