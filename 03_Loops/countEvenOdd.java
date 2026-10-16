import java.util.Scanner;
public class countEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        long num = Math.abs((long)n);
        int evenCount = 0;
        int oddCount = 0;
        do{
            int digit = (int) (num % 10);
            
            if(digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num /= 10;
        }while(num > 0);

        System.out.println("Even Digits = " + evenCount);
        System.out.println("Odd Digits = " + oddCount);

        sc.close();
    }
}
