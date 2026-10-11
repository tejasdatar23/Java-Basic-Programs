import java.util.Scanner;
public class RightAngleTriangle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three values of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a * a + b * b == c * c)
        {
            System.out.println("Right Angle Triangle");
        }
        else
        {
            System.out.println("Not A Right Angle Triangle");
        }

        sc.close();
    }
}
