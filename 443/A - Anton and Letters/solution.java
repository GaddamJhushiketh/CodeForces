import java.util.*;
public class Anton{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '}' || ch == ',' ||ch == ' ') continue;
            if(!set.contains(ch)){
                set.add(ch);
            }
        }
        System.out.println(set.size());
    }
}