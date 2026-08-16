import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long moves = (b - (a % b)) % b;
            System.out.println(moves);
        }
    }
}