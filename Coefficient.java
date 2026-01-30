import java.util.*;

class Coefficient
{
    int  fact(int n)
    {
        int fact=1;
        for(int i =1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N  : ");
        int n = sc.nextInt();
         System.out.print("Enter the value of R  : ");
         int r = sc.nextInt();
         int fact = 1;
         Coefficient ob = new Coefficient();
         int n_fact = ob.fact(n);
         int r_fact=ob.fact(r);
         int nmr_fact=ob.fact(n-r);
         int binomial_coef=n_fact/(r_fact*nmr_fact);
         System.out.println("Factorial of N is   : "+n_fact);
         System.out.println("Factorial of R is   : "+r_fact);
         System.out.println("Factorial of (N-R) is   : "+nmr_fact);
         System.out.println("Bonomial Coefficient is  : "+binomial_coef);

         

    }
}
