package seminar_LSP;

public class Square implements Figure {
    public int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public int getArea() {
        return side * side;
    }
}
