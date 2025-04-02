package Lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task1 {
    public void task1(String[] args) {
        if (args.length < 3) {
            System.out.println("Введіть три параметри: ім'я файлу, нижню межу діапазону і верхню межу діапазону.");
            return;
        }

        String fileName = args[0];
        int lowerBound = Integer.parseInt(args[1]);
        int upperBound = Integer.parseInt(args[2]);

        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) { // Задайте кількість чисел (тут 10)
                int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                fileWriter.write(randomNumber + "\n");
            }
            System.out.println("Числа успішно записані у файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
        }
    }
}
