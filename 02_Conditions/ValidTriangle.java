import java.util.Scanner;
public class ValidTriangle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three side of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b)
        {
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
