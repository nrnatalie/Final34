package Final35;


public class Drink2 extends Food1 {

  public Drink2(String name) { //конструктор - служебное слово super
    super(name);
  }

  public void stillWater() { // создаем метод для воды скр
    System.out.println(getName() + "скр");
  }
}



