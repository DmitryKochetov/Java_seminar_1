// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

//Не стал писать комментарии, код довольно простой

package DZ;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }

        System.out.println("Произведение чисел от 1 до n = " + fact);

    }
}
