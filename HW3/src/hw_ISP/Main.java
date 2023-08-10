package hw_ISP;

public class Main {
    public static void main(String[] args) {
        HumanWorker hw = new HumanWorker();
        RobotWorker rb = new RobotWorker();
        hw.eat();
        hw.work();
        rb.work();
    }
}
