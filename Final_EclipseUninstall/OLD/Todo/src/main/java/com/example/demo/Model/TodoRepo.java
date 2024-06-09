package com.example.demo.Model;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepo extends JpaRepository<TodoModel, Long> {

}
