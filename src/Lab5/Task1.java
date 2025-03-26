package Lab5;

import java.util.Scanner;
public class Task1 {
    public static void task1() {
        Scanner inp = new Scanner(System.in);
        System.out.print("\nВведіть довжину сторони квадрата: ");
        int sideLength = inp.nextInt();
        int area = sideLength * sideLength;
        System.out.print("Площа квадрата зі стороною " + sideLength + " дорівнює: " + area);
    }
}
