package hw_DIP;

public class Main {
    public static void main(String[] args) {
        Content myText = new Text("Hello, world!");
        Printer myPrinter = new Printer();
        myPrinter.print(myText);
    }
}
