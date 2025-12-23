package ict301.solid.lsp.avant;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Square();
        r.setWidth(5);
        r.setHeight(10);
        System.out.println(r.calculateArea());
    }
}
