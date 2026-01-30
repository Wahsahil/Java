import java.util.*;


class RevStrarr 
{
        public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=sc.nextInt();
        sc.nextLine();
        String a []=new String [size];
        System.out.println("Enter Name acc to size ");
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextLine();
        }

        for (int i = 0; i < a.length; i++) 
        {
            String s1 = a[i];
            System.out.print("["); 

            for (int j = s1.length() - 1; j >= 0; j--) {
                System.out.print(s1.charAt(j)); 
            }

            System.out.println("]"); 
        }
        

    }
}
