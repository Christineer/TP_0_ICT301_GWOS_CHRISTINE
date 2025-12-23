package ict301.solid.lsp.apres;

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public int calculateArea() {
        return width * height;
    }
}

