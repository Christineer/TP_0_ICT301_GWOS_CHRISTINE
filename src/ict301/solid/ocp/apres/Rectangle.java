package ict301.solid.ocp.apres;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double calculateArea() {
        return width * height;
    }
}
