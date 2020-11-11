package ad_hoc;

import java.util.Arrays;
import java.util.Scanner;

public class sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count0 = 0 ;
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0)
                count0++;
        }
        for(int i = 0 ; i < count0 ; i++){
            arr[i] = 0;
        }
        for(int i = count0; i < size; i++){
            arr[i] = 1;
        }
        System.out.print(Arrays.toString(arr));
    }
}
