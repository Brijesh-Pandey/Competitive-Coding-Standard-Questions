package ad_hoc;

import java.util.Scanner;
import java.math.BigInteger;

/* Given an integer N, return the number of trailing zeroes in N!.
Where N!=N*(N-1)*(N-2)....1
Input
Input contains a single integer N.

Constraints:-
1<= N <=1000000000000000
Output
Print the number of zeros in factorial(N)*/
// August Practice Session
// OBSERVATIONS
// trailing 0s will be generated only by 5 and 2, so idea is to get the power of 5 and 2 and which ever has minimum power
// that much trailing 0s will be there
// if we are talking about factorial than always occurence of 2s is more than occurence of 5, so only check for power of 5
// refer this link for a more clear understanding https://brilliant.org/wiki/trailing-number-of-zeros/
public class Trailing_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num;
        num = sc.nextBigInteger();
        BigInteger count = BigInteger.valueOf(0);
        while (num.compareTo(BigInteger.valueOf(5))>=0){
            num = num.divide(BigInteger.valueOf(5));
            count  = count.add(num);
        }
        System.out.println(count);
    }
}
