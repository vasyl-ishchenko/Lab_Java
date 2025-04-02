package Lab2;

import java.util.Scanner;

public class Task4_2 {
    public void task4_2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть номер дня тижня (1 - понеділок, ..., 7 - неділя): ");
        int day = input.nextInt();

        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Це робочий день.");
                break;
            case 6: case 7:
                System.out.println("Це вихідний день.");
                break;
            default:
                System.out.println("Неправильний номер дня тижня.");
                break;
        }
    }
}
