package Lab1;
import java.util.Scanner;
public class Task2 {
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть строку: ");
        String txt = scanner.nextLine();
        System.out.println(txt);
    }
}

//import java.util.Scanner;
//public class Task2 {
//    public static void task2() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ВВедіть числа");
//        int i = 0;
//        int[] numbers = new int[1];
//        int sum = 0;
//        int min = 0;
//        int mult = 1;
//        float div = 1;
//        scanner.useDelimiter(",");
//
//        while (scanner.hasNextInt()) {
//            System.out.printf("id = %d\n",i);
//            numbers. += scanner.nextInt();
//            i++;
//        }
//
//        for (int num : numbers) {
//            sum += num;
//            min -= num;
//            mult = mult *  num;
//            div = div / num;
//            System.out.println(num);
//        }
//        System.out.printf("sum = %d\n min = %d\n mult = %d\n div = %.2f\n",sum,min,mult,div);
//
//    }
//}
