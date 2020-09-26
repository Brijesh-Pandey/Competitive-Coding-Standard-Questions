package ad_hoc;

import java.util.Arrays;
import java.util.Scanner;

public class pizza {
    static boolean isDelivered(long [] arr , long [] brr , int time){
        int left = 0 ;
        long x = 0;
        long y = 0;
        int it = 0;

        for(int i = 0 ; i < arr.length; i++){
            if(brr[left] < arr[i]){
                x = arr[i] - brr[left];
                y = Math.max(time - 2*x , (time-x)/2);
                if(x > time) {
                    return false;
                }
            }
            else{
                y = time;
//                vector<ll>::iterator it = upper_bound(b.begin(), b.end(), a[i] + y);
//                left = it - b.begin();
                it = UpperBound(brr ,  (arr[i] +y));
                long[] j = brr;
                left = (int) (it - j[0]);

                if(left == brr.length)
                    return true;
            }
        }
        if(left < brr.length - 1)
            return false;
        return true;
    }
    static int UpperBound(long a[], long x) {// x is the key or target value
        int l=-1,r=a.length;
        while(l+1<r) {
            int m=(l+r)>>>1;
            if(a[m]<=x) l=m;
            else r=m;
        }
        return l+1;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int low = 1;
        int high = Integer.MAX_VALUE;
        int mid = 0;
        long[] arr = new long[n];
        long[] brr = new long[m];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextLong();
        }
        for(int i = 0 ; i < n ; i++ ){
            brr[i] = sc.nextLong();
        }
        // Sort both arrays
        Arrays.sort(arr);
        Arrays.sort(brr);
        // binary search for time range
        while(low < high){
            mid = (low+high)/2;
            if(isDelivered(arr,brr,mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(low);

    }

}
/*
int main()
{
	ll n, m, left = 1, right = INT_MAX, mid;
	cin  >> n >> m;
	vector<ll> a(n), b(m);

	for(ll i = 0; i < n; i++){
		cin >> a[i];
	}
	for(ll i = 0; i < m; i++){
		cin >> b[i];
	}
	sort(a.begin(), a.end());
	sort(b.begin(), b.end());
	while(left < right){
		mid = (left + right) / 2;
		if(isDelivered(a, b, mid)) right = mid;
		else left = mid + 1;
	}
	cout <<left;
*/