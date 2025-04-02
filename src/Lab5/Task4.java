package Lab5;

public class Task4 {
    public void task4(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Найбільше число в масиві: " + max);
    }
}
