package dsaArena;
/*

Given two positive integers N and X, where N is the number of total patients and X is the time duration (in minutes) after which a new patient arrives. Also, doctor will give only 10 minutes to each patient. The task is to calculate the time (in minutes) the last patient needs to wait.
Input
The first line of input contains the number of test cases T. The next subsequent lines denote the total number of patients N and time interval X (in minutes) in which the next patients are visiting.

Constraints:
1 <= T <= 100
0 <= N <= 100
0 <= X <= 30
Output
Output the waiting time of last patient.
Example
Input:
5
4 5
5 3
6 5
7 6
8 2

Output:
15
28
25
24
56

Observation
answer is (n-1) * (10-x);

 */

import java.util.Scanner;

public class doctorsClinic {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(x>10){
                System.out.println("0");
            }
            else
                System.out.println((n-1)*(10-x));
        }

    }
}
