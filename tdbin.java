import java.util.*;

class tdbin {
   boolean bintd(int arr[][], int key) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == key) {
               System.out.print("Key found at (" + i + "," + j + ")");
               return true;
            }
         }
      }
      System.out.print("Key not found ");
      return false;

   }

   void print(int arr[][]) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static void main(String args[]) {
      tdbin obj = new tdbin();
      Scanner sc = new Scanner(System.in);
      int key = 9;
      int arr[][] = new int[3][3];
      int n = arr.length, m = arr[0].length;
      System.out.println("Enter the value in array");
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            arr[i][j] = sc.nextInt();
         }
      }
      obj.print(arr);
      obj.bintd(arr, key);

   }
}
