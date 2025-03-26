package Lab6;

// Абстрактний клас Car
abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;

    // Конструктор
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // Звичайний метод gas()
    public void gas() {
        System.out.println("Газуємо!");
    }
    // Абстрактний метод brake()
    public abstract void brake();
    // Методи для отримання полів
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}

// Клас Sedan, наслідує Car
class Sedan extends Car {

    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }
    @Override
    public void gas(){
        System.out.println("Седан газує!");
    }

    @Override
    public void brake() {
        System.out.println("Седан гальмує!");
    }
}

// Клас Truck, наслідує Car
class Truck extends Car {

    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }
    @Override
    public void gas() {
        System.out.println("Грузовик газує!");
    }
    @Override
    public void brake() {
        System.out.println("Грузовик гальмує!");
    }
}