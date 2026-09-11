import java.util.*;
public class Xenia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long time = 0;
        int current = 1;
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            if(a >= current){
                time +=a-current;
            }
            else{
                time += n-current+a;
            }
            current = a;
        }
        System.out.println(time);
    }
}