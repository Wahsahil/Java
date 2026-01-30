
class TWODadd {
    void addarr(int a [][],int b [][],int row,int cols)
    {
        int sum[][] = new int [row][cols];
        for(int i =0;i<row;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
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
        TWODadd ob = new TWODadd();
         int a[][]={{1,2},{3,4}};
         int b[][]={{1,2},{3,4}};
         ob.addarr(a, b, 2, 2);        
    }
}
