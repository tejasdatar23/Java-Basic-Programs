import java.util.Scanner;
public class ScholarshipEligibility{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage : ");
        double percentage = sc.nextDouble();

        System.out.println("Enter Anual Family Income : ");
        double FI = sc.nextDouble();

        if(percentage >= 70 && FI <= 250000)
        {
            System.out.println("Eligible for Scholarship");
        }
        else
        {
            System.out.println("Not Eligible for Scholarship");
        }

        sc.close();
    }
}