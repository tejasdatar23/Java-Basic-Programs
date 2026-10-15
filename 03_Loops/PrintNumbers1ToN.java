import java.util.Scanner;
public class PrintNumbers1ToN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Please Enter Positive Number");
        }
        else
        {
            for(int i = 1; i <= n; i++)
            {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
