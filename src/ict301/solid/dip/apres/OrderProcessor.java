package ict301.solid.dip.apres;

public class OrderProcessor {

    private Database database;

    public OrderProcessor(Database db) {
        database = db;
    }

    public void processOrder(String order) {
        database.saveOrder(order);
    }
}

