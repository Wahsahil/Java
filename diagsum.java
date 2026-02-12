class diagsum {
   int disum(int arr[][])
   {
      int sum =0;
      
      for(int i=0;i<arr.length;i++)
      {
         sum+=arr[i][i];
         if(i!=arr.length-1-i)
         {
            sum+=arr[i][arr.length-i-1];
         } 
      }
      return sum;
   }
   public static void main(String sahil[]) 
   {
      diagsum obj = new diagsum();
      int arr[][] = {{1,2,3},
                     {5,6,7},
                     {9,10,11},
                    };
      System.out.print("Diagonat sum is "+obj.disum(arr));
   }
}
