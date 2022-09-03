package javapro.hw5.ex0;

public class Square extends Figure {

    double side;
    public Square(int side) {
        this.side = side;
    }
    @Override
    public double sqCalc() {
        return this.side * this.side;
    }
}
