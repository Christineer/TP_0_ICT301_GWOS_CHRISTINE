package ict301.solid.lsp.avant;

public class Rectangle {

    protected int width;
    protected int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int calculateArea() {
        return width * height;
    }
}

