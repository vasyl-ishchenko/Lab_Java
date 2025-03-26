package Lab5;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        Task4 t4 = new Task4();
        while(true) {
            Scanner inp = new Scanner(System.in);
            System.out.print("\n\nInput number of task: ");
            int select = inp.nextInt();
            switch (select) {
                case 1:
                    t1.task1();
                    break;
                case 2:
                    int a = 2;
                    int b = 5;
                    int c = 8;
                    t2.task2(a,b,c);
                    break;
                case 3:
                    int[] array = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
                    t3.task3(array);
                    break;
                case 4:
                    int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
                    t4.task4(arr);
                    break;
                default:
                    System.out.println("Програма завершена");
                    System.exit(0);
            }

        }

    }
}