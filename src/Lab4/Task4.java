package Lab4;

public class Task4 {
    public static void task4() {
        int[] numArray = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 != 0) {
                numArray[i] = -numArray[i];
            }
        }
        System.out.println("Масив зі зміненими знаками непарних елементів:");
        for (int num : numArray) {
            System.out.print(num + " ");
        }
    }
}
