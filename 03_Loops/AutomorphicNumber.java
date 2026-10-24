import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Please enter non-negative number");
        } else {
            long square = (long) n * n;

            long divisor = 10;

            int temp = n;

            while(temp >= 10) {
                divisor *= 10;
                temp /= 10;
            }

            if(square % divisor == n) {
                System.out.println("Automorphic Number");
            } else {
                System.out.println("Not Automorphic Number");
            }

            sc.close();
        }
    }
}
