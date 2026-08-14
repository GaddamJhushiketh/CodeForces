import java.util.*;
 
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine(); 
 
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == '4' || c == '7') {
                count++;
            }
        }
 
        if (isLucky(count)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
    static boolean isLucky(int num) {
        if (num == 0) return false; 
        while (num > 0) {
            int d = num % 10;
            if (d != 4 && d != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}