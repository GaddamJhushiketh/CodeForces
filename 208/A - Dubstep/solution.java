import java.util.*;
public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("WUB"," ");
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        System.out.println(str);
    }
}