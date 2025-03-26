package Lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PotentialEnergyOfWater {
    public static void main(String[] args) {
        // Створення вікна
        JFrame frame = new JFrame("Розрахунок потенціальної енергії");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Мітки і поля введення
        JLabel volumeLabel = new JLabel("Об'єм води V (м³):");
        volumeLabel.setBounds(20, 20, 150, 30);
        frame.add(volumeLabel);

        JTextField volumeField = new JTextField();
        volumeField.setBounds(180, 20, 180, 30);
        frame.add(volumeField);

        JLabel heightLabel = new JLabel("Висота h (м):");
        heightLabel.setBounds(20, 70, 150, 30);
        frame.add(heightLabel);

        JTextField heightField = new JTextField();
        heightField.setBounds(180, 70, 180, 30);
        frame.add(heightField);

        JButton calculateButton = new JButton("Розрахувати");
        calculateButton.setBounds(120, 120, 150, 30);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("W (Дж):");
        resultLabel.setBounds(20, 170, 300, 30);
        frame.add(resultLabel);

        // Обробка натискання кнопки
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double volume = Double.parseDouble(volumeField.getText());
                    double height = Double.parseDouble(heightField.getText());
                    double density = 1000; // Щільність води (кг/м³)
                    double gravity = 9.81; // Прискорення вільного падіння (м/с²)

                    double potentialEnergy = density * volume * gravity * height;

                    resultLabel.setText("W (Дж): " + potentialEnergy);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Помилка: перевірте введені дані!");
                }
            }
        });

        // Відображення вікна
        frame.setVisible(true);
    }
}