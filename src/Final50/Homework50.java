package Final50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    //Задача 3
//Прочитать с клавиатуры сначала количество записей в телефонной книге,
// а затем сами записи (номер телефона и имя).
//
//Сохранить эти записи в словаре (телефон (строка) - имя (строка)).
//
//Спросить имя для удаления.
//
//Удалить из словаря все телефоны, имя для которых совпадает с указанным.
//
//Вывести получившийся словарь.

    Map<String, String> persons = new HashMap<>();

    persons.put("11111", " Даша");
    persons.put("22222", " Лена");
    persons.put("33333", " Оля");
    persons.put("44444", " Рита");
    persons.put("55555", " Света");
    System.out.println(persons);
    System.out.println(persons.get("22222" + "Вы хотели бы удалить?"));
    System.out.println(persons.remove("22222"));
    System.out.println(persons.values());
//5
//1
//2
//3
//4
//5
//{44444= Рита, 33333= Оля, 55555= Света, 11111= Даша, 22222= Лена}
// Лена
// Лена
//[ Рита,  Оля,  Света,  Даша]

  }


}


