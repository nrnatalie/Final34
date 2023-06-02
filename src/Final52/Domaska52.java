package Final52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Задача 1
//Напишите метод для поиска числа в заранее отсортированном по убыванию списке различных целых чисел.
//
//Метод должен вернуть индекс, если элемент найден, и -1, если элемент не найден.
//
//Используйте в качестве образца задачу 2 из классной работы.


public class Domaska52 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = readSortedList(scanner);
    System.out.println("Введите элемент для поиска:");
    int x = scanner.nextInt();
    int i = indexOf(numbers, x);
    System.out.println("indexOf( " + numbers + ", " + x + "," + i);
  }

  private static List<Integer> readList(Scanner scanner) {
    List<Integer> result = new ArrayList<>();
    System.out.println("Введите размер списка:");
    int size = scanner.nextInt();
    System.out.println("Введите элементы списка:");
    for (int i = 0; i < size; ++i) {
      result.add(scanner.nextInt());
    }
    scanner.nextLine();
    return result;

  }

  private static List<Integer> readSortedList(Scanner scanner) {
    List<Integer> result = readList(scanner);//прочитали
    Collections.sort(result);//отсортировали
    return result;//вернули
  }
}


