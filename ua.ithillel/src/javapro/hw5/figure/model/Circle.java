package javapro.hw5.figure.model;

public class Circle implements Figure {

    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.pow(this.radius,2) * Math.PI;
    }
}
