package Lab3;

public class Task1 {
    public static void task1() {
        String phrase = "Привіт, світ!";

        System.out.println("\nFOR\n");

        for (int i = 1; i <= 50; i++) {
            System.out.printf("%s\t", phrase);
            if(i%5 == 0){
                System.out.println();
            }
        }

        System.out.println("\nWHILE\n");

        int i = 1;
        while (i <= 50) {
            System.out.printf("%s\t", phrase);
            if(i%5 == 0){
                System.out.println();
            }
            i++;
        }
    }
}
