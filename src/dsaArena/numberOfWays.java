package dsaArena;
/*
            Recursion package

Find number of ways an integer N can be represented as a sum of unique natural numbers.
Input
First line contain an integer T denoting number of test cases. Each test case contains a single integer N.

Constraint:-
1 <= T <= 100
0 <= N <= 120
Output
Print a single integer containing number of ways.

Sample input
4
6
1
4
2

Sample output:-
4
1
2
1

Explanation:-
TestCase1:-
6 can be represented as (1, 2, 3), (1, 5), (2, 4), (6)

 */

import java.util.Scanner;

public class numberOfWays {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =  new Scanner(System.in);
        int testcases = sc.nextInt();

        while(testcases-- > 0){
            int n = sc.nextInt();
            System.out.println(numberOfWays(n , 1));

        }
    }

    static int numberOfWays(int num, int i){
        int remaining = num - i;
        if(remaining == 0 ){
            return 1;
        }
        if(remaining < 0){
            return 0;
        }
        else{
            return (numberOfWays(remaining , i+1)+numberOfWays( num, i+1));
        }
    }
}
