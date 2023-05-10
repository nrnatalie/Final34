package Homework38;

import Domaska.Book1;

public class Book {

  private String name;
  private String author;

  public Book(String name, String author) {
    this.name = name;
    this.author = author;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public void setName(String name, String author) {
    this.name = name;
    this.author = author;
  }

  @Override
  public String toString() {
    return " Книга: " + name + "," + " Автор: " + author;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book1 book1)) {

      return false;
    }
    return name.equals(book1.getName()) && author.equals(book1.getAuthor());
    // if (!(obj instanceof Book1 book2)) {

    // return false; // то сразу возвращаем false
    // }
    // return name.equals(book2.getName()) && author.equals(book2.getAuthor());

    //if (!(obj instanceof Book1 book3)) {

    // return false;
    // }
    // return name.equals(book3.getName()) && author.equals(book3.getAuthor());*

  }
}
