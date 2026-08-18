import java.util.*;
public class Tprimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] arr = new long[t];
        long max = 0;
        for(int i = 0;i<t;i++){
            arr[i] = sc.nextLong();
            max = Math.max(max,arr[i]);
        }
        int limit = (int)Math.sqrt(max);
        boolean[] prime = new boolean[limit+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2;i*i<=limit;i++){
            if(prime[i]){
                for(int j = i*i; j<=limit;j+=i){
                    prime[j] = false;
                }
            }
        }
        for(long n:arr){
            long root =(long)Math.sqrt(n);
            if(root*root == n && prime[(int)root]) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}