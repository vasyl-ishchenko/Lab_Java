package Lab1;//Task 5
import java.util.Scanner;
public class Task5 {
    public void task5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = in.nextInt();
        int r_number = 0;
        while (number != 0){
            int dig = number%10;
            r_number = r_number*10+dig;
            number /= 10;
        }
        System.out.printf("number: %d\n",r_number);
    }
}