package ict301.solid.lsp.apres;

public class Square implements Shape {

    private int side;

    public Square(int s) {
        side = s;
    }

    public int calculateArea() {
        return side * side;
    }
}

