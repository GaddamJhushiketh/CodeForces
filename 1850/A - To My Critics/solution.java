import java.util.*;
public class Critics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int arr[] = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);
        int f =0;
        for(int i =0;i<2;i++){
                if(arr[i]+arr[i+1]>=10){
                    f++;
                    break;
                }            
        }
        if(f==0)
        System.out.println("NO");
        else
        System.out.println("YES");
    }
    }
}