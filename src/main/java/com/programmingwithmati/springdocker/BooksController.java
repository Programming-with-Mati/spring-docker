package com.programmingwithmati.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

  private static final List<Book> BOOKS = List.of(
          new Book(1, "A Study in Scarlet", "Sir Arthur Conan Doyle"),
          new Book(2, "City of God", "Saint Augustine of Hippo"),
    new Book(3, "A Christmas Carol", "Charles Dickens")
          );

  @GetMapping
  public List<Book> getBooks() {
    return BOOKS;
  }
}
