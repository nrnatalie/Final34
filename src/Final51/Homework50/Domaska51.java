package Final51.Homework50;
//Задача 1
//Найти минимальное чётное число в последовательности положительных чисел или вывести -1,
// если такого числа не существует.
//
//Оценить временную и пространственную сложность алгоритма.
//

import java.util.Random;

public class Domaska51 {

  public static void main(String[] args) {

    int[] array = new int[5];
    Random red = new Random();

    for (int i = 0; i < array.length; i++) { //On
      array[i] = red.nextInt(20); //O1
      System.out.println(array[i] + " ");//On

    }
    int min = array[0];
    for (int i = 0; i < array.length; i++) { //On
      if (min > array[i]) { //O1
        min = array[i];
      }


    }
    System.out.println();
    System.out.println("min:" + min);//On
  }
}

//7
//3
//2
//15
//10
//
//min:2

