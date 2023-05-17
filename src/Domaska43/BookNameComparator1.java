package Domaska43;

import java.util.Comparator;

public class BookNameComparator1 implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    String name1 = o1.getName().toLowerCase();
    String name2 = o2.getName().toLowerCase();
    return name1.compareTo(name2);
  }
}


