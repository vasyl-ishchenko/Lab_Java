package Lab2;

import java.util.Scanner;

public class Task2 {
    public void task2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть координату x: ");
        double x = input.nextDouble();

        System.out.print("Введіть координату y: ");
        double y = input.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в I квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в II квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в III квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в IV квадранті.");
        } else {
            System.out.println("Точка лежить на осі координат.");
        }

    }
}
