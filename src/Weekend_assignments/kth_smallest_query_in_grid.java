package Weekend_assignments;
/*
You are given Q queries and an integer K. Queries will be of two types :-
Query of type one gives you coordinates on a 2-D plane.
For Query of type two you have to give the square of distance of the kth closest coordinate of those given so far (in query of type 1) from origin.
Note:-K is fixed for all queries
Input
First line of input contains Q i.e. Total no. of queries and K.
Then Q lines follow
for query of first type : 1 x y
for query of second type : 2
It is gauranted that there will be atleast k queries of type 1 before first query of type 2.

Constraints:-
1 < = k < = Q < = 100000
-1000000 < = x , y < = 1000000
Output
For each query of type 2 output the square of distance of Kth nearest coordinate from Origin in a new line.
Example
Sample input
9 3
1 10 10
1 9 9
1 -8 -8
2
1 7 7
2
1 6 6
1 5 5
2
Sample output
200
162
98
*/
// Explanation:-
//  3rd closest coordinate will be 10,10 for first query of type 2 then after inserting 7,7
//9,9 will become the 3rd closest then after 5 5 and 6 6 7,7 will become the 3rd closest coordintate
// My Approach(Ist attempt)
// I will calculate distance from origin using distance formula for each query of type 1
// and store it in an array and when i encounter a query of type 2 i will sort the array
// and give the kth closest distance
// formula will be x^2 + y^2 ,(Note: not taking square-root as the question asks for square of distance)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class kth_smallest_query_in_grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Long> arr = new ArrayList<>();
        while(query-- > 0){
            int type = sc.nextInt();
            if(type == 1){
                // take input for x and y
                long x = sc.nextInt();
                long y = sc.nextInt();
                // calculate square and store it in array
                arr.add((x*x)+(y*y));
            }
            else{
                //sort the array and print the kth closest
                Collections.sort(arr);
                System.out.println(arr.get(k-1));
            }
        }
    }
}
// Conclusion
// It worked in Ist attempt