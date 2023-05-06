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
    System.out.print("Введите количество заказов: ");
    while (!scanner.hasNextInt()) {
      String wrongLine = scanner.nextLine();
      System.out.println("Неправильный формат целого числа:" + wrongLine);
      System.out.print("Введите количество заказов: ");
    }
    int orders = scanner.nextInt();
    //int counter = 0; //у меня есть счетчик пока значение ноль  //1.вариант с while
    //while (counter < orders) {
    // for (командаПередЦиклом; условиеПовторения; командаПослеШага)
    for (int counter = 0; counter < orders; ++counter) {        //2. вариант c for
      // Order order = Order.readOrder(name, scanner);
      //order.print();

      System.out.println("Сколько литров топлива вам нужно?");
      //double quantity = 0.0;
      //double quantity = Double.parseDouble(br.readLine());
      while (!scanner.hasNextDouble()) {// пока всё плохо,
        String wrongLine = scanner.nextLine();

        // String wrongLine = br.readLine(); // пропустить строку
        System.out.println("Неправильный формат дробного числа: " + wrongLine);
        System.out.println("Введите количество топлива (в литрах):");
      }
      double quantity = scanner.nextDouble();
      scanner.nextLine();
      System.out.println("Как будете оплачивать, картой или наличными?");
      String paymentMethod = scanner.nextLine();
      //String paymentMethod = br.readLine();
      boolean byCard = (paymentMethod.toLowerCase().contains("карт"));// byCard называется флажок

      System.out.println("=== Ваш заказ ===");
      System.out.println("Заказчик: " + name);
      System.out.println("Количество топлива: " + quantity + " л");
      double total = quantity * 2;
      System.out.println("Стоимость заказа: " + total + " EUR");
      if (byCard) {   // и этот флажок мы всавляем сюда
        System.out.println("Заказ должен быть оплачен картой");
      } else {
        System.out.println("Заказ должен быть оплачен наличными");
      }
      //++counter; // это относилось к циклу while

    }


  }
}





