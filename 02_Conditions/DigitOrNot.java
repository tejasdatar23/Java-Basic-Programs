import java.util.Scanner;
public class DigitOrNot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);

        if(ch >= '0' && ch <= '9')
        {
            System.out.println("Character is Digit");
        }
        else
        {
            System.out.println("Character is not Digit");
        }

        sc.close();
    }
}
