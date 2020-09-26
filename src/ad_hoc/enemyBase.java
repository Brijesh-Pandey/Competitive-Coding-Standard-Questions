package ad_hoc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*

The government has launched a missile to destroy the enemy bases which are represented by a 1-indexed array of N integers.
At the time of launch, all the enemy bases which have defense lower than or equal to A will be destroyed immediately. Then after, each destroyed defense will act as government source and will lower the enemy base defense by A when it attacks any particular base. If the current base is i (1 <= i < = N) then on the first day it will attack i+1 and i-1 base the next day it will attack the i+2 and i-2 base (the attack happens only if a base exists at the attack position). The base will be destroyed if its defense goes below or equal to 0.
Since the missile is costly, the government wants to know the minimum A requires so that the project can be ended within D days.
For more clarification see the example
Note:- Only the defenses which were destroyed at the time of launch will act as a source
Input
First line of input contains two space separated integer N and D. Second line of input contains N space separated integers denoting the value of the Array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 100000000
1 < = D < = 10000
Output
Print the minimum attack power requires to complete the project within D days.
Examples
Sample Input:-
3 1
5 10 5

Sample Output:-
5

Explanation:-
1st and 3rd defense will be destroyed
immediately then at first day 1st will attack 2nd defense and lowers its defense by 5
and on the same day 3rd defense will also attack the second and destroys it.


Sample Input:-
6 3
2 15 4 2 6 9

Sample Output:-
5

Explanation:-
After launch :- 0 15 0 0 6 9 (1st 3rd and 4th will act as source)
Day 1:- 0 5 0 0 1 9
Day 2:- 0 0 0 0 0 4
Day 3:- 0 0 0 0 0 0
 */
public class enemyBase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        String[] line1 = br.readLine().split(" ");
        int size = Integer.parseInt(line[0]);
        int day = Integer.parseInt(line[1]);
        long [] arr = new long[size];
        // input array
        for(int i = 0 ; i < size ; i++){
            arr[i] = Integer.parseInt(line1[i]);
        }

        int power = 5;  // binary search function to select the power from 1 to max(array)
        ArrayList<Integer> attackFromTheseIndices = new ArrayList<Integer>();
        attackFromTheseIndices =  currentDay(arr , power , size);
       while(day-- > 0){
           for(int i = 0 ; i < attackFromTheseIndices.size() ; i++){
               attack(attackFromTheseIndices.get(i), arr , day , power);
           }


       }
    }
    static void attack(int pos , long[] arr , int day , int power){
        for(int i = 0 ; i < arr.length ; i++){
            // for left side
            if((pos-day) >= 0){
                arr[pos-day] -= power;
            }
            // for right side
            if((pos+day) < arr.length){
                arr[pos+day] -= power;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0)
                arr[i] = 0;;
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    // this function will reduce the bases to 0  which are less than equal to power
    // and will store indexes to attack the base
    static ArrayList<Integer> currentDay(long[] arr , int power , int size){
        // 2 15 4 2 6 9
        // 1st iteration
        ArrayList<Integer> attackIndex = new ArrayList<Integer>();
        for(int i = 0 ; i < size ; i++){
            if(arr[i] <= power){
                arr[i] = 0;
                attackIndex.add(i);
            }
        }
        return (attackIndex);
    }
}
