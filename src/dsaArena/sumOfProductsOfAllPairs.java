package dsaArena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*

Given a positive integer n. The task is to find the sum of product of all possible pairs of (x, y) where x and y will be represented as such y = floor(n/x), x varies from 1 to n.
Input
The first line of input contains an integer T. Each test case contains an integer N.

Constraints:
1 <= T <= 100
1 <= N <= 10^6
Output
For each test case in a new line print the required output.
Input:
2
5
10

Output:
21
87

Explanation:
Testcase 1:
Following are the possible pairs of (x, y): (1, 5), (2, 2), (3, 1), (4, 1), (5, 1).
So, 1*5 + 2*2 + 3*1 + 4*1 + 5*1
   = 5 + 4 + 3 + 4 + 5
   = 21.
 */

public class sumOfProductsOfAllPairs {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-- > 0){
            long sum = 0;
            int x = 1, y;
            int n = sc.nextInt();
            int t = n;
            while(t-- > 0){
                y = (int)Math.floor(n/x);
                sum +=(y*x);
                x++;
            }
            System.out.println(sum);


        }
    }
}
