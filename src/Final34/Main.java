package Final34;

public class Main {

  public static void main(String[] args) {
    Triangle1 triangle = new Triangle1(3, 3, 8);
    System.out.println(triangle);
    System.out.println(triangle.getA() + " :" + triangle.getB());

    System.out.println(triangle.getB() + ": " + triangle.getA());
    System.out.println(triangle.getC() + ":" + triangle.getC());

  }

}
//Exception in thread "main" java.lang.IllegalArgumentException: Ошибка 338
//	at Final34.Triangle1.checkSides(Triangle1.java:50)
//	at Final34.Triangle1.<init>(Triangle1.java:43)
//	at Final34.Main.main(Main.java:6)


