import java.util.Scanner;
public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        long num = Math.abs((long)n);

        while(num >= 10){
            num /= 10;
        }

        System.out.println("First Digit = " + num);

        sc.close();
    }
}
