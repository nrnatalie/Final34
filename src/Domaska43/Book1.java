package Domaska43;

public class Book1 {

  public class Book implements Comparable<Final42.homework.Book> {

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
    public int compareTo(Final42.homework.Book oder) {
      if (!author.equals(oder.getAuthor())) {

      }
      //return this.amount - oder.amount;// для сравнения количества.
      return name.compareTo(oder.getName()); // для сранения авторов
    }


    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Final42.homework.Book oder)) {
        return false;
      }
      //return this.amount == oder.amount;// количество
      return author.equals(oder.getAuthor());
    }

    @Override
    public int hashCode() {
      //return amount; //количество
      return author.hashCode();
    }
  }

}
