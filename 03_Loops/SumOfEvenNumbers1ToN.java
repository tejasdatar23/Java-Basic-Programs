import java.util.Scanner;
public class SumOfEvenNumbers1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Please Enter Positive Number");
        } else {
            long k = n / 2L;
            long sum = k * (k + 1);
            System.out.println("Sum = " + sum);
            }

            sc.close();
            
        }
}
