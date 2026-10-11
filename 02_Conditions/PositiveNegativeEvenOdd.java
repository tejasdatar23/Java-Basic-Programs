import java.util.Scanner;
public class PositiveNegativeEvenOdd {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        if(num == 0)
        {
            System.out.println("Number is zero");
        }
        else if(num > 0 && num % 2 == 0)
        {
            System.out.println("Positive Even");
        }
        else if(num > 0 && num % 2 != 0)
        {
            System.out.println("Positive Odd");
        }
        else if(num < 0 && num % 2 == 0)
        {
            System.out.println("Negative Even");
        }
        else
        {
            System.out.println("Negative Odd");
        }

        sc.close();
    }
}
