import java.util.Scanner;
public class PrintEvenNumbers1ToN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Please Enter Positive Number");
        }
        else{
             for(int i = 2; i <= n; i += 2){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
