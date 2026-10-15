import java.util.Scanner;
public class PrintNumbersNTo1 {
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
            while(n >= 1)
            {
                System.out.println(n);
                n--;
            }
        }

        sc.close();
    }
}
