package adhoc;
/*
Problem Statement

Find the number of strings of length N, such that the character 'a' and the character 'b' occurs at least once in the string and the string consists of lowercase letters of the english alphabet only.

As the answer can be large, output it modulo 109+7.
Input
The first and the only line of input contains an integer N.

Constraints
1 <= N <= 100000
Output
Output a single integer, the number of strings of length N satisfying the conditions mentioned in the problem.
Sample Input
1

Sample Output
0

Explanation: No string satisfies the condition.

Sample Input
2

Sample Output
2

Explanation: Only strings "ab" and "ba" satisfy the condition.
*/
// Code

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        // formula is total occurenece - occurenece in which either a, b is not there
        //p26 - ((2 * (p25 - p24)) % mod) - p24
        BigInteger p26 = BigInteger.valueOf(26).pow(n.intValue()).mod(BigInteger.valueOf(1000000007));
        BigInteger p25 = BigInteger.valueOf(25).pow(n.intValue()).mod(BigInteger.valueOf(1000000007));
        BigInteger p24 = BigInteger.valueOf(24).pow(n.intValue()).mod(BigInteger.valueOf(1000000007));
        BigInteger answer = (p26.subtract((p25.subtract(p24)).multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(1000000007))).subtract(p24)).mod(BigInteger.valueOf(1000000007));
        System.out.println(answer);
	}
}
