package ad_hoc;
import java.util.*;

public class gcdOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(calculateGCD(arr,n));

    }
    static int calculateGCD(int[] arr , int n){
        int result = 0;
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }

    static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
