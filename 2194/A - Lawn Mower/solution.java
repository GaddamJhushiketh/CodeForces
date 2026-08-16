import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Lawn{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long w = Long.parseLong(st.nextToken());
            long result;
            if (w == 1) {
                result = 0;
            } else {
                result = (n / w) * (w - 1) + Math.min(n % w, w - 1);
            }
            out.append(result).append('
');
        }
        System.out.print(out.toString());
    }
}