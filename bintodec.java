import java.util.*;
class bintodec
{
    void bin(int bnum)
    {
        int pow=0;
        int dec=0;
        System.out.print("Decimal of : "+bnum);

        while(bnum>0)
        {
            int lastdigit =bnum%10;
            dec = dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            bnum=bnum/10;
        }
        System.out.print(" = "+dec);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Binary number : ");
        int n = sc.nextInt();
        bintodec ob = new bintodec();
        ob.bin(n);

    }
}
