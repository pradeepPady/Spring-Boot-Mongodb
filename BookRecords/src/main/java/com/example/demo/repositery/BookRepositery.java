package com.example.demo.repositery;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;
@Repository
public interface BookRepositery extends MongoRepository<Book, String>{
Optional<Book> findById(String id);
List<Book>findByAuthorsContains(String authr);
List<Book>findByCategories(String ctegary);
}