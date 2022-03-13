import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0 ; i < 3 ; i++)
        {
            String s1=sc.next();
            int spaces = s1.length();
            System.out.print(s1);
            for(int j=spaces; j<15; j++)
            {
                System.out.print(" ");
            }
            int x=sc.nextInt();
            String s2 = String.valueOf(x);
            if(s2.length() < 2)
            {
                System.out.println("00" + x);
            }
            else if(s2.length() < 3)
            {
                System.out.println("0" + x);
            }
            else
                {
                    System.out.println(x);
                }
        }
        System.out.println("================================");

    }


}
