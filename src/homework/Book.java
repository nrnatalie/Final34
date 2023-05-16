package homework;


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

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", author='" + author + '\'' +
        ", amount=" + amount +
        '}';


  }

  @Override
  public int compareTo(Book oder) {
    //return this.amount - oder.amount;// для сравнения количества
    return author.compareTo(oder.author); // для сранения авторов
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Book oder)) {
      return false;
    }
    //return this.amount == oder.amount;// количество
    return author.equals(oder.author);
  }

  @Override
  public int hashCode() {
    //return amount; //количество
    return author.hashCode();
  }
}


