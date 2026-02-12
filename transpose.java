class transpose {
   void tran(int arr[][])
   {
      int row =arr.length;
      int col =arr[0].length;
      int tra[][]=new int[col][row];
      for(int i=0;i<row;i++)
      {
         for(int j=0;j<col;j++)
         {
            tra[j][i] = arr[i][j];

         }
         
      }
      for(int i = 0; i < col; i++) 
      {
         for(int j = 0; j < row; j++) 
         {
            System.out.print(tra[i][j] + " ");
         }
         System.out.println();
      }

   }
   public static void main(String sahil[]) 
   {
      transpose obj = new transpose();
      int arr[][] = {{1,2,3},
                     {5,6,7},
                     {9,10,11},
                    };
      obj.tran(arr);
   }
}
