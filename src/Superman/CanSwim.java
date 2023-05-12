package Superman;

public class CanSwim implements Superman {

  public String sleep;

  public CanSwim(String sleep) {
    this.sleep = sleep;
  }

  public void Swim() {
    System.out.println("Утка:" + "Умеет плавать");
  }

  @Override
  public void showSuperman() {
    System.out.println("sleep" + this.sleep);

  }
}
