import java.util.Scanner;
public class DivisibleBy2And3 {
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int num = sc.nextInt();

    if(num % 2 == 0 && num % 3 == 0)
    {
        System.out.println("Number is divisible by both 2 and 3 ");
    }
    else
    {
        System.out.println("Number is not divisible by both 2 and 3 ");
    }

    sc.close();
   } 
}
