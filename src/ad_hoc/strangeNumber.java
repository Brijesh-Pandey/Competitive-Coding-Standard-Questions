package adhoc;
/*
Problem Statement

A number X (X>=0) is called strange if the sum of its digits is divisible by 9. Given an integer N, your task is to find the Nth strange number.
Input
The input contains a single line containing the value of N.

Constraints:-
1 <= N <= 1000
Output
Print the Nth strange number.
Example
Sample Input:-
3

Sample Output:-
18

Explanation:-
0, 9, and 18 are the first three strange numbers.

Sample Input:-
2

Sample Output:-
9
*/
// Code
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class strangeNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = 9*i;
        }
        System.out.println(arr[n-1]);
	}
}
