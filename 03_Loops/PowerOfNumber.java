import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = sc.nextInt();

        System.out.print("Enter Exponent: ");
        int exponent = sc.nextInt();

        if(exponent < 0) {
            System.out.println("Please Enter non-negative value");
        } else {
            long result = 1;

            for(int i = 0; i < exponent; i++) {
                result = result * base;
            }

            System.out.println("Power = " + result);
        }

        sc.close();

    }
}
