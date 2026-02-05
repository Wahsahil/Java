import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
class inbuildsort {
   void sort(int arr[]) 
   {
      
   }
   
   void printarray(Integer arr[])
   {
      for(int i =0;i<arr.length;i++)
      {
         System.out.print(" "+arr[i]);
      }
   }

   public static void main(String args[]) {

      Integer arr[] = { 5, 4, 1, 3, 2 };
      inbuildsort obj = new inbuildsort();
      // obj.sort(arr);
      //Arrays.sort(arr, Collections.reverseOrder());
      
      obj.printarray(arr);


   }
}
