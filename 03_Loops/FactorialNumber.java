import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Factorial is not difine for negative integer");
        } else if(n > 20) {
            System.out.println("Result is to larg for long");
        } else {

             long fact = 1;

             for(int i = 1; i <= n; i++) {
                fact = fact * i;
             }
             System.out.println("Factorial = " + fact);
       }

        sc.close();
    }
}
