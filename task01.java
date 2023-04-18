import java.util.Scanner;

/* Задание №1
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

public class task01 {

  public static Integer inputNumber() { // функция обрабатывающая ошибку ввода пользователем (если введено не число)
    Scanner scanner = new Scanner(System.in, "866");

    while (true) {
      System.out.print("Введите положительное число для расчета суммы и произведения:  ");
      try {
        int inputNumber = Integer.parseInt(scanner.nextLine());
        scanner.close();
        return inputNumber;
      }

      catch (Exception e) {
        System.out.print("Введено неверное число или не число!\n");
      }
    }
  }

  public static void main(String[] args) {
    int number = inputNumber();
    int sum = 0;
    int mult = 1;
    if (number > 0) {
      for (int i = 1; i <= number; i++) {
        sum += i;
        mult *= i;
      }
      System.out.printf("Сумма треугольного числа %d равна %d \n", number, sum);
      System.out.printf("Произведение (факториал) числа %d равен %d \n", number, mult);
    } else if (number == 0) {
      System.out.printf("Сумма треугольного числа %d равна %d \n", number, sum);
      System.out.printf("Факториал числа %d по определению равен %d \n", number, mult);
    } else {
      System.out.print("Расчет с отрицательными числами не предусмотрен условием задачи\n");
    }
  }
}