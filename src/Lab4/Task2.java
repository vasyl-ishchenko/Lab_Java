package Lab4;

public class Task2 {
    public void task2() {
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("\nПеребір циклом while");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println("\nПеребір циклом for");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println("\nПеребір циклом while та вивід чисел з непарним індексом");
        i = 0;
        while (i < arr.length) {
            if (i % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
            i++;
        }
        System.out.println("\nПеребір циклом for та вивід чисел з парним індексом");
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.print(arr[j]+" ");
            }
        }
        System.out.println("\nВивід масиву в зворотньому порядку");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]+" ");
        }
}
}
