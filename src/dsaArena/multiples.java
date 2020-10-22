package dsaArena;
/*

Given an Array A of size N. For each index i you have to tell the count of numbers which have index greater than i and are multiples of A[i].
Input
User task: Since this is a functional problem you don't have to worry about the input. You just have to complete the function countOfNumbers(A, n) which contains A(array) and n(size of array) as a parameter

Constraints
1<=N<=1000
1<=A[i]<=1000000

For Custom input:-
The first line of the input should contains an integer N ,length of Array .
Next line contains N integers which are elements of Array
Output
You need to return the list which contains the answer for each person ith integer. The driver code will take care of displaying them
Sample Input
3
1 2 3

Sample Output
2 0 0

Explanation : 2,3 are multiple of 1

Sample Input
5
6 4 3 4 1
Sample Output
0 1 0 0 0


*/

public class multiples {

    static int [] countOfNumbers(int A[],int n){
        //Enter your code here
        int [] multiples = new int[A.length];
        for(int i = 0 ; i < A.length-1 ; i++){
            for(int j = i+1 ; j < A.length ; j++){
                if(A[j]%A[i] == 0){
                    multiples[i] += 1;
                }
            }
        }
        return multiples;
    }
}
