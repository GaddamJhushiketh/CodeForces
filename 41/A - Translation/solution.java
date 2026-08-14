import java.util.*;
public class Trens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length())
        {
            System.out.println("NO");
        }
        else{
            int f =0;   
            for(int i =0;i<str1.length();i++)
            {
                if(str1.charAt(i)!=str2.charAt(str1.length()-i-1))
                {
                    f++;
                    System.out.println("NO");
                    break;
                }
            }
            if(f==0)
            System.out.println("YES");
        }
    }
}