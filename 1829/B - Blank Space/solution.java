import java.util.*;
public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c=0,prev =0;
            for(int i=0;i<n;i++)
            {
                if(arr[i] == 0)
                {
                    c=0;
                    for(int j=i;j<n;j++)
                    {
                        if(arr[j]==0)
                        c++;
                        else
                        break;
                    }
                }
                if(prev<c)
                {
                prev = c;
                }
            }
            System.out.println(prev);
        }
    }
}