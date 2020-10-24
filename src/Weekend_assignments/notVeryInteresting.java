  // First question asked in nykaa sde round 1
  

import java.util.*;
class Source
{
	public static int sequenceFinder(int n ,int arr[])
	{
		// Implement your code here
		Arrays.sort(arr);
        int max_len=0;
        for(int i=0;i<n-1;i++){
        int j=i;
        int len=1;
        while(j<n-1 && arr[j+1]==arr[j]+1){
        j++;
        len++;
        }
        max_len=Math.max(max_len,len);
        }
        return max_len;
	}
	
	public static void main(String args[])
	{
	    Scanner s= new Scanner(System.in);
	    int n = s.nextInt();
	    int[] arr = new int [n];
	    for(int i = 0; i < n; i++)
	        arr[i] = s.nextInt();
	    int ans = sequenceFinder(n,arr);
	    System.out.print(ans);
	}
}
