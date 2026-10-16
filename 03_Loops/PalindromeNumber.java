import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Not Palindrome");
        } else {

            long original = n;
            long temp = original;
            long rev = 0;
    
            while(temp != 0) {
            long digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
           }

            if(rev == original) {
               System.out.println("Palindrome");
            } else {
               System.out.println("Not Palindrome");
            }
        }

        sc.close();

    }
}
