package Final60.Domaska60;

public class Pizza {

  public class Pizza {

    private final String title;
    private final int size;
    private final boolean cheesyBorder;


    public Pizza(String title, int size, boolean cheesyBorder) {
      this.title = title;
      this.size = size;
      this.cheesyBorder = cheesyBorder;
    }

    public String getTitle() {
      return title;
    }

    public int getSize() {
      return size;
    }

    public boolean isCheesyBorder() {
      return cheesyBorder;
    }

    @Override
    public String toString() {
      return "Pizza{" +
          "title='" + title + '\'' +
          ", size=" + size +
          ", cheesyBorder=" + cheesyBorder +
          '}';
    }
  }


}
