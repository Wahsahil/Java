import java.util.*;
class Largearray 
{
    void arin(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void arraylarge(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Now Max is  "+max);
        System.out.println("Now Min is  "+min);
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
            if(min>arr[i])
            {
                min = arr[i];
            }

        }
        System.out.println("The Largest number among the array is : "+max);
        System.out.println("The Smallest number among the array is : "+min);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        Largearray ob = new Largearray();
        ob.arin(arr);
         for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        ob.arraylarge(arr);
       
        
    }
}
