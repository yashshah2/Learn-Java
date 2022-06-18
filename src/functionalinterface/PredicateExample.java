package functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = (name) -> {
            if(name == "Yash") {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(predicate.test("Yash"));
        
        Predicate<Integer> checkEvenNumber = (number) -> {return number%2 == 0;};
        Predicate<Integer> checkDivisibilityByFive = (number) -> {return number % 5 == 0;};
        
        System.out.println(checkEvenNumber.and(checkDivisibilityByFive).test(5));
     }
}
