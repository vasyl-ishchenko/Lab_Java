package Lab1;

//Task 3
class user {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    user(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
}
public class task3 {
    public void task3() {
        user[] users = new user[10];

        users[0] = new user(1, 42, "Ivan", "Ivanov", 70.5, 175.0);
        users[1] = new user(2, 25, "Petro", "Petrov", 80.0, 180.0);
        users[2] = new user(3, 50, "Oksana", "Oksanenko", 60.5, 165.0);
        users[3] = new user(4, 27, "Nadiia", "Nadiienko", 55.0, 160.0);
        users[4] = new user(5, 40, "Olena", "Olenivna", 68.0, 170.0);
        users[5] = new user(6, 35, "Taras", "Tarasenko", 85.0, 185.0);
        users[6] = new user(7, 29, "Dmytro", "Dmytrenko", 78.0, 175.0);
        users[7] = new user(8, 33, "Kateryna", "Katerynchuk", 62.0, 168.0);
        users[8] = new user(9, 18, "Andrii", "Andriienko", 90.0, 190.0);
        users[9] = new user(10,43, "Svitlana", "Svitlenko", 58.5, 162.0);

        int totalAge = 0;
        double totalWeight = 0;
        double totalHeight = 0;

        for (user user : users) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }

        System.out.printf("Total Age: %d\n", totalAge);
        System.out.printf("Total Weight: %.1f\n", totalWeight);
        System.out.printf("Total Height: %.1f\n", totalHeight);
    }
}