import java.util.Scanner;
public class NthFibonacciNumber {

    public static long findFibonacci(int n) {
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        long first = 0;
        long second = 1;

        for(int i = 2; i <= n; i++) {
            long next = first + second;
            first = second;
            second = next;
        }

        return second;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position N (0-base, 0 to 92): ");
        int n = sc.nextInt();

        if(n < 0 || n > 92) {
            System.out.println("Please enter N between 0 and 92");
        } else { 
            System.out.println("Fibonacci number at position " + n + " = " + findFibonacci(n));
        }

        sc.close();


    }
}
