import java.util.*;
class BinSearch 
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

    }
    int binarysearch (int arr[],int n,int key)
    {
        int start = 0;
        int end =arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end =mid-1;
            }
        }
        return -1;
    }
    
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        
        System.out.println("Enter the Elements of the array in ascending order : ");
        BinSearch ob = new BinSearch();
        ob.arin(arr);
         for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
         System.out.print("Enter the Number from the above array to know its index : ");
        int key=sc.nextInt();
        int result = ob.binarysearch(arr, n, key);

        if(result == -1)
        {
             System.out.println("Number not found in the array");
        }       
        else
        {
             System.out.println("The number is at index : " + result);
        }
    }
}
