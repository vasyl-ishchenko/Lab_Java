package Lab2;

import java.util.Scanner;

public class Task1 {
    public void task1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = input.nextDouble();
        if(a!=0){
        System.out.print("Введіть значення b: ");
        double b = input.nextDouble();

        System.out.print("Введіть значення c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корені рівняння: " + root1 + " і " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Корінь рівняння: " + root);
        } else {
            System.out.println("Рівняння не має дійсних коренів.");
        }
        }else{
            System.out.println("Це рівняння не є квадратним");
        }
    }
}
