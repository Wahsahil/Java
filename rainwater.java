
class rainwater {
    int traprainwater (int arr[])
    {
        int n = arr.length;
        int waterlevel = 0;
        int left[]= new int[n];
        left[0]=arr[0];
        for(int i =1;i<n;i++)
        {
            left[i] = Math.max(arr[i],left[i-1]);
        }
        int right[]= new int[n];
        right[n-1]=arr[n-1];
        for(int i =n-2;i>=0;i--)
        {
            right[i] = Math.max(arr[i],right[i+1]);
        }
        int trapped =0;
        for(int i=0;i<n;i++)
        {
             waterlevel = Math.min(left[i],right[i]);
            trapped += waterlevel -arr[i];
        }
        return trapped;
    }
    public static void main(String args[])
    {
        int arr[] = {4,2,0,6,3,2,5};
        rainwater obj = new rainwater();
        System.out.print("Trapped Rainwater is : "+obj.traprainwater(arr));
       
    }
}
