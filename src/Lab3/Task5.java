package Lab3;

import java.util.Scanner;

public class Task5 {
    public void task5_1() {
        System.out.println("\nЗавдання 5 за допомогою циклу FOR\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть нижню границю діапазону: ");
        double lowerBound = input.nextDouble();

        System.out.print("Введіть верхню границю діапазону: ");
        double upperBound = input.nextDouble();

        int count = 0;
        for (double x = 1; x <= 3; x += 0.1) {
            double f = 1 - x + Math.sin(x) - Math.cos(1 + x);
            if (f >= lowerBound && f <= upperBound) {
                System.out.printf("f(%.2f) = %.4f\n",x,f);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Значення функцій не знаходяться в заданому діапазоні.");
        } else {
            System.out.println("Кількість значень функцій у заданому діапазоні: " + count);
        }

    }
    public void task5_2() {
        System.out.println("\nЗавдання 5 за допомогою циклу WHILE\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть нижню границю діапазону: ");
        double lowerBound = input.nextDouble();

        System.out.print("Введіть верхню границю діапазону: ");
        double upperBound = input.nextDouble();

        int count = 0;
        double x = 1;
        while (x <= 3) {
            double f = 1 - x + Math.sin(x) - Math.cos(1 + x);
            if (f >= lowerBound && f <= upperBound) {
                System.out.printf("f(%.2f) = %.4f\n",x,f);
                count++;
            }
            x += 0.1;
        }

        if (count == 0) {
            System.out.println("Значення функцій не знаходяться в заданому діапазоні.");
        } else {
            System.out.println("Кількість значень функцій у заданому діапазоні: " + count);
        }

    }
}
