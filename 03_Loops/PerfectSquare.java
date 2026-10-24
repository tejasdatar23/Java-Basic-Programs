import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter non-negative number: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Please enter non-negative number");
        } else { 

            boolean isPerfectSquare = false;

            for(long i = 0; i * i <= n; i++) {
                if(i * i == n) {
                    isPerfectSquare = true;
                    break;
                }
            }

            if(isPerfectSquare) {
                System.out.println("Perfect Square");
            } else {
                System.out.println("Not Perfect Square");
            }
        }

        sc.close();

    }
}
