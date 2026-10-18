import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Please enter positive number");
        } else {
            int original = n;
            int temp = n;
            int digits = 0;
            long sum = 0;

            // Count the digits
            do {
                digits++;
                temp /= 10;
            } while(temp > 0);
                temp = n;

                // Calculate the sum of powered digits

                do {
                    int digit = temp % 10;
                    sum +=(long) Math.pow(digit,digits);
                    temp /= 10;
                } while(temp > 0);       
                 
                if(sum == original) {
                    System.out.println("Armstrong Number");
                } else {
                    System.out.println("Not Armstrong Number");
                  }
                    
                    
           }

           sc.close();
    }
}
