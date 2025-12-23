package ict301.solid.isp.avant;

public class RobotWorker implements Worker {

    public void work() {
        System.out.println("Robot working");
    }

    public void eat() {
        throw new UnsupportedOperationException();
    }
}

