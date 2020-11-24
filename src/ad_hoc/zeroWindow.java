package ad_hoc;
/*
standard input/output: 2s/128000 kB

You are given a binary string of length N. Find the number of substrings of length K in which the number of zeroes are greater or equal to the number of ones.
Input
The first line of the input contains two integers N and K, the length of the binary string and the length of the substrings to test.
The second line of the input contains the binary string.

Constraints
1 <= K <= N <= 200000
Each character of the string is either 0 or 1.
Output
Output a single integer, the answer to the problem.
Example
Sample Input
5 3
01010

Sample Output
2

Explanation: The substrings of length 3 are "010", "101", "010". Of these, the first and the third ones satisfy the condition.

Sample Input
5 2
01010

Sample Output
4

Explanation: All the substrings of length 2 satisfy the condition.

Approach - Sliding window
 */

import java.util.Scanner;

public class zeroWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int count0 = 0 , count1 = 0, actualCount = 0;
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < k ; i++){
            if(arr[i] == 0){
                count0++;
            }
            else{
                count1++;
            }
        }
        if(count0 >= count1){
            actualCount++;
        }

        // sliding window
        for(int i = k ; i < size; i++){
            int toBeRemoved = arr[i-k];
            int toBeAdded = arr[i];
            if(toBeRemoved==0)
                count0--;
            else
                count1--;
            if(toBeAdded==0)
                count0++;
            else
                count1++;
            if(count0 >= count1){
                actualCount++;
            }
        }
        System.out.print(actualCount);
    }
}
