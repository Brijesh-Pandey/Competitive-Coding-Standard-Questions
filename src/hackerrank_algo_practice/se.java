package hackerrank_algo_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class se {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 =br.readLine().split(" ");
        String[] line2 =br.readLine().split(" ");
        int size = Integer.parseInt(line1[0]);
        Integer [] arr = new Integer[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = Integer.parseInt(line2[i]);
        }
        Arrays.sort(arr , Collections.reverseOrder());


    }
}
