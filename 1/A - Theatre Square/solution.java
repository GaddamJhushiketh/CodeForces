import java.util.Scanner;
public class Theatre1A{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble(),m=sc.nextDouble(),a=sc.nextDouble();
            long r = ((long)Math.ceil(n/a)*(long)Math.ceil(m/a));
            System.out.println(r);
    }
}