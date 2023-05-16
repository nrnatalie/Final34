package homework;


import Final38.Domaska.Book1;
import java.util.ArrayList;
import java.util.List;


public class Main1 {

  public static void main(String[] args) {
    Book1 book1 = new Book1("Чайка по имени Джонатан Ливингстон", " Ричард Бах");
    System.out.println(book1);
    Book1 book2 = new Book1("Война и мир", " Л.Н. Толстой");
    System.out.println(book2);
    Book1 book3 = new Book1("Кот в сапогах", "Шарль Перро");
    System.out.println(book3);
    Book1 book4 = new Book1("Детство", " Л.Н. Толстой");
    System.out.println(book4);
    Book1 book5 = new Book1("Кот в сапогах", " Л.Н. Толстой");
    System.out.println(book5);
    Book1 book6 = new Book1("Война и мир", " Л.Н. Толстой");
    System.out.println(book6);
    System.out.println("Сравниваем книги:");
    System.out.println(book1.equals(book2));
    System.out.println();

    System.out.println("Сравниваем автора:");
    System.out.println(book2.equals(book4));
    System.out.println();
    System.out.println("Сравниваем названия:");
    System.out.println(book3.equals(book5));
    System.out.println();
    System.out.println("Сравниваем автора:");
    System.out.println(book2.equals(book6));
    System.out.println();

    // if (book1.equals(book2) && book2.equals(book3) && book3.equals(book1)) {
    // System.out.println(" Книги совпадают:");
    //} else {
    //System.out.println(" Книги не совпадают:");

  }

  List<Book> books = new ArrayList<>();


}
//Книга: Чайка по имени Джонатан Ливингстон, Автор:  Ричард Бах
// Книга: Война и мир, Автор:  Л.Н. Толстой
// Книга: Кот в сапогах, Автор: Шарль Перро
// Книга: Детство, Автор:  Л.Н. Толстой
// Книга: Кот в сапогах, Автор:  Л.Н. Толстой
// Книга: Война и мир, Автор:  Л.Н. Толстой
//Сравниваем книги:
//false
//
//Сравниваем автора:
//false
//
//Сравниваем названия:
//false
//
//Сравниваем автора:
//true