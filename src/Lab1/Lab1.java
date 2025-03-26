package Lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int select = 1;
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        Task4 t4 = new Task4();
        Task5 t5 = new Task5();

        while(select != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nInput number of task: ");
            select = input.nextInt();
            
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
            case 5:
                t5.task5();
                break;
            default:
                System.out.println("Програма завершена");
                System.exit(0);
            }

        }

    }
}