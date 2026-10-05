import java.util.Scanner;
public class SimpleInterest {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Principal Value: ");
    int principal = sc.nextInt();

    System.out.println("Enter Rate of Interest: ");
    int rate = sc.nextInt();

    System.out.println("Enter Time of Interest: ");
    int time = sc.nextInt();

    int simpleInterest = (principal * rate * time)/100;

    System.out.println("Simple Interest: " + simpleInterest);
    
    sc.close();
  }  
}
