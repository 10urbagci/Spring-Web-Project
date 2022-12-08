package com.example.Java.Web.App.repositories;

import com.example.Java.Web.App.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
