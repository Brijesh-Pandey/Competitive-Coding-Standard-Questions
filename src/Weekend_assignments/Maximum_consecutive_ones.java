package Weekend_assignments;

import java.util.Scanner;

// Problem statement is
// Given an array of size N consisting of only 0's and 1's,
// our task is to find the maximum number of consecutive's 1's you can get by flipping at most M 0's
// sample input
//5 1
//1 0 1 0 0
// sample output
//3
// Using sliding window concept to solve this
public class Maximum_consecutive_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int m = sc.nextInt();
        for(int i = 0 ; i < size ; i++)
            arr[i] = sc.nextInt();
        // Using siding window
        int l = 0;
        int r = 0;
        int countZeroes = 0 , window_size = 0;
        // think on while loop condition to make more clarification
        // it is like that so that our window doesn't exceed the array size
        while(r < size){
            if(countZeroes <= m){
                if(arr[r] == 0 )
                    countZeroes++;
                r++;
            }
            if(countZeroes > m){
                if(arr[l] == 0)
                    countZeroes--;
                l++;
            }
            if(r-l > window_size && m >= countZeroes){
                window_size = r-l;
            }
        }
        System.out.println(window_size);
    }
}
