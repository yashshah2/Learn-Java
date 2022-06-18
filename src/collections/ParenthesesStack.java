package collections;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesStack {
    public static void main(String[] args) {
        Stack<Character> bracketsStack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            
            String inputStackElement = scan.next();
            char[] bracketArray = inputStackElement.toCharArray();
            for(char bracket : bracketArray) {
                if(bracket == '(' || bracket == '[' || bracket == '{') {
                    bracketsStack.push(bracket);
                    continue;
                } 
                else if(!bracketsStack.empty() && bracketsStack.peek() == '(' && bracket == ')') {
                    bracketsStack.pop();
                    continue;
                } else if (!bracketsStack.empty() && bracketsStack.peek() == '[' && bracket == ']') {
                    bracketsStack.pop();
                    continue;
                } else if (!bracketsStack.empty() && bracketsStack.peek() == '{' && bracket == '}') {
                    bracketsStack.pop();
                    continue;
                }
                if(bracket==']'||bracket==')'||bracket=='}')
                {
                    bracketsStack.push(bracket);
                    break;
                }
                System.out.println(bracketsStack);

            }
            System.out.println(bracketsStack.isEmpty());
            bracketsStack.clear();
            
        }
        scan.close();

    }
}
