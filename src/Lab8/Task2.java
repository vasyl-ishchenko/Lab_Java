package Lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void task2(String[] args) {
        if (args.length < 1) {
            System.out.println("Введіть ім'я файлу як параметр.");
            return;
        }

        String fileName = args[0];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Числа у файлі:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу: " + e.getMessage());
        }
    }
}
