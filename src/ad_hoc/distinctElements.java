package ad_hoc;
import java.util.*;

public class distinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new LinkedHashSet<Integer>();
        for(int i =0 ; i <  n ; i++) {
            int ele = sc.nextInt();
            set.add(ele);
        }

        Iterator<Integer> i = set.iterator();
        while (i.hasNext())
            System.out.print(i.next()+" ");
    }
}
