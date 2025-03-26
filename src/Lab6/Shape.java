package Lab6;

// Базовий клас Shape
public class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }
}

// Похідний клас SolidOfRevolution, наслідує Shape
class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Клас Cylinder, наслідує SolidOfRevolution
class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double volume, double radius, double height) {
        super(volume, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double volume, double radius) {
        super(volume, radius);
    }
}

// Клас Pyramid, наслідує Shape
class Pyramid extends Shape {
    private double square;
    private double hight;

    public Pyramid(double volume, double s, double h) {
        super(volume);
        this.square = s;
        this.hight = h;
    }

    public double getS() {
        return square;
    }

    public double getH() {
        return hight;
    }
}