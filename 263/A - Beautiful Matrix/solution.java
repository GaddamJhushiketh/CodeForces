import java.util.Scanner;
public class Beautiful263A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = 0,c =0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(sc.nextInt()==1)
                {
                r = i+1;
                c = j+1;
                }
            }
        }
        int a=0;
        if((r<=3) && (c<=3))
         a = (3-r)+(3-c);
         else if((r>3) && (c<3))
         a = (r-3)+(3-c);
         else if((r<=3) && (c>3))
         a = (3-r)+(c-3);
         else
         a = (r-3)+(c-3);
        System.out.println(a);
    }
}