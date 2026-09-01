import java.util.*;
public class Interestingdrink{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        while(q-->0){
            int val = sc.nextInt();
            int l = 0;
            int r = n - 1;
            int answer = 0;
             while (l <= r) {
                int mid = l + (r - l) / 2;
                if (arr[mid] <= val) {
                    answer = mid + 1;
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            System.out.println(answer);
        }
    }
}