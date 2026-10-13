import java.util.Scanner;
public class ShoppingDiscount {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Shopping Amount: ");
        double amount = sc.nextDouble();

        double discountRate;
        double discount;
        double finalBill;

        if(amount < 0)
        {
            System.out.println("Invalid shopping amount");
        }
        else if(amount < 1000)
        {
            discountRate = 0;
            discount = amount * discountRate / 100;
            finalBill = amount - discount;

            System.out.println("No Discount");
            System.out.println("Final Bill = " + finalBill);
        }
        else if(amount < 3000)
        {
            discountRate = 10;
            discount = amount * discountRate / 100;
            finalBill = amount - discount;

            System.out.println("Discount = " + discount);
            System.out.println("Final Bill = " + finalBill);
        }
        else if(amount < 5000)
        {
            discountRate = 15;
            discount = amount * discountRate / 100;
            finalBill = amount - discount;

            System.out.println("Discount = " + discount);
            System.out.println("Final Bill = " + finalBill);
        }
        else
        {
            discountRate = 20;
            discount = amount * discountRate / 100;
            finalBill = amount - discount;

            System.out.println("Discount = " + discount);
            System.out.println("Final Bill = " + finalBill);
        }

        sc.close();

        
    }
}
