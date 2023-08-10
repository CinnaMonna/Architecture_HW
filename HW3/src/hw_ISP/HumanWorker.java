package hw_ISP;

public class HumanWorker implements IWork, IEat{
    @Override
    public void work() {
        System.out.println("Человек работает");
    }

    @Override
    public void eat() {
        System.out.println("Человек ест");
    }
}
