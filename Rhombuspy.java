import java.util.*;
public class Rhombuspy 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter teh value of N : ");
        int n =sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
