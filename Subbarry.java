
class Subbarry {
    void subarr(int a [][],int b [][],int row,int cols)
    {
        int sum[][] = new int [row][cols];
        for(int i =0;i<row;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                sum[i][j]=a[i][j]-b[i][j];
            }
        }
         System.out.println("Resultant Matrix:");
        for (int i = 0; i < row; i++)
         {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
         }
    }
   
    public static void main(String[] args) 
    {
        Subbarry ob = new Subbarry();
         int a[][]={{2,3},{4,5}};
         int b[][]={{1,2},{3,4}};
         ob.subarr(a, b, 2, 2);        
    }
}
