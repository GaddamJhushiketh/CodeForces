import java.util.*;
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        boolean isLucky = false;
        for (int lucky : luckyNumbers) {
            if (n % lucky == 0) {
                isLucky = true;
                break;
            }
        }
        if (isLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}