package Lab4;

public class Task3 {
    public static void task3() {
        double[] array = {2.5, 3.1, 7.8, 1.2, 9.0};
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        System.out.println("Сума елементів масиву: " + sum);
    }
}
