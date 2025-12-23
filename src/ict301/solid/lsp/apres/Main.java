package ict301.solid.lsp.apres;

public class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 10);
        Shape s = new Square(10);
        System.out.println(r.calculateArea());
        System.out.println(s.calculateArea());
    }
}
