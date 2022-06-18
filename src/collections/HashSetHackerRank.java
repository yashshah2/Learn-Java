package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashSetHackerRank {
    public static void main(String[] args) {
        int nameCount;
        Set<String> namesSet = new HashSet<>();
        Map<String, Integer> nameMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();

        for(int count = 0; count < T; count++) {
            String name = scan.nextLine();
            if(!nameMap.containsKey(name)) {
                nameCount = 1;
                nameMap.put(name, 1);
                System.out.println(nameCount);
            } else {
                nameCount = nameMap.get(name) + 1;
                nameMap.replace(name, nameCount);
                System.out.println(nameCount);
            }
        }
        
    }
  
}
