package hw_task;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    /**
     * Метод расчета площади прямоугольника
     * @return площадь прямоугольника
     */
    double getAreaRectangle() {
        return length * width;
    }
    /**
     * Метод расчета периметра прямоугольника
     * @return периметр прямоугольника
     */
    double getPerimeterRectangle() {
        return 2 * (length + width);
    }
}
