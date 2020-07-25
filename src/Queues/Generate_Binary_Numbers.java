package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Generate_Binary_Numbers {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        queue.offer("1");
        while(num-- > 0){
            String st = queue.peek();
            System.out.print(st+" ");
            queue.poll();
            String st1 = st;
            queue.offer(st+"0");
            queue.offer(st1+"1");
        }
    }
}
