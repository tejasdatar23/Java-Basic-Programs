import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of terms: ");
        int n = sc.nextInt();
        
        if(n < 0) {
            System.out.println("Please enter a non-negative number");
        } else {

    
           long first = 0;
           long second = 1;

           for(int i = 1; i <= n; i++) {
                System.out.println(first + " ");

                long next = first + second;

                first = second;
                second = next;
           }
        }

        sc.close();

    }
}
