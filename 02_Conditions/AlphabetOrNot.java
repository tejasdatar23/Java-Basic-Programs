import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            System.out.println("Character is Alphabet");
        }
        else
        {
            System.out.println("Character is not Alphabet");
        }

        sc.close();
    }
}
