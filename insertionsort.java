
class insertionsort {
    void insertsort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int cur = arr[i];
            int pre = i-1;
            while(pre>=0 && arr[pre]>cur)
            {
                arr[pre+1] = arr[pre]; 
                pre--;
            }
            arr[pre+1] = cur;
        }
        
       for(int i = 0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }
    }
    

    public static void main(String args[]) {
        
        int arr[] = { 5,4,1,3,2};
       insertionsort obj = new insertionsort();
       obj.insertsort(arr);
        
    }
}
