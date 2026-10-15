import java.util.Scanner;
public class SumOfOddNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Please Enter Positive Number");
        } else {
            long k = (n + 1L) / 2;
            long sum = k * k;
            System.out.println("Sum = " + sum);
        }

        sc.close();
    }
}
