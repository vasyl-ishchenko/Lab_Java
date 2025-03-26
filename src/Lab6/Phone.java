package Lab6;

public class Phone {
    // Поля класу
    private String number;
    private String model;
    private double weight;

    // Конструктори
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone() {
        this.number = "Unknown";
        this.model = "Unknown";
        this.weight = 0;
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public String getNumber() {
        return this.number;
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + ", номер: " + callerNumber + "\n");
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Повідомлення надіслано на номери: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public void printInfo() {
        System.out.println("Number: " + this.number);
        System.out.println("Model: " + this.model);
        System.out.println("Weight: " + this.weight);
        System.out.println();
    }
}
