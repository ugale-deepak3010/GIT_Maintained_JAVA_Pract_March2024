package com.bookPackage.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookPackage.Model.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);

}
