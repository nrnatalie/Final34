package Final34;
//Задача 1
//Создайте класс Triangle (треугольник), принимающий три целых значения -
// длины трёх сторон треугольника.

//В конструкторе нужно проверить введённые значения на корректность
// (например, длины не могут быть отрицательными).

//В классе должен быть описан отдельный статический
// метод public static boolean checkSides(int a, int b, int c),
// который должен проверить неравенство треугольника.

//Этот метод необходимо использовать в конструкторе.

//При провале любой из проверок нужно вывести на экран соответствующее сообщение
// или выкинуть исключение.
public class Triangle {

  private final int a;
  private final int b;   // atribut

  private final int c;

  public Triangle(int a, int b, int c, int a1, int b1, int c1) throws IllegalArgumentException {
    this.a = a; // 2-задали конструктор
    this.b = b;
    this.c = c;

    if ((a < 0) || (b < 0) || (c < 0)) {
      throw new IllegalArgumentException("Длина не может быть отрицательной");

    }
  }
}
