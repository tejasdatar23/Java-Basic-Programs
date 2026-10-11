import java.util.Scanner;
public class PassOrFail {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Marks: ");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100)
        {
            System.out.println("Invalid Marks");
        }
        else if(marks >= 40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }

        sc.close();
    }
}
