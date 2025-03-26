package Lab4;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        Task4 t4 = new Task4();
        while(true) {
            Scanner inp = new Scanner(System.in);
            System.out.println("\n\nInput number of task: ");
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
                    t4.task4();
                    break;
                default:
                    System.out.println("Програма завершена");
                    System.exit(0);
            }

        }

    }
}