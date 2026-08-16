import java.util.*;
public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[5];
        for(int i=0;i<n;i++){
            arr[sc.nextInt()]++;
        }
        int tax = 0;
        tax+=arr[4];
        tax+=arr[3];
        arr[1] = Math.max(0,arr[1]-arr[3]);
        tax+=arr[2]/2;
        if(arr[2]%2 ==1){
            tax++;
            arr[1] = Math.max(0,arr[1] -2); 
        } 
        tax+=(arr[1]+3)/4;
        System.out.println(tax);
    }
}