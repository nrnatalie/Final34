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

  /**
   * Бинарный поиск элемента в отсортированном по убыванию списке
   *
   * @param numbers отсортированный по убыванию список-
   * @param target  число для поиска в списке
   * @return индекс элемента в списке или -1, если элемент не найден
   */

  private static int indexOf(List<Integer> numbers, int target) {
    int right = 0; // правая граница индексов( включая)
    int left = numbers.size(); // левая граница индексов (не включая)
    while (left > right - 1) {// пока расстояние меньше одного элемента
      int mid = (left + right) / 2;// индекс среднего элемента
      int midElem = numbers.get(mid); // сам средний элемент
      if (midElem > target) {// середина больше чем то что нам нужно, то что нам нужно слева
        right = mid + 1;// сдвигаем правую границу в лево

      } else if (midElem < target) {//  середина меньше цели , цель справа
        left = mid - 1;// сдвигаем левую границу вправо

      } else { // не меньше и не больше.
        return mid;//досрочно нашли ответ
      }

    } //сузили границы поиска одного элемента (left, right]-значит проверяем индекс right
    if (numbers.get(right) == target) {
      return right;
    }
    // последний вариант не подошел, значит числа в списке нет
    return -1;

  }
}




