import java.util.*;
public class HelpFulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1[] = str.split("\\+");
        Arrays.sort(str1);
        for(int i=0;i<str1.length;i++)
        {
            System.out.print(str1[i]);
            if(i!=str1.length-1)
            System.out.print("+");
        }
    }
}