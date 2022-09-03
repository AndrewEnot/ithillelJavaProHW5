package javapro.hw5.ex0;

public class Circle extends Figure {

    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calc(Object obj) {
        return this.radius * this.radius * Math.PI;
    }
}
