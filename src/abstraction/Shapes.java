package abstraction;

abstract class areaOfShapes {
    //abstract void areaOfSquare();
    abstract void areaOfRectangle();
}

class Rectangle extends areaOfShapes {
    void areaOfRectangle () {
        System.out.println("Area Of Rectangle !!");
    }
}

class Shapes {
    public static void main(String[] args) {
        Rectangle rectangleObject = new Rectangle();
        rectangleObject.areaOfRectangle();
    }
}