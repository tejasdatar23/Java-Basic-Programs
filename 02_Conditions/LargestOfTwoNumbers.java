import java.util.Scanner;
public class LargestOfTwoNumbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b)
        {
            System.out.println("Largest = " + a);
        }
        else if(a < b)
        {
            System.out.println("Largest = " + b);
        }
        else
        {
            System.out.println("Both numbers are equal ");
        }

        sc.close();
    }
}
