import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Please enter positive number");
        } else {
            int temp = n;
            int sum = 0;

            while(temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            if(n % sum == 0) {
                System.out.println("Harshad Number");
            } else {
                System.out.println("Not Harshad Number");
            }
        }

        sc.close();


    }
}
