package homework;

public class Book {

  //Задача 1
//Создайте класс Book (книга), в конструктор которого передавайте автора, название
// книги и количество страниц.
//
//Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
// а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").
  public class Book implements Comparable<Book> {

    private final String name;
    private final String author;
    private final int amount;

    public Book(String name, String author, int amount) {
      this.name = name;
      this.author = author;
      this.amount = amount;

    }

    public String getName() {
      return name;
    }

    public String getAuthor() {
      return author;
    }

    public int getAmount() {
      return amount;
    }


  }
