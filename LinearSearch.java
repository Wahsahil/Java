import java.util.*;
class LinearSearch 
{
    void arrinput(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    int search(int arr[],int key)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(key==arr[i])
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
        int arr[]=new int[n];
        LinearSearch ob = new LinearSearch();
        ob.arrinput(arr);
         System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        System.out.print("Enter a number from the above to know its index : ");
        int key=sc.nextInt();
        int result =ob.search(arr, key);
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
