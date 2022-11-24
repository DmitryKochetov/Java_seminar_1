// Реализовать простой калькулятор (операции + - / * )

package DZ;

import java.util.Scanner;

public class dz3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите операцию: ");
        String op = scanner.nextLine();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();

        scanner.close();

        //проверяем какое действие было введено и проводим нужну. операцию

        if (op.equals("+")) {
            System.out.println("a + b = " + (a + b));
        }
        if (op.equals("-")) {
            System.out.println("a - b = " + (a - b));
        }
        if (op.equals("*")) {
            System.out.println("a * b = " + (a * b));
        }
        if (op.equals("/")) {
            System.out.println("a / b = " + (a / b));
        }

       
    }
}

