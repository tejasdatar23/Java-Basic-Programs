import java.util.Scanner;
public class PointOnAxis {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X and Y cordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x == 0 && y == 0)
        {
            System.out.println("Origin");
        }
        else if(x == 0)
        {
            System.out.println("On Y axis");
        }
        else if(y == 0)
        {
            System.out.println("On x axis");
        }
        else if(x > 0 && y > 0)
        {
            System.out.println("First Quadrant");
        }
        else if(x < 0 && y > 0)
        {
            System.out.println("Second Quadrant");
        }
        else if(x < 0 && y < 0)
        {
            System.out.println("Third Quadrant");
        }
        else
        {
            System.out.println("Fourth Quadrant");
        }

        sc.close();
    }
}
