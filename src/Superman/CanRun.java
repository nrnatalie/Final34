package Superman;

public class CanRun implements Superman {

  public String heigt;

  public CanRun(String heigt) {
    this.heigt = heigt;
  }

  public void Run() {
    System.out.println("Пингвин:" + "Умеет бегать");

  }

  @Override
  public void showSuperman() {
    System.out.println("heigt" + this.heigt);

  }

}
