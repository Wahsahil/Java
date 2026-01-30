import java.util.*;
class StLinearSearch 
{
    void arrinput(String srr[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<srr.length;i++)
        {
            srr[i]=sc.nextLine();
        }
    }
    int search(String srr[],String key)
    {
        for(int i =0;i<srr.length;i++)
        {
            if(key.equals(srr[i]))
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n=sc.nextInt();
        sc.nextLine();
        String srr[]=new String[n];
        StLinearSearch ob = new StLinearSearch();
        ob.arrinput(srr);
         System.out.print("[");
        for(int i=0;i<srr.length;i++)
        {
            System.out.print(srr[i]+",");
        }
        System.out.println("]");
        System.out.print("Enter a number from the above to know its index : ");
        String key=sc.nextLine();
        int result =ob.search(srr, key);
        if(result ==-1)
        {
            System.out.print("Key not found! ");
        }
        else 
        {
            System.out.print("Key  found at index "+result);

        }
        
    }
}
