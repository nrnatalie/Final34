package Domaska39;

import Final39.Homework38.Domaska.ApartamentHouse1;
import Final39.Homework38.Domaska.House1;
import Final39.Homework38.Domaska.PrivateHouse1;
import java.util.ArrayList;
import java.util.List;


public class Main {

  public static void main(String[] args) {
    House1 privateHouse = new PrivateHouse1("Студенческая");
    System.out.println(privateHouse);
    System.out.println();
    House1 apartamentHouse = new ApartamentHouse1("Комсомольская ", 34, 3);
    System.out.printf("Количество подъездов: %d", 3);
    System.out.println();

    List<House1> name = new ArrayList<>();
    name.add(privateHouse);
    name.add(apartamentHouse);
    System.out.println(name);

    for (House1 elite : name) {
      elite.House(); // перезапись


    }


  }

}
//Вы снесли частный дом: Студенческая
//
//Количество подъездов: 3
//[Вы снесли частный дом: Студенческая, Вы снесли многоквартирный дом:Комсомольская 334]


