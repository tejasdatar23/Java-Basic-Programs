import java.util.Scanner;
public class ReverseNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Rows must be positive");
        } else {
            for(int i = 1; i <= n; i++) {
                for(int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
