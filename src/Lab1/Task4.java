package Lab1;

//Task 4
class car {
    int horsepower; // Кінські сили
    double engineVolume; // Об'єм двигуна
    String model;
    String color;
    int year;
    String manufacturer;
    double weight;

    car(int horsepower, double engineVolume, String model, String color, int year, String manufacturer, double weight) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.model = model;
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
}

public class task4 {
    public void task() {
        car[] cars = new car[10];

        cars[0] = new car(150, 2.0, "Model S", "Red", 2022, "Tesla", 2000);
        cars[1] = new car(200, 3.0, "Mustang", "Blue", 2021, "Ford", 1800);
        cars[2] = new car(180, 2.5, "Civic", "White", 2020, "Honda", 1600);
        cars[3] = new car(220, 3.2, "Camaro", "Black", 2019, "Chevrolet", 1700);
        cars[4] = new car(160, 2.2, "Accord", "Gray", 2018, "Honda", 1500);
        cars[5] = new car(190, 2.8, "Charger", "Green", 2017, "Dodge", 1900);
        cars[6] = new car(210, 3.1, "Altima", "Yellow", 2016, "Nissan", 1400);
        cars[7] = new car(175, 2.6, "Fusion", "Brown", 2015, "Ford", 1600);
        cars[8] = new car(165, 2.3, "Sonata", "Purple", 2014, "Hyundai", 1500);
        cars[9] = new car(205, 3.0, "Optima", "Orange", 2013, "Kia", 1700);

        double totalEngineVolume = 0;
        int totalHorsepower = 0;

        for (car car : cars) {
            totalEngineVolume += car.engineVolume;
            totalHorsepower += car.horsepower;
        }

        System.out.printf("Total Engine Volume: %.1f\n", totalEngineVolume);
        System.out.printf("Total Horsepower: %d\n",totalHorsepower);
    }
}