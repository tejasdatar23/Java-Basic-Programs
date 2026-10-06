import java.util.Scanner;
public class PrintLastDigit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        
        int lastDigit = num % 10;
        
        System.out.println("Last Digit = " + lastDigit);

        sc.close();
    }
}
