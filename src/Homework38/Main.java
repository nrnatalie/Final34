package Homework38;
//Задача 1
// Создайте класс Book (книга), в конструктор которого передавайте автора и название книги.

// Переопределите сравнение книг: книги должны считаться одинаковыми,
// если совпадают и название, и автор.

import Domaska.Book1;

public class Main {


  public static void main(String[] args) {
    Book1 book1 = new Book1("Чайка по имени Джонатан Ливингстон", " Ричард Бах");
    System.out.println(book1);
    Book1 book2 = new Book1("Война и мир", " Л.Н. Толстой");
    System.out.println(book2);
    Book1 book3 = new Book1("Кот в сапогах", "Шарль Перро");
    System.out.println(book3);
    if (book1.equals(book2) && book2.equals(book3) && book3.equals(book1)) {
      System.out.println(" Книги совпадают:");
    } else {
      System.out.println(" Книги не совпадают:");

    }


  }

}
//Книга: Чайка по имени Джонатан Ливингстон, Автор:  Ричард Бах
// Книга: Война и мир, Автор:  Л.Н. Толстой
// Книга: Кот в сапогах, Автор: Шарль Перро
// Книги не совпадают:

