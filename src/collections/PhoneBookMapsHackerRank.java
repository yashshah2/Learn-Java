package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMapsHackerRank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Long> phonebookMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        //System.out.println("Phonebook Range::");
        int n = scan.nextInt();
        for(int count=0; count<n; count++) {
            //System.out.println("Enter name:");
            scan.nextLine();
            String name = scan.nextLine();
            //System.out.println("Enter phone number::");
            Long phone = scan.nextLong();
            //System.out.println("Name:" + name);
            phonebookMap.put(name, phone);

        }        
        //System.out.println("sda" + phonebookMap);
        String s;
        while ((s = br.readLine())!= null) {
            //System.out.println(phonebookMap.containsKey(s));
            
            if (phonebookMap.containsKey(s)) {
                System.out.println(s + "=" + phonebookMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
    
}
