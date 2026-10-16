import java.util.Scanner;
public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        long num = Math.abs((long)n); // conveting negative values to positive

        long product = 1;

        if(num == 0) {
            product = 0;
        } else {
            while(num > 0) {
            long digit = num % 10;
            product = product * digit;
            num = num / 10;
            }
        }

        System.out.println("Product of digit  = " + product);

        sc.close();

    }
}
