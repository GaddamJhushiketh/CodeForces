import java.util.*;
public class YourName {
    private static boolean areAnagrams(String s, String t) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++){ 
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++){ 
            freq[t.charAt(i) - 'a']--;
        }
        for (int value : freq){
            if (value != 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            if (areAnagrams(s, t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}