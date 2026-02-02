
class kadanemax {
    void kadanes(int arr[])
    {
       int ms = Integer.MIN_VALUE;
       int cs= 0;
       int maxn = Integer.MIN_VALUE;
       for(int i =0;i<arr.length;i++)
       {
        if(arr[i]<0)
        {
            maxn =Math.max(maxn, arr[i]);
        }
          cs = cs+arr[i];
          if(cs<0)
          {
            cs =0;
          }
          ms = Math.max(cs, ms);
           if(ms == 0 && maxn < 0)
       {
           ms = maxn;
       }
       }
       System.out.print("Our Max Subarry Sum is : "+ms);
    }

    public static void main(String args[])
    {
        int arr[] = {1, -2, 6, -1, 3};
        kadanemax obj = new kadanemax();
        obj.kadanes(arr);
    }
}
