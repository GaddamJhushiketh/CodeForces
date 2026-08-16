import java.util.*;
public class Pangram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        for(char c : s.toLowerCase().toCharArray()){
            set.add(c);
        }
        if (set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}