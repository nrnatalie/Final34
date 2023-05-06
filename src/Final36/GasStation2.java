package Final36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GasStation2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("=== Заправочная станция ===");

    System.out.println("Добро пожаловать! Как вас зовут?");
    String name = br.readLine();
    System.out.println("Сколько литров топлива вам нужно?");
    double quantity = Double.parseDouble(br.readLine());
    System.out.println("=== Ваш заказ ===");
    System.out.println("Заказчик: " + name);
    System.out.println("Количество топлива: " + quantity + " л");
    double total = quantity * 2;
    System.out.println("Стоимость заказа: " + total + " EUR");

  }

}
