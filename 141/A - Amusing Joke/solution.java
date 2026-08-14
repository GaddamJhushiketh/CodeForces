import java.util.*;
public class Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str = sc.nextLine();
        if(str1.length()+str2.length() != str.length())
        System.out.println("NO");
        else{
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char ch: str1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for(char ch: str2.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for(char ch: str.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int f=0;
        for(char ch: map1.keySet()){
            if(!map1.get(ch).equals(map2.getOrDefault(ch, 0)))
            {
                f++;
                System.out.println("NO");
                break;
            }
        }
        if(f==0)
        {
            System.out.println("YES");
        }
    }
    }
}