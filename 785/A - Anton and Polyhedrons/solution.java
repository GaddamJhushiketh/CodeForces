import java.util.*;
public class Polyhedrons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Tetrahedron",4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron",20);
        int t = sc.nextInt();
        int sum = 0;
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            sum+=map.getOrDefault(str,0);
        }
        System.out.println(sum);
    }
}