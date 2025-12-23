package ict301.solid.dip.avant;

public class OrderProcessor {

    private MySQLDatabase database = new MySQLDatabase();

    public void processOrder(String order) {
        database.saveOrder(order);
    }
}
