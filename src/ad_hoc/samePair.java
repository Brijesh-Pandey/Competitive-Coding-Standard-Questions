/*
Problem statement

Given an array Arr of N integers. Solve the following problem for X from 1 to N :-
Find the number of ways to select a pair (i, j) such that i < j and i != X and j != X and Arr[i] = Arr[j].
Input
First line of input contains a single integer, N.
Second line of input contains N space separated integers, denoting array Arr.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= N
Output
Print N space separated integers where ith integer is the answer when X = i.

Sample Input
5
4 4 1 1 1 

Sample Output
3 3 2 2 2 

Explanation:
For X=1 we have (3, 4) (3, 5) (4, 5)
For X=2 we have (3, 4) (3, 5) (4, 5)
For X=3 we have (1, 2) (4, 5)
For X=4 we have (1, 2) (3, 5)
For X=5 we have (1, 2) (3, 4)

Approach -> Using map and ncr 
observation 
nc2 = n(n-1)/2 (using this formula for ncr)
*/
//    code
package adhoc;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class samePair {
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		long total_comb=0;
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			total_comb+=(entry.getValue()*(entry.getValue()-1))/2;
		}
		for(int i=0;i<n;i++){
			long ans=total_comb;
			int x=map.get(arr[i]);
			ans-=(x*(x-1))/2;
			x--;
			ans+=(x*(x-1))/2;
			System.out.print(ans+" ");

		}

	}

}
