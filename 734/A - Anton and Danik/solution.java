import java.util.Scanner;
public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.next();
        int a = 0, b = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'A') {
                a++;
            } else if (ch == 'D') {
                b++;
            }
        }
        if (a > b)
            System.out.println("Anton");
        else if (b > a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}