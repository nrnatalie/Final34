package Domaska39;

import Final39.Homework38.Domaska.House1;

public class PrivateHouse {

  public class PrivateHouse1 extends House1 {

    public PrivateHouse1(String address) { // частный дом
      super(address);
    }

    @Override
    public String toString() {
      return "Вы снесли частный дом: " + getAddress();
    }

    @Override
    public void House() {
      System.out.println();
    }

    @Override
    public void Demolish() {
    }
  }

}

