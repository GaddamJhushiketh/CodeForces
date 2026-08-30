import java.util.*;
public class Restoring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        for(int i=0;i<4;i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int sum = x[3];
        int a = x[0] + x[1] - sum;
        int b = x[0] + x[2] - sum;
        int c = x[1] + x[2] - sum;
        System.out.println(a + " " + b + " " + c);
    }
}