import java.util.*;
public class Registration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name = sc.nextLine();
            if(!map.containsKey(name)){
                System.out.println("OK");
                map.put(name, 1);
            }
            else{
                int count = map.get(name);
                String newName = name + count;
                System.out.println(newName);
                map.put(name,count + 1);
                map.put(newName,1);
            }
        }
    }
}