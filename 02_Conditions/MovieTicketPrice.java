import java.util.Scanner;
public class MovieTicketPrice {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person Age: ");
        int age = sc.nextInt();

        if(age < 0)
        {
            System.out.println("Invalid Age");
        }
        else if(age < 5)
        {
            System.out.println("Ticket Price = Free");
        }
        else if(age <= 12)
        {
            System.out.println("Ticket Price = 100");
        }
        else if(age < 60)
        {
            System.out.println("Ticket Price = 200");
        }
        else
        {
            System.out.println("Ticket Price = 120");
        }

        sc.close();

    }
}
