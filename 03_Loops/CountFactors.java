import java.util.Scanner;
public class CountFactors {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("Please enter positive number");
        } else {
            int count = 0;
            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    count++;
                }
            }

            System.out.println("Numbers of factors = " + count);
        }

        sc.close();
    }
}
