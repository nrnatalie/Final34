package Superman;

public class CanFly implements Superman {

  public String color;

  public CanFly(String color) {
    this.color = color;
  }

  public void Fly() {
    System.out.println("Самолёт:" + "Умеет летать");
  }

  @Override
  public void showSuperman() {
    System.out.println("Color" + this.color);
  }
}
