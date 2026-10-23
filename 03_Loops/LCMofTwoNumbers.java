import java.util.Scanner;
public class LCMofTwoNumbers {
    public static long findGCD(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;   
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        long a = Math.abs((long) num1);
        long b = Math.abs((long) num2);

        if(a == 0 && b == 0) {
            System.out.println("LCM is undefined for 0");
        } else if(a == 0 || b == 0) {
            System.out.println("LCM = 0");
        } else {
            long gcd = findGCD(a, b);
            long lcm = (a / gcd) * b;

            System.out.println("LCM of two numbers = " + lcm);
        }

        sc.close();
    }
}
