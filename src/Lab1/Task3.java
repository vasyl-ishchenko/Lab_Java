package Lab1;

//Task 3
class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
}
public class Task3 {
    public static void task3() {
        User[] users = new User[10];

        users[0] = new User(1, 42, "Ivan", "Ivanov", 70.5, 175.0);
        users[1] = new User(2, 25, "Petro", "Petrov", 80.0, 180.0);
        users[2] = new User(3, 50, "Oksana", "Oksanenko", 60.5, 165.0);
        users[3] = new User(4, 27, "Nadiia", "Nadiienko", 55.0, 160.0);
        users[4] = new User(5, 40, "Olena", "Olenivna", 68.0, 170.0);
        users[5] = new User(6, 35, "Taras", "Tarasenko", 85.0, 185.0);
        users[6] = new User(7, 29, "Dmytro", "Dmytrenko", 78.0, 175.0);
        users[7] = new User(8, 33, "Kateryna", "Katerynchuk", 62.0, 168.0);
        users[8] = new User(9, 18, "Andrii", "Andriienko", 90.0, 190.0);
        users[9] = new User(10,43, "Svitlana", "Svitlenko", 58.5, 162.0);

        int totalAge = 0;
        double totalWeight = 0;
        double totalHeight = 0;

        for (User user : users) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }

        System.out.printf("Total Age: %d\n", totalAge);
        System.out.printf("Total Weight: %.1f\n", totalWeight);
        System.out.printf("Total Height: %.1f\n", totalHeight);
    }
}