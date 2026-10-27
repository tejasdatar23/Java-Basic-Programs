import java.util.Scanner;
public class MirroredRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = sc.nextInt();

        if(rows <= 0) {
            System.out.println("Rows must be positive");
        } else {
            for(int i = 1; i <= rows; i++) {
                for(int j = 1; j <= rows; j++) {
                    if(j <= rows - i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
