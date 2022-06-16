package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Get the list size
        //System.out.println("N: ");
        int N = scan.nextInt();
        List<Integer> numberList = new ArrayList<Integer>();
        //Get the elements of the list
        for(int count = 0; count < N; count++) {
            //System.out.println("Val : ");
            numberList.add(scan.nextInt());
        }   
        
        //Get the count of operations Q
        //System.out.println("Q : ");
        int Q = scan.nextInt();

        //Perform 2Q operations 
        for(int count = 0; count < Q; count++) {
            //System.out.println("Insert/Delete");
            String queryOperation = scan.next(); //Insert/Delete
            if(queryOperation.equals("Insert")) {
                //System.out.println("x :");
                int x = scan.nextInt();
                //System.out.println("y :");
                int y = scan.nextInt();
                numberList.add(x, y);   //add(index, element)
            } else if (queryOperation.equals("Delete")) {
                //System.out.println("x1 :");
                int x = scan.nextInt();
                numberList.remove(x); //remove(index)
            }
        }
        scan.close();
        Iterator itr = numberList.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+ " ");
        }
    }

    
}
