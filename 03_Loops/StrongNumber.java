import java.util.Scanner;
public class StrongNumber {

    public static long factorial(int digit) {
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
               fact  = fact * i;
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Please enter non-negative value");
        } else {
        
            int original  = n;
            int sum = 0;

            do {
            int digit = n % 10;

            sum += factorial(digit);

            n /= 10;
            } while(n > 0);


        if(original == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }

        sc.close();

    }
}
