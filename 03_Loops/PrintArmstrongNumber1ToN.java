import java.util.Scanner;
public class PrintArmstrongNumber1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Please Enter Positive number");
        } else {
            for(int i = 1; i <= n; i++){
                int temp = i;
                int digits = 0;
                long sum = 0;
               do {
                   digits++;
                   temp /= 10;
               } while(temp > 0);
            
               temp = i;

               do {
                  int digit = temp % 10;
                  sum += (long) Math.pow(digit,digits);
                  temp /= 10;
               } while(temp > 0);

                if(sum == i) {
                   System.out.println(i);
                }
           }
        }

        sc.close();
    }
}
