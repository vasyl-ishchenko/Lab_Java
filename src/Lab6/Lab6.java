package Lab6;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        //Object for Task 1
        Person person1 = new Person();
        Person person2 = new Person("Василь Петрович", 30);
        //Object for Task 2
        Phone phone1 = new Phone("123-456-7890", "Model A", 150.0);
        Phone phone2 = new Phone("098-765-4321", "Model B");
        Phone phone3 = new Phone();
        //Object for Task 3
        Shape shape = new Shape(100.0);
        SolidOfRevolution solid = new SolidOfRevolution(150.0, 5.0);
        Cylinder cylinder = new Cylinder(200.0, 7.0, 10.0);
        Ball ball = new Ball(50.0, 3.0);
        Pyramid pyramid = new Pyramid(120.0, 6.0, 8.0);
        //Object for Task 4
        Sedan sedan = new Sedan("Toyota Camry", "Червоний", 240);
        Truck truck = new Truck("Volvo FH", "Синій", 120);
        //Object for Task 5
        StudentGroup group = new StudentGroup();
        //Object for Task 6
        AdvancedStudentGroup advancedGroup = new AdvancedStudentGroup();

        while(true) {
            Scanner inp = new Scanner(System.in);
            System.out.print("\n\nInput number of task: ");
            int select = inp.nextInt();
            switch (select) {
                case 1:
                    person1.move();
                    person1.talk();
                    person2.move();
                    person2.talk();
                    break;
                case 2:
                    phone1.printInfo();
                    phone2.printInfo();
                    phone3.printInfo();
                    phone1.receiveCall("Василь");
                    System.out.println("Phone number: " + phone1.getNumber()+"\n");

                    phone2.receiveCall("Олег");
                    System.out.println("Phone number: " + phone2.getNumber()+"\n");

                    phone3.receiveCall("Марія");
                    System.out.println("Phone number: " + phone3.getNumber()+"\n");

                    phone1.receiveCall("Василь", "123-456-7890");

                    phone1.sendMessage("123-456-7890", "098-765-4321", "555-123-4567");
                    break;
                case 3:
                    System.out.println("Shape volume: " + shape.getVolume());
                    System.out.println("SolidOfRevolution volume: " + solid.getVolume() + ", radius: " + solid.getRadius());
                    System.out.println("Cylinder volume: " + cylinder.getVolume() + ", radius: " + cylinder.getRadius() + ", height: " + cylinder.getHeight());
                    System.out.println("Ball volume: " + ball.getVolume() + ", radius: " + ball.getRadius());
                    System.out.println("Pyramid volume: " + pyramid.getVolume() + ", s: " + pyramid.getS() + ", h: " + pyramid.getH());
                    break;
                case 4:
                    sedan.gas();
                    sedan.brake();
                    truck.gas();
                    truck.brake();
                    break;
                case 5:
                    group.inputData();
                    group.displayData();
                    group.calculatePercentages();
                    break;
                case 6:
                    advancedGroup.inputData();
                    advancedGroup.inputAdditionalData();
                    advancedGroup.displayData();
                    advancedGroup.calculatePercentages();
                    break;
                default:
                    System.out.println("Програма завершена");
                    System.exit(0);
            }

        }

    }
}