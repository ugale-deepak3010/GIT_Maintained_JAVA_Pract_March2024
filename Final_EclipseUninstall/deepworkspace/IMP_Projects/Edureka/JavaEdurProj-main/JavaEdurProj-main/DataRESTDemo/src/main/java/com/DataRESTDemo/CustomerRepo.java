package com.DataRESTDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Customers", path = "customers")

public interface CustomerRepo extends JpaRepository<Customers, Integer> {

}
