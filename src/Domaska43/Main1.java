package Domaska43;

import Final43.homework42.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Задача 1
// Используйте класс Book (книга)
//  из предыдущего домашнего задания.

//Создайте компаратор, который позволит сортировать книги по названию,
// при одинаковых названиях - по автору (и там, и там - по алфавиту)
public class Main1 {

  public static void main(String[] args) {

    List<Final43.homework42.Book> booki = new ArrayList<>();
    booki.add(new Final43.homework42.Book("Пушкин", "Дармоед", 100));
    booki.add(new Final43.homework42.Book("Пушкин", "Бродяга", 150));
    booki.add(new Book("Лермонтов", "Романтик", 200));

    Collections.sort(booki);// сортировка по алфавиту
    System.out.println(booki);

    // Comparator pagenesComparator = new BookAmountComparator();
    // Collections.sort(booki, pagenesComparator);// сортировать количество страниц
    //System.out.println(booki);

  }
}
//----------------output-----------
//[Book{author='Лермонтов', title='Романтик', pages=200}, Book{author='Пушкин',
// title='Бродяга', pages=150}, Book{author='Пушкин', title='Дармоед', pages=100}]



