import java.util.Scanner;
class TriangleType{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Side of triangle: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
         
        if(a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || a + c <= b)
        {
             System.out.println("Invalid Triangle");
        }
        else if(a == b && b ==c)
        {
            System.out.println("Triangle Type = Equilateral");
        }
        else if(a == b || b == c || c == a)
        {
            System.out.println("Triangle Type = Isosceles");
        }
        else 
        {
            System.out.println("Triangle Type = Scalene");
        }

        sc.close();

    }
}