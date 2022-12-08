package com.example.Java.Web.App.repositories;

import com.example.Java.Web.App.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
