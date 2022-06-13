package functionalinterface;

import java.util.Comparator;

public class ComparatorInterfaceExample {
    public static void main(String[] args) {
        Comparator<Integer> compareResult = (a, b) -> {
            if(a > b) {
                return 1;
            } else { 
                return 0;
            }
        };

        System.out.println("result ::" +  compareResult.compare(1, 2));
    }
}
