package ict301.solid.ocp.avant;

public class AreaCalculator {

    public double calculateArea(Object shape) {

        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.getWidth() * r.getHeight();
        }

        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.getRadius() * c.getRadius();
        }

        throw new IllegalArgumentException();
    }
}
