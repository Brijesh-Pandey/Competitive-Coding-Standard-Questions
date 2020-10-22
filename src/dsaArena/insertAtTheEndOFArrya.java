package dsaArena;
/*

Insertion is a basic but frequently used operation. Arrays in most languages cannnot be dynamically shrinked or expanded. Here, we will work with such arrays and try to insert an element at the end of array.

You are given an array arr. The size of the array is given by sizeOfArray. You need to insert an element at end and print the modified array.
Input
The first line of input contains T denoting the number of testcases.
T testcases follow. Each testcase contains two lines of input.
The first line contains size of the array denoted by sizeOfArray and element to be inserted.
The third line contains sizeOfArray elements separated by spaces.

Constraints:
1 <= T <= 20
2 <= sizeOfArray <= 10000
0 <= element, arri <= 10^6
Output
For each testcase, in a new line, print the modified array.
Example
Input:
2
5 90
1 2 3 4 5
3 50
1 2 3


Output:
1 2 3 4 5 90
1 2 3 50

Explanation:
Testcase 1: After inserting 90 at end, we have array elements as 1 2 3 4 5 90.
Testcase 2: After inserting 50 at end, we have array elements as 1 2 3 50.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class insertAtTheEndOFArrya {
    public static void main (String[] args) {
        // Your code here
        ArrayList arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-- > 0){
            int size = sc.nextInt();
            int num = sc.nextInt();
            for(int i = 0 ; i < size ; i++){
                int ele = sc.nextInt();
                arr.add(ele);
            }
            arr.add(num);
            Iterator it = arr.iterator();
            while(it.hasNext()){
                System.out.print(it.next()+" ");
            }
            System.out.println();
            arr.clear();
        }

    }
}
