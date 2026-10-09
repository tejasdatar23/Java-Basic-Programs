import java.util.Scanner;
public class MidelOfThreeNumbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a >= b && a <= c) || (a <= b && a >= c))
        {
            System.out.println("Midel Number = " + a);
        }
        else if((b >= a && b <= c) || (b <= a && b >= c)) 
        {
            System.out.println("Midel Number = " + b);
        }
        else
        {
            System.out.println("Midel Number = " + c);
        }

        sc.close();

    } 
}
