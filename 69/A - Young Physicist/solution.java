import java.util.*;
public class Physicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int sumx =0,sumy=0,sumz=0;
        for(int i=0;i<n;i++)
        {
            sumx+=arr[i][0];
            sumy+=arr[i][1];
            sumz+=arr[i][2];
        }
        if(sumx==0 && sumy==0 &&sumz==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}