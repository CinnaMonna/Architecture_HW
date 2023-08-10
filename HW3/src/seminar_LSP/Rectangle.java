package seminar_LSP;

public class Rectangle implements Figure {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public int getArea() {
        return width * height;
    }
}
