import java.util.*;
import java.io.*;

public class Ex6 {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<n; j++)
            {
                int power = (int)Math.pow(2,j);
                int res = a+(power*b);
                System.out.print(res+" ");
                a = res;
            }
            System.out.println();
        }
        in.close();
    }
}
