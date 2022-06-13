package inheritance;
import java.util.*;
public class Recatangle extends Shapes {
    double calculateAreaOfShape(double length, double width) {
        return length * width;
    }
    double calculatePerimeterOfShape(double length, double width) {
        return  2*(length + width);
    }
    void printAreaoftheShape(double area){
        System.out.println("Area ::" + area);
    }
    void printPerimeterOftheShape(double perimeter) {
        System.out.println("Perimeter ::" + perimeter);
    }
    public static void main(String[] args) {
        Recatangle rectangleObject = new Recatangle();
        double area = rectangleObject.calculateAreaOfShape(12, 10.5);
        double perimeter = rectangleObject.calculatePerimeterOfShape(5, 4.5);
        rectangleObject.printAreaoftheShape(area);
        rectangleObject.printPerimeterOftheShape(perimeter);
    }
}
