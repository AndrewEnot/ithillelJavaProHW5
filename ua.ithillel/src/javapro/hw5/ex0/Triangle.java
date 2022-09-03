package javapro.hw5.ex0;

public class Triangle extends Figure {

    double side;
    double height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }
    @Override
    public double sqCalc() {
        return (this.side / 2) * this.height;
    }
}
