package Queues;
import java.util.*;
import java.io.*;
/*
The question is super small and super simple.
You are given an integer n. Initially you have an empty string. You need to construct the string of length n with the following rules:
1. Insert the first character in the beginning of string, the second in the end, the third in the beginning, fourth in the end, and so on.
2. The first character should be 'a', followed by 'b', 'c', and so on. 'z' will be followed by 'a'.
Input
The first and the only line of input contains a single number n.

Constraints
1 <= n <= 500000
Output
Output the generated string.
Example
Sample Input
4

Sample Output
cabd

Sample Input
30

Sample Output
caywusqomkigecabdfhjlnprtvxzbd

Explanation
In the first case the string transforms as follows: "" -> "a" -> "ab" -> "cab" -> "cabd"
 */

public class strangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        char ch = 'a';
        Deque<Character> dq = new LinkedList<>();
        int i = 0;
        while (length-- > 0){
            if(i%2 == 0){
                dq.addFirst(ch);
            }
            else{
                dq.addLast(ch);
            }
            if(ch == 'z'){
                ch = 'a';
                i++;
                continue;
            }
            ch++;
            i++;
        }
        Iterator itr = dq.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }


    }
}
