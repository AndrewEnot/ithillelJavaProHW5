package javapro.hw5.figure.model;

public class Triangle implements Figure {

    double side;
    double height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }
    @Override
    public double areaCalculator() {
        return (this.side / 2) * this.height;
    }
}
