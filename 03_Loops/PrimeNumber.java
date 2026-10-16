import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        boolean isPrime = n >= 2;

        for(int i = 2; isPrime && i <= n / i; i++) {
            if(n % i == 0) {
                isPrime = false;
            }

        }
            if(isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }

        sc.close();
    }
}
