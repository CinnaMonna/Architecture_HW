package hw_task;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод расчета площади круга
     * @return площадь круга
     */
    double getAreaCircle() {
        return Math.PI * radius * radius;
    }

    /**
     * Метод расчета периметра окружности
     * @return периметр окружности
     */
    double getPerimeterCircle() {
        return 2 * Math.PI * radius;
    }
}
