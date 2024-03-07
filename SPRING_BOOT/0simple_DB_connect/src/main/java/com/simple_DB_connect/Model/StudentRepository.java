package com.simple_DB_connect.Model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

}
