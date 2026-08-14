import java.util.*;
public class Year{
    public static boolean hasDistinctDigits(int year) {
        String s = String.valueOf(year);
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c))  
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int nextYear = year + 1;
        while (!hasDistinctDigits(nextYear)) {
            nextYear++;
        }
        System.out.println(nextYear);
    }
}