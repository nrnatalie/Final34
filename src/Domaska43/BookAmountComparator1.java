package Domaska43;

import java.util.Comparator;

//Задача 2* (не обязательно)
//Создайте компаратор, который позволит сортировать книги по убыванию количества страниц,
// а при совпадающем объёме - по названиям ("по возрастанию", по алфавиту).
public class BookAmountComparator1 implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {

    return o1.getAmount() - o2.getAmount();
  }
}


