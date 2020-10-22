package dsaArena;
/*

Given an array of integers of size N, your task is to find the maximum j - i such that Arr[j] > Arr[i] where 0 < = i < j < = N-1.
Input
First line of contains a single integer N, next line contains N space separated integers depicting the values of array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 100000
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
Sample Input:-
5
1 2 3 4 5

Sample Output:-
4

Sample Input:-
5
5 4 3 2 1

Sample Output:-
-1
 */

// Asked in AMAZON , GOOGLE , VMWARE
import java.util.*; // contains Collections framework


public class maximumDifference {

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] minLeft = new int[n];
        int [] maxRight = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Minmum from left
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            min = Math.min(arr[i] , min);
            minLeft[i] = min;
        }

        // Maximum from right
        for(int i = n-1 ; i >=0 ; i--){
            max = Math.max(arr[i] , max);
            maxRight[i] = max;
        }

        int maxDiff = -1;
        int i =0 , j = 0;

        while (j < n && i < n) {
            if (minLeft[i] < maxRight[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j = j + 1;
            }
            else
                i = i + 1;
        }


        System.out.print(maxDiff);
    }
}
