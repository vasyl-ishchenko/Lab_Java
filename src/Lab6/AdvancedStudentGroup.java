package Lab6;

import java.util.Scanner;

class AdvancedStudentGroup extends StudentGroup {
    private double averageGrade;
    private String specialization;


    // Метод для введення додаткових даних
    public void inputAdditionalData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть середній бал студентів: ");
        this.averageGrade = scanner.nextDouble();
        scanner.nextLine(); // очищення сканера

        System.out.print("Введіть спеціалізацію групи: ");
        this.specialization = scanner.nextLine();
    }

    // Перевизначений метод для виведення даних
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Середній бал студентів: " + this.averageGrade);
        System.out.println("Спеціалізація групи: " + this.specialization);
    }

}
