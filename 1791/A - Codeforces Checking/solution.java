import java.util.*;
public class CodeforcesChecking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char ch = sc.next().charAt(0);
            String s = "codeforces";
            if(s.indexOf(ch)!=-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}