package Final50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework50 {


  //Задача 2
//Прочитать с клавиатуры сначала количество целых чисел, а затем сами числа.
//
//Сохранить эти числа в множестве.
//
//Удалить из множества все нечётные числа.
//
//Вывести получившееся множество.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      numbers.add(scanner.nextInt());
    }
    // Set<Integer> toRemove = new HashSet<>();
    //for (int elem : numbers) {
    // if (elem % 2 == 0) {
    // toRemove.add(elem);
    // }
    // }
    //numbers.removeAll(toRemove);
    // System.out.println(toRemove);
    // }

    //10
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//[2, 4, 6, 8, 10]
//-------------------------------

  }
}
