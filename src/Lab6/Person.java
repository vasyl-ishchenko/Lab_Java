package Lab6;

//Task 1
public class Person {
    // Поля
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Невідомий";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається.");
    }

    public void talk() {
        System.out.println(fullName + " говорить.");
    }
}

