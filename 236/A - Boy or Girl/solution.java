import java.util.*;
public class BoyOrGirl {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.next();
HashSet<Character> set = new HashSet<>();
for(char c : str.toCharArray())
set.add(c);
int n = set.size();
if(n%2==0)
System.out.println("CHAT WITH HER!");
else
System.out.println("IGNORE HIM!");
 }
 }
 
 