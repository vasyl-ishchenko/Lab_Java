package Lab8;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        String[] arg = {"Name","1","10"};
        Task2 t2 = new Task2();
        String[] arg2 = {"Name"};

        while(true) {
            Scanner inp = new Scanner(System.in);
            System.out.println("\nInput number of task: ");
            int select = inp.nextInt();
            switch (select) {
                case 1:
                    t1.task1(arg);
                    break;
                case 2:
                    t2.task2(arg2);
                    break;

                default:
                    System.out.println("Програма завершена");
                    System.exit(0);
            }

        }

    }
}