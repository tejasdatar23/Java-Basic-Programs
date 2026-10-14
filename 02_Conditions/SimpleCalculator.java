import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter Second Number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter Operator(+,-,*,/,%): ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                
                break;
            
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
           
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
               
            case '/':
                if(num2 == 0)
                {
                    System.out.println("Cannot divided by zero");
                }
                else
                {
                    System.out.println("Result = " + (num1 / num2));
                }
                break;

            case '%':
                if(num2 == 0)
                {
                   System.out.println("Cannot calculate remainder with zero");
                } 
                else
                {
                   System.out.println("Result = " + (num1 % num2));
                }  

                break;
                
                     

            default:
                {
                    System.out.println("Invalid Operator");
                }
            }

            sc.close();
   }
}
