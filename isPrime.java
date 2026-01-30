import java.util.*;
class isPrime 
{
    boolean prime(int n)
    {
        boolean isprime = true;
        for(int i = 2;i<=n-1;i++)
        {
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;  
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print(" Enter to check if it is prime or not : ");
       int n = sc.nextInt();
       isPrime ob=new isPrime();
       System.out.print(n+" is a prime number ? = "+ob.prime(n));
    }
}
