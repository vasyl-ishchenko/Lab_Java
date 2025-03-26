package Lab4;

public class Task1 {
    public static void task1() {
        int evenNumbers[] = new int[50];
        int oddNumbers[] = new int[50];
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = i * 2;
            oddNumbers[i] = i * 2 + 1;
        }
        System.out.println("Парні числа:");
        for(int nums : evenNumbers){
            if(nums%20 == 0){
                System.out.println();
            }
            System.out.printf("%02d ", nums);
        }
        System.out.println("\n\nНепарні числа:");
        for(int nums : oddNumbers){
            int a = nums;
            if((a % 20) == 1){
                System.out.println();
            }
            System.out.printf("%02d ", nums);
        }
        System.out.println();
    }
}