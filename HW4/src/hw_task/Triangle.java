package hw_task;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Метод расчета площади треугольника
     * @return площадь треугольника
     */
    double getAreaTriangle() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    /**
     * Метод расчета периметра треугольника
     * @return периметр треугольника
     */
    double getPerimeterTriangle() {
        return side1 + side2 + side3;
    }
}
