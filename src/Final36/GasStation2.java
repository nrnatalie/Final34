package Final36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GasStation2 {

  public static void main(String[] args) throws IOException {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== Заправочная станция ===");

    System.out.println("Добро пожаловать! Как вас зовут?");
    // String name = br.readLine();
    String name = scanner.nextLine();
    System.out.println("Сколько литров топлива вам нужно?");
    double quantity = 0.0;
    //double quantity = Double.parseDouble(br.readLine());
    while (!scanner.hasNextDouble()) {// пока всё плохо,
      String wrongLine = scanner.nextLine();

      // String wrongLine = br.readLine(); // пропустить строку
      System.out.println("Неправильный формат дробного числа: " + wrongLine);
      System.out.println("Введите количество топлива (в литрах):");
    }
    quantity = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Как будете оплачивать, картой или наличными?");
    String paymentMethod = scanner.nextLine();
    //String paymentMethod = br.readLine();
    boolean byCard = (paymentMethod.toLowerCase().contains("карт"));

    System.out.println("=== Ваш заказ ===");
    System.out.println("Заказчик: " + name);
    System.out.println("Количество топлива: " + quantity + " л");
    double total = quantity * 2;
    System.out.println("Стоимость заказа: " + total + " EUR");
    if (byCard) {
      System.out.println("Заказ должен быть оплачен картой");
    } else {
      System.out.println("Заказ должен быть оплачен наличными");
    }

  }

}


