class msubarray {
    void subarray(int arr[]) {
        int maxSum = Integer.MIN_VALUE; 
        int minSum = Integer.MAX_VALUE; 
        for (int i = 0; i < arr.length; i++) {

            int start = i;
            

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int end = j;

                for (int k = start; k <= end; k++) 
                {
                    sum += arr[k];
                }
                System.out.println(sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
        }
        System.out.println("Min sum "+ " = " + minSum);
        System.out.println("Max sum "+" = " + maxSum);
    }

    public static void main(String[] args) {
        msubarray ob = new msubarray();
        int arr[] = {1, -2, 6, -1, 3};
        ob.subarray(arr);
    }
}
