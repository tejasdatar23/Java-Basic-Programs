import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five Subjects Marks: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        if(sub1 < 0 || sub1 > 100 || sub2 < 0 || sub2 > 100 ||
            sub3 < 0 || sub3 > 100 || sub4 < 0 || sub4 > 100 ||
            sub5 < 0 || sub5 > 100)
            {
                System.out.println("Invalid Marks");
            }
        else{
        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        double percentage = (total / 500.0) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if(percentage >= 35)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }

        sc.close();
        
    }
}
