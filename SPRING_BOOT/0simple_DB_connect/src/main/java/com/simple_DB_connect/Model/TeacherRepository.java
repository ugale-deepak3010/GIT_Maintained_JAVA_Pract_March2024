package com.simple_DB_connect.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( collectionResourceRel = "Teacher", path = "teacher" )
public interface TeacherRepository extends CrudRepository<Teacher, Long> {

}
