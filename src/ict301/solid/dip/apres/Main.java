package ict301.solid.dip.apres;

public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        OrderProcessor op = new OrderProcessor(db);
        op.processOrder("Order1");
    }
}
