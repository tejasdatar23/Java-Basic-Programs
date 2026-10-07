import java.util.Scanner;
public class SmallestOfThreeNumbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a <= b && a <= c)
        {
            System.out.println("Smallest = " + a);
        }
        else if(b <= a && b <= c)
        {
            System.out.println("Smallest = " + b);
        }
        else
        {
            System.out.println("Smallest = " + c);
        }

        sc.close();
    }
}
