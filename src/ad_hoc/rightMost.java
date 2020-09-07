package ad_hoc;
import java.io.*;
import java.util.*;
/*
Given an Array Arr of N integers. For each i from 1 to N find the index j such that Arr[j] >= Arr[i] for multiple possible j find the rightmost j.
Input
First line of input contains a single integer N.
Second line of input contains N integers, denoting the elements of the array.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 1000000000
Output
Print N space separated integers the values of j for each i from 1 to N.
Sample Input:
5
5 2 4 3 1

Sample Output:
1 4 3 4 5
 */

public class rightMost {
    // Bruteforce Approach (7/9/2020)
//    public static void main (String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine());
//        String[] line = reader.readLine().split(" ");
//        long[] arr = new long[n+1];
//        for(int i = 0 ; i < n ; i++){
//            arr[i] = Integer.parseInt(line[i]);
//        }
//        for(int i = 0 ; i < n ; i++){
//            //find max right from this i to n
//            System.out.print(search( arr , i , n , arr[i]) + " ");
//        }
//    }
//    static int search(long[] arr , int index , int size , long num){
//        int j = index;
//        long element = arr[j];
//        for(int i = index ; i < size ; i++){
//            // right highest including that element
//            if(element <= arr[i]){
//                j = i;
//            }
//        }
//        return (j+1);
//    }
    // A better approach would be to make the right array starting from right
    // and it stores maximum element so far from the right end
    // Sample Input:
    //5
    //5 2 4 3 1
    //Sample Output:
    //1 4 3 4 5
    // so for above array the right array would be 5 4 4 3 1
    // then apply binary search for each element
    // complexity is reduced to nlogn

    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] line = reader.readLine().split(" ");
        long[] arr = new long[n];
        long[] suffixArray = new long[n];
        long[] ans = new long[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(line[i]);
        }
        // Create Max array from right
        suffixArray[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            //find max so far
            suffixArray[i] = Math.max(suffixArray[i+1] , arr[i]);
        }
        // call binary search on this suffix array for each element of actual array
        for(int i = 0 ; i < n ; i++){
            int low = 0;
            int high = n-1;
            while(low <= high){
                int mid = low + (high-low) / 2;
                if(suffixArray[mid] >= arr[i]){
                    ans[i] = mid;
                    low = mid+1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        for (long i:ans
             ) {
            System.out.print(i+1 +" ");
        }
    }
}
