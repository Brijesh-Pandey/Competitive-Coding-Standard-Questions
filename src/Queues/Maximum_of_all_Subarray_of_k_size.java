package Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maximum_of_all_Subarray_of_k_size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++)
            arr[i] = sc.nextInt();
        // BruteForce Method
        Queue <Integer> queue = new LinkedList<>();
        int max = 0;
        for(int i = 0 ; i < size - k + 1  ; i++){
            queue.add(arr[i]);
            for(int j = i+1 ; j < k + i   ; j++){
                if(arr[j] > queue.peek()){
                    queue.add(arr[j]);
                    queue.remove();
                }
            }
            System.out.print(queue.remove()+" ");
        }

        // Efficient way but needs some fixes
       /* Deque <Integer> dq = new LinkedList<>();
        int max = 0;
        for(int i = 0 ; i < k ; i++){
            while(!dq.isEmpty() && dq.peekFirst() <= arr[i]){
                dq.removeFirst();
            }
            dq.addLast(i);
        }
       // System.out.print(dq);
        for (int i = k; i < size; i++) {
            System.out.print(arr[dq.peek()] + " ");

            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]);*/
    }
}
