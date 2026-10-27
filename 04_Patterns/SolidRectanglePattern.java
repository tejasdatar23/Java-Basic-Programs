import java.util.Scanner;
public class SolidRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Number of columns: ");
        int cols = sc.nextInt();
        
        if(rows <= 0 || cols <= 0) {
            System.out.println("Rows and Columns must be positive");
        } else {

            for(int i = 1; i <= rows; i++) {
               for(int j = 1; j <= cols; j++) {
                   System.out.print("* ");
               }

                   System.out.println();
            }
        }

        sc.close();
           
    }

}
