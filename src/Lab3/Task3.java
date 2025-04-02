package Lab3;

public class Task3 {
    public void task3() {
        int h = 0;
        int m = 0;
        while (h <= 2) {
            while (m < 60) {
                System.out.println(h + " h " + m + " min");
                m++;
            }
            m = 0;
            h++;
        }
    }
}
