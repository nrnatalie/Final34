package Final33;

public class Main {

  public static void main(String[] args) {
    Soda lemonad = new Soda("malina");
    System.out.println(lemonad);
    System.out.println(lemonad.getFood());
    lemonad.setFood("clubnica");
    System.out.println(lemonad.getFood());
  }

}
//Final33.Soda@5f184fc6
//malina
//clubnica