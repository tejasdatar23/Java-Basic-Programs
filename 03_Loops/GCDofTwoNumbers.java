import java.util.Scanner;
public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        if(num1 == 0 && num2 == 0) {
            System.out.println("GCD is undefined for 0 and 0");
        } else {
            long a = Math.abs((long) num1);
            long b = Math.abs((long) num2);

            long min = Math.min(a,b);
            long gcd = 1;

            for(int  i = 1; i <= min; i++) {
                if(a % i == 0 && b % i == 0) {
                        gcd = i;
                    }
                }
                System.out.println("GCD of two number = " + gcd);
            }

                sc.close();

    }
}
