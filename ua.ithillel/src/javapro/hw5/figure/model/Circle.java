package javapro.hw5.figure.model;

public class Circle implements Figure {

    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double areaCalculator() {
        return this.radius * this.radius * Math.PI;
    }
}
