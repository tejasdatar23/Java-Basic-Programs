import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        long num = Math.abs((long)n); // remove negative sign  
        long rev = 0;

        while(num != 0) {
            long digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if(n < 0) {
            rev = -rev;  // add negative sign
        }

        System.out.println("Reverse = " + rev);

        sc.close();
    }
}
