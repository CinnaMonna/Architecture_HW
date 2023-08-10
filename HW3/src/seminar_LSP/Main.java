package seminar_LSP;

public class Main {
    public static void main(String[] args) {
        Figure rect = new Rectangle(5, 10);
        Figure sq = new Square(10);

        System.out.println(rect.getArea());
        System.out.println(sq.getArea());
    }
}
