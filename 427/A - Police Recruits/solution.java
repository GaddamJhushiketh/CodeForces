import java.util.*;
public class PoliceRecruits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int p =0, t=0;
        for(int i =0;i<n;i++){
            if(arr[i] >0){
                p+=arr[i];
            }
            else{
                if(p>0){
                    p--;
                }
                else{
                    t++;
                }
            }
        }
        System.out.println(t);
    }
}