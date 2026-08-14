//So, you've decided to stick to the following strategy to avoid suspicions: you take the minimum number of coins, whose sum of values is strictly more than the sum of values of the remaining coins. On this basis, determine what minimum number of coins you need to take to divide them in the described manner.
import java.util.*;
public class Twin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum =0;
        for(int i =0;i<n;i++){
         arr[i] =sc.nextInt();
         sum+=arr[i];
        }
        Arrays.sort(arr);
        int count=0, taken =0,f=0;
        for(int i =arr.length-1;i>=0;i--){
            taken+=arr[i];
            count++;
            if(taken > sum- taken){
            System.out.println(count);
            f++;
            break;
            }
        }
        if(f==0)
        System.out.println(count);
    }
}