package ict301.solid.dip.apres;

public class MySQLDatabase implements Database {

    public void saveOrder(String order) {
        System.out.println("Saved in MySQL: " + order);
    }
}

