
class stocks {
    int bsstock(int price[])
    {
        int buy = Integer.MAX_VALUE;
        int maxp = Integer.MIN_VALUE;
        for(int i =0;i<price.length;i++)
        {
            if(buy<price[i])
            {
                int profit = price[i]-buy;
                maxp = Math.max(maxp,profit);
            }
            else
            {
                buy = price[i];
            }
        }
        return maxp;
    }
    public static void main(String args[])
    {
        stocks obj = new stocks();
        int price[] = {7,1,5,3,6,4};
       System.out.print("Profit is : "+obj.bsstock(price));
    }
}
