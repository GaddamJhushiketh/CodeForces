import java.util.*;
public class Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c =0;
        sc.nextLine();
        String str = sc.nextLine();
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}