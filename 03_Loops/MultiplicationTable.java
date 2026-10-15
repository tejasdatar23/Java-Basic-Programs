import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Please Enter Positive Number");
        } else {

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

        sc.close();
    }
}
