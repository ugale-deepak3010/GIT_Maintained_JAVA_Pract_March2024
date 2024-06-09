package com.StudentJPA;

import org.springframework.data.repository.CrudRepository;



public interface StudentRepo extends CrudRepository<Student, Long> {

}
