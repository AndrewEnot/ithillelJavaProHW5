package javapro.hw5.figure.model;

public class Square implements Figure {

    double side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }
}
