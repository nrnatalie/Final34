package Final37;

import Homework.Human;


public class Man extends Human {

  public Man(String name) {
    super(name);
  }

  @Override
  public void welcomeHuman() {
    System.out.println("Мужчина по имени..." + getName());
  }

}



