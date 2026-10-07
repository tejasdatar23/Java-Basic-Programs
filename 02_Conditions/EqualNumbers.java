import java.util.Scanner;
public class EqualNumbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbera: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b)
        {
            System.out.println("Both Numbers Are Equal ");
        }
        else
        {
            System.out.println("Numbers Are Not Equal ");
        }

        sc.close();
    }
}
