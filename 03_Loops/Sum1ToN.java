import java.util.Scanner;
public class Sum1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Posittive Number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Please Enter Positive Number");
        } else {
            int sum = 0;
            for(int i = 1; i <= n; i++){
                 sum += i;
            }
             System.out.println(sum);
        }

        sc.close();
    }
}
