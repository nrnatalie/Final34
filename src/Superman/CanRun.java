package Superman;

public class CanRun implements Superman {

  public int heigt;

  public CanRun(int heigt) {
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
