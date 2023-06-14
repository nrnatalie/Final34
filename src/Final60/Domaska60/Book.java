package Final60.Domaska60;
//Задача 1
//Используйте класс Book (книга) из домашнего задания к уроку 43 (см. Book.java).
//
//Создайте список книг и отсортируйте книги по названию, (при одинаковых названиях - по автору)
// при помощи лямбда-функции на месте компаратора.

public class Book {

  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public String toString() {
    return "Book{author='" + author + "', title='" + title + "', pages=" + pages + "}";
  }
}



