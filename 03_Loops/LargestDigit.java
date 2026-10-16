import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        long num = Math.abs((long)n);     
         int largest = 0;
        while(num > 0){
            int digit =(int) (num % 10);
            if(digit > largest) {
                 largest = digit;
            }
            num = num / 10;
    
        }

        System.out.println("Largest Digit = " + largest);

        sc.close();

    }
}
