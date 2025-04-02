package Lab1;

//Task 4
class Car {
    int horsepower; // Кінські сили
    double engineVolume; // Об'єм двигуна
    String model;
    String color;
    int year;
    String manufacturer;
    double weight;

    Car(int horsepower, double engineVolume, String model, String color, int year, String manufacturer, double weight) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.model = model;
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
}

public class Task4 {
    public void task4() {
        Car[] cars = new Car[10];

        cars[0] = new Car(150, 2.0, "Model S", "Red", 2022, "Tesla", 2000);
        cars[1] = new Car(200, 3.0, "Mustang", "Blue", 2021, "Ford", 1800);
        cars[2] = new Car(180, 2.5, "Civic", "White", 2020, "Honda", 1600);
        cars[3] = new Car(220, 3.2, "Camaro", "Black", 2019, "Chevrolet", 1700);
        cars[4] = new Car(160, 2.2, "Accord", "Gray", 2018, "Honda", 1500);
        cars[5] = new Car(190, 2.8, "Charger", "Green", 2017, "Dodge", 1900);
        cars[6] = new Car(210, 3.1, "Altima", "Yellow", 2016, "Nissan", 1400);
        cars[7] = new Car(175, 2.6, "Fusion", "Brown", 2015, "Ford", 1600);
        cars[8] = new Car(165, 2.3, "Sonata", "Purple", 2014, "Hyundai", 1500);
        cars[9] = new Car(205, 3.0, "Optima", "Orange", 2013, "Kia", 1700);

        double totalEngineVolume = 0;
        int totalHorsepower = 0;

        for (Car car : cars) {
            totalEngineVolume += car.engineVolume;
            totalHorsepower += car.horsepower;
        }

        System.out.printf("Total Engine Volume: %.1f\n", totalEngineVolume);
        System.out.printf("Total Horsepower: %d\n",totalHorsepower);
    }
}