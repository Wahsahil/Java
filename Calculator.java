import java.util.*;
class Calculator 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First value : " );
        int a = sc.nextInt();
        System.out.print("Enter the Second value : " );
        int b = sc.nextInt();
        System.out.print("Choose the operator to perform operation on = +, -, *, /, %   " );
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("My calculator is not that smart to solve it");

        }
    }
}
