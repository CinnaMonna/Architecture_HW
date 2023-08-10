package seminar_OCP;

public class Main {
    public static void main(String[] args) {
        Igreet greet1 = new InformalGreet();
        greet1.greet();
        Igreet greet2 = new FormalGreet();
        greet2.greet();
    }

}
