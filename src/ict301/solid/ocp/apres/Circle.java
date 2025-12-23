package ict301.solid.ocp.apres;

public class Circle implements Shape {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

