package functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryFIExample {
    static UnaryOperator<String> unaryString = (s) -> s.concat("default");
    static BinaryOperator<Integer> addNumbers = (a, b) -> a+b;
    public static void main(String[] args) {
        System.out.println(unaryString.apply("yash"));
       System.out.println(addNumbers.apply(1, 6));
    }
}
