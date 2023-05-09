package Final37;


public class Human {

  private String name;

  public Human(String name) {
    this.name = name;

  }

  public String getName() {
    return name;
  }

  public void setName() {
    this.name = name;
  }

  public void welcomeHuman() {  // метод приветствие
    System.out.println("Я родился! " + "Человек по имени..." + getName());

  }
}






