package javapro.hw5.figure;

import javapro.hw5.figure.model.Circle;
import javapro.hw5.figure.model.Figure;
import javapro.hw5.figure.model.Square;
import javapro.hw5.figure.model.Triangle;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = {new Circle(18), new Triangle(24, 18), new Square(10)};
        squares(figures);
    }

    public static void squares(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.calculateArea();
        }
        System.out.println("The total area of the figures: " + sum);
    }
}