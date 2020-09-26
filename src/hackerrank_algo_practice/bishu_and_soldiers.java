package hackerrank_algo_practice;
/* Problem statement
Bishu went to fight for Coding Club. There were N soldiers with various powers.
There will be Q rounds to fight and in each round Bishu's power will be varied.
With power M, Bishu can kill all the soldiers whose power is less than or equal to M(<=M).
After each round, All the soldiers who are dead in previous round will reborn.
Such that in each round there will be N soldiers to fight.
As Bishu is weak in mathematics, help him to count the number of soldiers that he can kill in each round and total sum of their powers.

Constraints
        1<=N<=10000
        1<=power of each soldier<=100
        1<=Q<=10000
        1<=power of bishu<=100

Sample Input
        7
        1 2 3 4 5 6 7
        3
        3
        10
        2
SAMPLE OUTPUT
        3 6
        7 28
        2 3
Explanation
In first round bhishu power is 3
So there are 3 soldiers whose power is <=3 and the sum of their power is 1+2+3=6
therefore ans= 3 6
same for the next round
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bishu_and_soldiers {
    public static void main(String args[] ) throws Exception {
//        Sample Input
//        7
//        1 2 3 4 5 6 7
//        3
//        3
//        10
//        2

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        String[] array = br.readLine().split(" ");
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(arr);
        String[] roundNumbers = br.readLine().split(" ");
        int round = Integer.parseInt(roundNumbers[0]) ;

        while(round-- > 0){
            int sum = 0;
            int count = 0;
            String[] powers = br.readLine().split(" ");
            int power = Integer.parseInt(powers[0]);
            // loop through array and find all numbers less than power
            for(int i = 0 ; i < n ;i++){
                if(arr[i] <= power){
                    sum +=arr[i];
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.print(count+" "+sum);
            System.out.println();
        }

    }

}
