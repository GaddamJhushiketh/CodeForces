import java.util.*;
public class Capitalization
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        if (Character.isLowerCase(ch[0])) 
        {
            ch[0] = Character.toUpperCase(ch[0]);
        }
        System.out.println(new String(ch));
    }
}