package Final60.Domaska60;

import Final59.Pizza;
import java.util.ArrayList;
import java.util.List;

//Задача 1
//Создайте класс PizzaComparator, в котором сортируйте пиццы
// (см. класс Pizza из классной работы) следующим образом:
//
//по названию
//при одинаковых названиях - по размеру
//при одинаковых размерах - по наличию сырного борта (сначала без него, потом с ним)
public class Main {

  public static void main(String[] args) {
    List<Final59.Pizza> pizzas = new ArrayList<>();
    pizzas.add(new Final59.Pizza("Capricciosa", 24, 450, 7.5));
    pizzas.add(new Final59.Pizza("Diavola", 32, 750, 11.5));
    pizzas.add(new Final59.Pizza("Vesuvio", 28, 550, 9.5));
    for (Pizza pizza : pizzas) {
      System.out.println(pizza);
    }
    pizzas.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
    System.out.println("После сортировки:");
    System.out.println(pizzas);

    pizzas.sort((o1, o2) -> Integer.compare(o1.getDiameter(), o2.getDiameter()));
    System.out.println("После другой сортировки:");
    System.out.println(pizzas);

    pizzas.sort((o1, o2) -> Boolean.compare(o1.))
  }
}



