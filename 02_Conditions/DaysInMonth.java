import java.util.Scanner;
public class DaysInMonth {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month(1 to 12): ");
        int month = sc.nextInt();

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        if(month <= 0 || month > 12 || year <= 0)
        {
            System.out.println("Invalid Month or year");
        }
        else
        {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                     System.out.println("31 Days");
                    
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days");

                    break;

                case 2:
                    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        {
                            System.out.println("29 Days");
                        }   
                    else
                    {
                        System.out.println("28 Days");
                    }
            
                    break;
            }
            sc.close();
        }
    }
}
