import java.util.Scanner;
public class FindNumberOfEqualValue {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && a == c)
        {
            System.out.println("All three values are equal");
        }
        else if(a == b || b == c || a == c)
        {
            System.out.println("Only two values are equal");
        }
        else
        {
            System.out.println("All values are different");
        }

        sc.close();
    }
}
