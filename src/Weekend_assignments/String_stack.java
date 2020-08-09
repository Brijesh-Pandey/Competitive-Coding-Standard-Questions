package Weekend_assignments;

import java.util.Scanner;
import java.util.Stack;

public class String_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0; i < st.length(); i--){
            char ch = st.charAt(i);
            if(stack.empty() || stack.peek() > ch ){
                stack.push(ch);
            }
            else{
                stack2.push(ch);
            }
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
        while(!stack2.empty()){
            System.out.print(stack2.pop());
        }


    }


}
