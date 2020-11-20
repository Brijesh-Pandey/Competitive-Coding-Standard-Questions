package ad_hoc;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
/*      Problem Statement
standard input/output: 2s/128000 kB

Given an array of size N which represents a number, your task is to find the minimum possible sum by picking two elements formed from the array given.
Input
First line of input contains a single integer N, the next line of input contains N space- separated integers depicting the values of the array.

Constraints:-
2 <= N <= 30
0 <= Arr[i] <= 9
Output
Print the minimum sum possible.
Example
Sample Input:-
4
3 2 1 0

Sample Output:-
15

Explanation:-
02 + 13 = 15

Sample Input:-
5
5 3 0 7 4

Sample Output:-
82

Explanation:-
047 + 35
 */

public class minimumSum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        String st = "";
        String st2 = "";
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < n ; i = i+2){
            st +=arr[i];
        }
        for(int i = 1 ; i < n ; i = i+2){
            st2 +=arr[i];
        }
        sum=Long.parseLong(st);
        sum +=Long.parseLong(st2);
        System.out.print(sum);
    }
}
