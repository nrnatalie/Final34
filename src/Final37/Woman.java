package Final37;


public class Woman extends Human {

  public Woman(String name) {
    super(name);
  }

  @Override
  public void welcomeHuman() {
    System.out.println("Я родилась! " + "Женщина по имени..." + getName());
  }

}


