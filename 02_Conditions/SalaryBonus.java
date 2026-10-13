import java.util.Scanner;
public class SalaryBonus {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter years of service: ");
        int years = sc.nextInt();
         
        double bonus;
        if(salary <= 0 || years <= 0)
        {
            System.out.println("Invalid Input");
        }
        else if(years >= 10)
        {
            bonus = salary * 10 / 100;

            System.out.println("Bonus = " + bonus);
            System.out.println("Total Salary = " + (salary + bonus));
        }
        else if(years >= 5)
        {
             bonus = salary * 5 / 100;

            System.out.println("Bonus = " + bonus);
            System.out.println("Total Salary = " + (salary + bonus));
        }
        else
        {
             bonus = salary * 0 / 100;

            System.out.println("No Bonus");
            System.out.println("Total Salary = " + (salary + bonus));
        }

        sc.close();
    }
}
