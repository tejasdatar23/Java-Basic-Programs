import java.util.Scanner;
public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        long num = Math.abs((long)n);
        int smallest = 9;
        if(num == 0) {
            smallest = 0;
        } else {
            while(num > 0) {
               int digit =(int) (num % 10);
               if(digit < smallest) {
                    smallest = digit;
               }
            num /= 10;
            }
        }

        System.out.println("Smallest Digit = " + smallest);

        sc.close();
    }
}
