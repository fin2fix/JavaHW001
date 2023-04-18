import java.util.Scanner;

/* Задание №3
 * Реализовать простой калькулятор
 */

public class task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "866");
        boolean flag = true;
        double number_1 = 0;
        double number_2 = 0;
       
        while (flag) {
            try {
                System.out.print("Введите первое число:   ");
                number_1 = Double.parseDouble(scanner.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println("Введено неверное число или не число. Повторите ввод! ");
            }
        }

        System.out.print("Введите действие (+) (-) (*) (/):   ");
        String str = scanner.nextLine().replace(" ", "");
        char action = str.charAt(0);

        flag = true;
        while (flag) {
            try {
                System.out.print("Введите второе число:   ");
                number_2 = Double.parseDouble(scanner.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println("Введено неверное число или не число. Повторите ввод! ");
            }
        }

        double result = 0;
        scanner.close();

        if (action == '+') {
            result = number_1 + number_2;
            System.out.printf("Ответ: %.3f \n", result);
        } else if (action == '-') {
            result = number_1 - number_2;
            System.out.printf("Ответ: %.3f \n", result);
        } else if (action == '*') {
            result = number_1 * number_2;
            System.out.printf("Ответ: %.3f \n", result);
        } else if (action == '/' && number_2 != 0) {
            result = number_1 / number_2;
            System.out.printf("Ответ: %.3f \n", result);
        } else
            System.out.println("Неверная операция!");
    }
}