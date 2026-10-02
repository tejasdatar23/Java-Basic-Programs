import java.util.Scanner;
public class ASCIIValue{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        int ascii = ch;

        System.out.println("Ascii value of " + ch + " = " + ascii);

        sc.close();

    }
}