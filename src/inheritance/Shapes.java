package inheritance;
import java.util.*;  

abstract class Shapes {
    abstract double calculateAreaOfShape(double length, double width);
    abstract double calculatePerimeterOfShape(double length, double width);
    abstract void printAreaoftheShape(double area);
    abstract void printPerimeterOftheShape(double perimeter);

    public void printMessage() {
        System.out.println("HI there!!");
    }
}
