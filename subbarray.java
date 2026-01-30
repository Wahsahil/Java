class subbarray {
    void subarray(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            int maxSum = Integer.MIN_VALUE;
            int minSum = Integer.MAX_VALUE;
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }

                System.out.print(" Sum is : " + sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }

                System.out.println();
            }
            System.out.println("Minimum subarray sum = " + minSum);
            System.out.println("Maximum subarray sum = " + maxSum);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        subbarray ob = new subbarray();
        int arr[] = {2, 4, 6, 8, 10};
        ob.subarray(arr);
    }
}
