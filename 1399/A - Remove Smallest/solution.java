import java.util.*;
public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();      
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            int count=0;
            for(int i=0;i<n-1;i++){
                if(list.get(i+1)-list.get(i)<=1)
                count++;
            }
            if(count+1 == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}