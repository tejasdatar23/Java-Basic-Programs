import java.util.Scanner;
public class SecondLargestOfThreeNumbers {
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a >= b && a <= c) || (a <= b && a >= c))
        {
            System.out.println("Second Largest = " + a);
        }
        else if((b >= a && b <= c) || (b <= a && b >= c))
        {
            System.out.println("Second Largest = " + b);
        }
        else
        {
            System.out.println("Second Largest = " + c);
        }

        sc.close();
     }
}
