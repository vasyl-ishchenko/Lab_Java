package Lab2;

import java.util.Scanner;

public class Task3 {
    public static void task3() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = input.nextInt();

        if (number >= 10 && number <= 99) {
            if(number % 2 == 0){
                System.out.println("Число двозначне і парне.");}
            else {
                System.out.println("Число двозначне і непарне.");
            }
        } else {
            if(number % 2 == 0){
                System.out.println("Число не є двозначне і парне.");}
            else {
                System.out.println("Число не є двозначне і непарне.");
            }
        }
    }
}
