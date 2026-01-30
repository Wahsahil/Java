import java.util.*;
class Reversenum
{
    public static void main(String args [])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int rev=0;
        int lastdigit=0;
        for(int i=0;n>0;i++)
        {
            lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        System.out.print("Reverse of the number is : "+rev);
    }
}
