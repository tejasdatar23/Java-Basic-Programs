import java.util.Scanner;
public class ReverseNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Please enter positive value");
        } else {
            System.out.printf("%-12s%s%n", "Number", "Reverse");
            for(int i = 1; i <= n; i++) {
                int temp = i;
                long reverse = 0;

                while(temp > 0) {
                    int digit = temp % 10;
                    reverse = reverse * 10 + digit;
                    temp /= 10;
                }

                System.out.printf("%-12d%d%n", i , reverse);
            }
        }

        sc.close();
    }
}
