package ad_hoc;
/*
Given an unsorted array A[] of size N. A triplet (i, j, k) is said to be special if they satisfy below two conditions:

1. i < j < k
2. Ai < Aj < Ak
V(Ai,Aj,Ak): Ai + (Aj * Ak)

You need to find the maximum possible value V(Ai,Aj,Ak) which can be obtained from possible triplets satisfying above two conditions.
Input
The input line contains T, denoting the number of testcases. Each testcase contains Two lines. First line contains size of array. Second line contains elements of array separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^6

Sum of N for all test cases is less than 10^5
Output
For each testcase you need find the maximum possible value in new line otherwise print "-1" if no such triplet is found.
Example
Sample Input:
2
4
5 20 11 19
4
1 2 2 2
Sample Output:
214
-1  */
// My Approach
// Step 1 : Sort the array while maintaining index
// Step 2 : Traverse from last and check for the last three numbers who satisfies both the condition
// Step 3 : USe sliding window concept to check for the index condition

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class special_triplets{
        public static void main(String[] args) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int T=Integer.parseInt(br.readLine());
            while(T-- > 0){
                int N=Integer.parseInt(br.readLine());
                String[] input =br.readLine().trim().split("\\s");
                int[] arr =new int[N];
                for(int i=0;i<N;i++)
                    arr[i]=Integer.parseInt(input[i]);
                int[] greaterArr =generateGreaterArray(arr,N);
                int[] lesserArr =generateLesserArray(arr,N);
                long maxValue=-1;
                for(int i=0;i<N;i++){
                    if(lesserArr[i] < arr[i] && arr[i] < greaterArr[i] && lesserArr[i]!=0){
                        long value=lesserArr[i]+((long)arr[i]*greaterArr[i]);
                        if(value > maxValue)
                            maxValue=value;
                    }
                }
                System.out.println(maxValue);
            }
        }

        public static int[] generateGreaterArray(int[] a, int size ){
            int[] right = new int[size];
            right[size-1] = a[size-1];
            for (int i = size - 2; i >= 0; i--) {
                right[i] = Math.max(right[i+1], a[i]);
            }
            return right;
        }

        public static int[] generateLesserArray(int[] a, int size){
            int[] left=new int[size];
            TreeSet<Integer> mySet=new TreeSet<>();
            for(int i=0;i<size;i++){
                mySet.add(a[i]);
                try{
                    left[i]=mySet.lower(a[i]);
                }catch(Exception e){
                    left[i]=0;
                }
            }

            return left;
        }
    }