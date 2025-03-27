package Lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int select = 1;
        task1 t1 = new task1();
        task2 t2 = new task2();
        task3 t3 = new task3();
        task4 t4 = new task4();
        task5 t5 = new task5();

        while(select != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nInput number of task: ");
            select = input.nextInt();
            
        switch (select) {
            case 1:
                t1.task();
                break;
            case 2:
                t2.task();
                break;
            case 3:
                t3.task();
                break;
            case 4:
                t4.task();
                break;
            case 5:
                t5.task();
                break;
            default:
                System.out.println("Програма завершена");
                System.exit(0);
            }

        }

    }
}