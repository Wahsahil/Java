
class opbubblesort {
    void bubble(int arr[])
    {
        int tswap = 0;
        for(int i =0;i <arr.length-1;i++)
        {
            boolean swapp = false;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapp = true;
                    tswap++;
                    
                }
            }
            if(swapp == false)
                {
                    break;
                }
        }
       for(int i = 0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }
        System.out.println();

       System.out.print("Total Swap : "+tswap);
    }
    

    public static void main(String args[]) {
        
        int arr[] = { 1,2,3,4,5};
       opbubblesort obj = new opbubblesort();
       obj.bubble(arr);
        
    }
}
