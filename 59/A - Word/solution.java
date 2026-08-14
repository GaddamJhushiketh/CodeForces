import java.util.*;
public class Word
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c1 = 0, c2 = 0;
 
        for (char c : str.toCharArray())
        {
            if (Character.isLowerCase(c))
                c1++;
            else
                c2++;
        }
 
        if (c1 < c2)
            System.out.println(str.toUpperCase());
        else
            System.out.println(str.toLowerCase());
    }
}