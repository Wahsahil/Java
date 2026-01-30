import java.util.*;
class Reversepnum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
      int lastdigit = 0;
      for(int i =0;n>0;i++){
        lastdigit=n%10;
        System.out.print(lastdigit+" ");
        n=n/10;
      }
    }
}
