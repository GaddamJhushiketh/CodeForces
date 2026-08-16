import java.util.*;
public class SpecialtyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            for (char c : s.toCharArray()) {
                if (!st.isEmpty() && st.peek() == c) {
                    st.pop();
                } else {
                    st.push(c);
                }
            }
            if (st.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}