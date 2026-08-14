import java.util.*;
public class ChatRoom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = "hello";
        int i =0;
        for(char ch : str.toCharArray()){
            if(i<target.length() && ch == target.charAt(i)){
                i++;
            }
            if(i == target.length()){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}