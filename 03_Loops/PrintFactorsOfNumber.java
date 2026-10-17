import java.util.Scanner;
public class PrintFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Please enter positive number");
        } else {
            System.out.println("Factors of " + n + " are: ");
            for(int i = 1; i <= n / i; i++) {
                if(n % i == 0) {
                    System.out.print(i + " ");

                    int pairedFactore = n / i;

                    if(pairedFactore != i) {
                        System.out.print(pairedFactore + " ");
                    }
                }
            
            }

            System.out.println();
        }

        sc.close();
    }
}
