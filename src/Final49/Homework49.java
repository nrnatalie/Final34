package Final49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Homework49 {


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
    //Задача 2
//Прочитать с клавиатуры сначала количество чисел, а затем сами числа.
//
//Сохранить эти числа в множестве.
//
//Удалить из множества все нечётные числа.
//
//Вывести получившееся множество.
//

    Set<Integer> numb = new HashSet<>();
    System.out.print("Введите количество чисел: ");
    int number1 = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i <= 20; i++) {
      numb.add(i);

    }
    for (Integer res : numb) {
      if (res % 2 == 0) {
        System.out.print(res);
      } else {
        System.out.println();
      }
    }
    System.out.println();

    //Задача 3
//Прочитать с клавиатуры сначала количество записей в телефонной книге, а затем сами записи (номер телефона и имя).
//
//Сохранить эти записи в словаре (телефон (строка) - имя (строка)).
//
//Спросить имя для удаления.
//
//Удалить из словаря все телефоны, имя для которых совпадает с указанным.
//
//Вывести получившийся словарь.
    System.out.print("Введите количество записей:");
    int number2 = scanner.nextInt();
    scanner.nextLine();
    System.out.println(number2);

    Map<String, String> persons = new HashMap<>();

    persons.put("22222", "1.leonid");
    persons.put("33333", "2.Jora");
    persons.put("44444", "3.Sveta");
    persons.put("55555", "4.Voldemar");
    persons.put("11111", "5.Leonid");

    System.out.println(persons);
    System.out.println("Количество:" + persons.size());
    System.out.println("Вы хотели бы удалить? "
        +
        persons.remove("22222") + " и " + persons.remove("11111"));
    System.out.println("Итого всего осталось количество:" + persons.size());
    System.out.println(persons.values());
    System.out.println();

    //  2 способ
    Map<String, String> persons2 = new HashMap<>();

    persons2.put("22222: ", "leonid");
    persons2.put("33333: ", "Jora");
    persons2.put("44444: ", "Sveta");
    persons2.put("55555: ", "Voldemar");
    persons2.put("11111: ", "Leonid");
    System.out.println(persons2);

    for (
        Entry<String, String> pair : persons2.entrySet()) {
      System.out.println(pair.getKey() + pair.getValue());
      String key = pair.getKey();
      String value = pair.getValue();
      if (pair.getValue().equals("22222")) {
        persons2.get(pair.getKey());
        System.out.println(key + value);
      }


    }
  }
}

//Введите количество чисел: 10
//10
//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//0
//
//3
//
//6
//
//9
//Введите количество чисел: 20
//0
//2
//4
//6
//8
//10
//12
//14
//16
//18
//20
//Введите количество записей:5
//5
//{44444=3.Sveta, 33333=2.Jora, 55555=4.Voldemar, 11111=5.Leonid, 22222=1.leonid}
//Количество:5
//Вы хотели бы удалить? 1.leonid и 5.Leonid
//Итого всего осталось количество:3
//[3.Sveta, 2.Jora, 4.Voldemar]
//
//{33333: =Jora, 55555: =Voldemar, 22222: =leonid, 44444: =Sveta, 11111: =Leonid}
//33333: Jora
//55555: Voldemar
//22222: leonid
//44444: Sveta
//11111: Leonid
