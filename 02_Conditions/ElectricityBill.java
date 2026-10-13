import java.util.Scanner;
public class ElectricityBill {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units: ");
        int units = sc.nextInt();
        
        int bill = 0;

        if(units < 0)
        {
            System.out.println("Invalid Units");
        }
        else if(units <= 100)
        {
            bill = units * 5;
            System.out.println("Electricity Bill = Rs. " + bill);
        }
        else if(units <= 200)
        {
            bill = (100 * 5) + (units - 100) * 7;
            System.out.println("Electricity Bill = Rs. " + bill);      
        }
        else if(units <= 300)
        {
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
            System.out.println("Electricity Bill = Rs. " + bill);
        }
        else
        {
            bill = (100 * 5) + (100 * 7) + (100 * 10) + (units - 300) * 15;
            System.out.println("Electricity Bill = Rs. " + bill);
        }
        sc.close();
    }
}
