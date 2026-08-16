import java.util.Scanner;
public class ArrayProblem{
    static long gcd(long a, long b){
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer:
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) 
                arr[i] = sc.nextLong();
            for (long x = 2; x <= 100; x++){ 
                boolean found = false;
                for (int i = 0; i < n; i++){
                    if (gcd(arr[i], x) == 1){
                        System.out.println(x);
                        found = true;
                        break;
                    }
                }
                if (found) 
                    continue outer;
            }
            System.out.println(-1);
        }
    }
}