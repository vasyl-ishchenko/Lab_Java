package Lab6;

import java.util.Scanner;

public class StudentGroup {
    private String groupName;
    private int totalStudents;
    private int maleStudents;
    private int femaleStudents;

    // Метод для введення даних
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть найменування групи: ");
        this.groupName = scanner.nextLine();

        System.out.print("Введіть кількість студентів: ");
        this.totalStudents = scanner.nextInt();

        System.out.print("Введіть кількість чоловіків: ");
        this.maleStudents = scanner.nextInt();

        System.out.print("Введіть кількість жінок: ");
        this.femaleStudents = scanner.nextInt();

    }

    // Метод для виведення даних
    public void displayData() {
        System.out.println("Найменування групи: " + this.groupName);
        System.out.println("Кількість студентів: " + this.totalStudents);
        System.out.println("Кількість чоловіків: " + this.maleStudents);
        System.out.println("Кількість жінок: " + this.femaleStudents);
    }

    // Метод для обчислення відсотка складу чоловіків і жінок
    public void calculatePercentages() {
        double malePercentage = ((double) this.maleStudents / this.totalStudents) * 100;
        double femalePercentage = ((double) this.femaleStudents / this.totalStudents) * 100;

        System.out.printf("Відсоток чоловіків: %.2f%%\n", malePercentage);
        System.out.printf("Відсоток жінок: %.2f%%\n", femalePercentage);
    }
}
