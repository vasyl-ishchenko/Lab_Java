package Lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        Task4_1 t4 = new Task4_1();
        Task4_2 t5 = new Task4_2();
        while(true) {
            Scanner inp = new Scanner(System.in);
            System.out.println("\nInput number of task: ");
            int select = inp.nextInt();
            switch (select) {
                case 1:
                    t1.task1();
                    break;
                case 2:
                    t2.task2();
                    break;
                case 3:
                    t3.task3();
                    break;
                case 4:
                    t4.task4_1();
                    break;
                case 5:
                    t5.task4_2();
                    break;
                default:
                    System.out.println("Програма завершена");
                    System.exit(0);
            }

        }

    }
}