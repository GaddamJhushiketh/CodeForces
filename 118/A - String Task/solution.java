import java.util.*;
 
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ("aeiouy".indexOf(c) == -1) {
                result.append('.');
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}