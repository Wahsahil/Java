class spiral {
   void sp(int arr[][])
   {
      int strow = 0;
      int stcol = 0;
      int erow = arr.length-1;
      int ecol = arr[0].length-1;
      while(strow<=erow && stcol <=ecol)
      {
         for(int j =stcol;j<=ecol;j++)
         {
            System.out.print(arr[strow][j]+" ");
         }
         for(int i=strow+1;i<=erow;i++)
         {
            System.out.print(arr[i][ecol]+" ");
         }
         for(int j = ecol-1;j>=stcol;j--)
         {
            if(strow==erow)
            {
               break;
            }
            System.out.print(arr[erow][j]+" ");
         }
         for(int i = erow-1;i>=strow+1;i--)
         {
            if(stcol==ecol)
            {
               break;
            }
            System.out.print(arr[i][stcol]+" ");

         }
         stcol++;
         strow++;
         ecol--;
         erow--;
      }
      System.out.println();
      
   }
   public static void main(String sahil[]) 
   {
      spiral obj = new spiral();
      int arr[][] = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                    };
      obj.sp(arr);
   }
}
