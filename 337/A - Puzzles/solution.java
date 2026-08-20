import java.util.*;
public class Puzzles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] puzzles = new int[m];
        for(int i=0;i<m;i++){
            puzzles[i] = sc.nextInt();
        }
        Arrays.sort(puzzles);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=m-n;i++){
            ans = Math.min(ans,puzzles[i+n-1]-puzzles[i]);
        }
        System.out.println(ans);
    }
}