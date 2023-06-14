package Final60.Domaska60;

import Final43.homework42.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Пушкин", "Руслан и Людмила", 125));
    books.add(new Book("Пушкин", "Дубровский", 126));
    books.add(new Book("Лермонтов", "Мцыри", 127));
    System.out.println(books);
    Collections.sort(books);
    System.out.println(books);

    books.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
    System.out.println("После сортировки:");
    System.out.println(books);

    books.sort((o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
    System.out.println("После другой сортровки:");
    System.out.println(books);
  }
}

