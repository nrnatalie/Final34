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
  public boolean equals(Object obj) { // метод equals переопределяет сравнение обьектов
    if (this == obj) { // сравнивает обьект сам с собой
      return true;
    }
    if (!(obj instanceof Book1 book1)) {
      // если вдруг// наш обьект не является book1
      return false; // то сразу возвращаем false
    }
    return name.equals(book1.getName()) && author.equals(book1.getAuthor());// у

  }
}
