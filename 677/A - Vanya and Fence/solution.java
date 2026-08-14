import java.util.*;
public class Vanya{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int count =0;
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            if(val>h)
            count+=2;
            else
            count++;
        }
        System.out.println(count);
    }
 
}