import java.util.*;
class dectobin
{
    void dbin(int dnum)
    {
        int pow = 0;
        int bnum = 0;
        System.out.print(" Binary of : "+dnum);
        while(dnum>0)
        {
            int rem=dnum%2;
            bnum=bnum+rem*(int)Math.pow(10, pow);
            pow ++;
            dnum = dnum/2;

        }
        System.out.print(" = "+bnum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number : ");
        int dnum= sc.nextInt();
        dectobin ob = new dectobin();
        ob.dbin(dnum);
    }
}
