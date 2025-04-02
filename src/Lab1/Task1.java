package Lab1;

import java.util.Scanner;
public class Task1 {

    public void task1() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Введіть " + 10 + " чисел:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Сума: " + sum);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            min -= numbers[i];
        }
        System.out.println("Різниця: " + min);

        long mult = 1;
        for (int i : numbers) {
            mult *= i;
        }
        System.out.println("Добуток: " + mult);

        double div = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            div /= numbers[i];
        }
        System.out.println("Частка: "+ div);
    }
}