package Lab2;

import java.util.Scanner;

public class Task4_1 {
    public static void task4_1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = input.nextDouble();

        double result;

        if (x < -2) {
            result = Math.exp(2 * x);
        } else if (x >= -2 && x <= 5) {
            result = 1 / Math.tan(x);
        } else {
            result = Math.pow(x, 4);
        }

        System.out.println("f(x) = " + result);
    }
}
