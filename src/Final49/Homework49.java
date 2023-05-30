package Final49;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework49 {

  public class Main {

    public static void main(String[] args) {
//Задача 1
//Прочитать с клавиатуры сначала количество чисел, а затем сами числа.
//
//Сохранить эти числа в списке.
//
//Удалить из списка все чётные числа.
//
//Вывести получившийся список.
//

      Scanner scanner = new Scanner(System.in);
      System.out.print("Введите количество чисел: ");
      int number = scanner.nextInt();
      scanner.nextLine();
      System.out.println(number);

      List<Integer> numbers = new ArrayList<>();
      for (int i = 0; i <= 10; i++) {
        numbers.add(i);


      }
      System.out.println(numbers);
      for (Integer num : numbers) {
        if (num % 3 == 0) {
          System.out.print(num);
        } else {
          System.out.println();
        }
      }

    }
  }
}
