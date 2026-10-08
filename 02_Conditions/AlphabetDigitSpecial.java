import java.util.Scanner;
public class AlphabetDigitSpecial {
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Character: ");
    char ch = sc.next().charAt(0);

    if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' )
    {
        System.out.println("Character is a Alphabet");
    }
    else if(ch >= '0' && ch <= '9')
    {
        System.out.println("Character is a Digit");
    }
    else
    {
        System.out.println("Character is a Special Character");
    }

    sc.close();
   } 
}
