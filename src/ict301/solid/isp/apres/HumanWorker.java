package ict301.solid.isp.apres;

public class HumanWorker implements Workable, Eatable {

    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}
