import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter non-negatvive number: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Please enter non-negative number");
        } else {
             long square = (long) n * n;

             long temp = square;
             int sum = 0;

             do{
                int digit = (int) (temp % 10);
                sum += digit;
                temp /= 10;

             } while(temp > 0);

             if(n == sum) {
                System.out.println("Neon Number");
             } else {
                System.out.println("Not Neon Number");
             }

             sc.close();


        }
    }
}
