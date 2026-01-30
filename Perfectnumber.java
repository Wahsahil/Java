import java.util.*;
import javax.lang.model.util.ElementScanner14;
class Perfectnumber 
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n =sc.nextInt();
        int sum = 0;
        for(int i = 1;i<n;i++)
        {
          if(n%i == 0)
          {
            System.out.print(i+" ");
            sum= sum+i;
          }
        }
        System.out.println(); 
         if(sum==n)
          {
            System.out.println("Number :- "+n);
            System.out.print("It is a Perfect Number");
          }
          else
          {
            System.out.print("It is a not Perfect Number");

          }
      
    }
}
