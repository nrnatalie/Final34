package Superman;

//Задача 1
//Напишите интерфейсы "Умеет летать" CanFly с методом fly(), "Умеет бегать" CanRun с методом
// run и "умеет плавать" CanSwim с методом swim и реализуйте их в классе "Супермен" Superman.
//
//Задача 2
//Реализуйте соответствующие интерфейсы из предыдущей задачи в классах "Человек", "Утка",
// "Пингвин" и "Самолёт".
public class Main {

  public static void main(String[] args) {
    CanSwim swim = new CanSwim("Утка");
    swim.Swim();
    // swim.showSuperman();
    CanRun run = new CanRun("Пингвин");
    run.Run();
    // run.showSuperman();
    CanFly fly = new CanFly("Самолёт");
    fly.Fly();
    //fly.showSuperman();
  }

}
//Утка:Умеет плавать
//Пингвин: Умеет бегать
//Самолёт:Умеет летать