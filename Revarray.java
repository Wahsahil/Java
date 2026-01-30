import java.util.*;
class Revarray 
{
    void arin(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void sort(int arr[])
    {
        int start=0;
        int end = arr.length - 1;
        while(start<end)
        {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start ++;
            end--;
        }
    }
    
    
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        
        System.out.println("Enter the Elements of the array in ascending order : ");
        Revarray ob = new Revarray();
        ob.arin(arr);
        System.out.println("Before Reverse");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        ob.sort(arr);
        System.out.println("After Reverse");
         for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
         
        
    }
}
