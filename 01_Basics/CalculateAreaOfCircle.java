import java.util.Scanner;
public class CalculateAreaOfCircle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int r = sc.nextInt();

        double area = 3.14 * r * r;

        System.out.println("Area of Circle = " + area);

        sc.close();
    }
}
