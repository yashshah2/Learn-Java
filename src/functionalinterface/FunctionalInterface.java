package functionalinterface;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<String, String> printName = (name) -> name;
        Function<String, String> addSomeString = (name) -> name.toLowerCase().concat(" ,the Developer");
        String name = printName.apply("yash shah");
        String newName = printName.andThen(addSomeString).apply("yash shah");
        String newNameWithCompose = printName.compose(addSomeString).apply("yash shah");
        System.out.println(name);
        System.out.println(newName);
        System.out.println(newNameWithCompose);
    }
}
