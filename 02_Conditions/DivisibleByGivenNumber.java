import java.util.Scanner;
public class DivisibleByGivenNumber{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Enter Divisor: ");
        int divisor = sc.nextInt();

        if(divisor == 0)
        {
            System.out.println(" Cannot divide by zero");
        }
        else if(num % divisor == 0)
        {
            System.out.println(num + " is divisible by " + divisor);
        }
        else
        {
            System.out.println(num + " is not divisible by " + divisor);
        }

        sc.close();
    }
}
