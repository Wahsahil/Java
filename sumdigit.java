class sumdigit
{
    public static void main(String args[])
    {
        int n = 12345;
        int sum = 0;
        int rev=0;
        int ls ;
        while(n>0)
        {
            ls = n%10;
            sum = ls+sum;
            rev = rev*10+ls;
            n= n/10;
        }
        System.out.println("Sum of all the digit  is : "+sum);
        System.out.print("Reverse of all the digit is : "+rev);
    }
}