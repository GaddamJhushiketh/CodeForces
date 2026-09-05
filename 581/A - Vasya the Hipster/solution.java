import java.util.*;
public class Vasya{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a,b);
        int same = ((Math.max(a,b))-min)/2;
        System.out.println(min+" "+same);
    }
}