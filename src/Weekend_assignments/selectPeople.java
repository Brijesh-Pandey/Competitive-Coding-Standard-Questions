package Weekend_assignments;
/*
Given a group of A + B people, with A Indians and B Americans. Find number of ways to select a non-empty subset of these people, such that the subset has equal number of Indian and American people.
Input
Input contains two space separated integers A and B.

Constraints:
1 <= A, B <= 1000000
Output
Print the number of ways modulo 1000000007.

Sample Input
2 2

Sample Output
5

Explanation: (I1, A1) (I2, A1) (I1, A2) (I2, A2) (I1, I2, A1, A2)
I denotes indian person. A denotes american person.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class selectPeople {

    // Use this to reduce the numbers
    static long mod = 1000000007;
    // precomputing factorials upto range
    static long[] factorial = new long[1000001];
    static{
        factorial[0] = 1;
        for(int i = 1 ; i < 1000001 ; i++){
            factorial[i] = (factorial[i - 1] * i)%mod;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int indians = Integer.parseInt(line[0]);
        int americans = Integer.parseInt(line[1]);
        nHr(indians , americans);

    }
    static void nHr(int ind, int amer){
        long result =0;
        int min = Math.min(ind,amer);

        for(int i = 1 ;  i <= Math.min(ind,amer) ; i++){
            result = (result + ((nCr(ind, i) * nCr(amer, i))%mod)%mod);
        }
        System.out.println(result%mod);
    }


    // ncr
    static long nCr(int n, int r){
        long result = ((((factorial[n] * Fermits(factorial[r]) % mod) * Fermits(factorial[n - r])) % mod));
        return result;
    }

    // fermits
    public static long Fermits(long a){
        long result = 1, b = mod-2;
        while(b > 0){
            if(b%2!=0){
                result = (result * a) % mod;
                b -= 1;
            }else{
                a = (a * a) % mod;
                b /= 2;
            }
        }
        return result;
    }




}
