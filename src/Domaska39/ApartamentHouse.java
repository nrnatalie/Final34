package Domaska39;

import Final39.Homework38.Domaska.House1;

public class ApartamentHouse {

  public class ApartamentHouse1 extends House1 {

    private ApartamentHouse1(String address) { // многоквартирный дом
      super(address);
    }
    // При создании многоквартирного дома дополнительно принимайте в конструкторе
// целое число - количество подъездов.

    private int amount;
    private int entrances;

    public ApartamentHouse1(String address, int amount, int entrances) {
      super(address);
      this.amount = amount;
      this.entrances = entrances;

    }

    public int getAmount() {
      return amount;
    }

    public int getEntrances() {
      return entrances;
    }

    public void setAmount(int amount) {
      this.amount = amount;

    }

    public void setEntrances(int entrances) {
      this.entrances = entrances;
    }

    @Override
    public String toString() {
      return "Вы снесли многоквартирный дом:" + getAddress() + getEntrances() + getAmount();
    }

  }
}
