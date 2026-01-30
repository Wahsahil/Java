import java.util.*;
class Weekday 
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number from 1-7 : ");
     int num = sc.nextInt();
     switch(num){
        case 1 : System.out.print("Monday");
                 break;
        case 2 : System.out.print("Tuesday");
                 break;

        case 3 : System.out.print("Wednesday");
                 break;

        case 4 : System.out.print("Thursday");
                 break;

        case 5 : System.out.print("Friday");
                 break;

        case 6 : System.out.print("Saturday");
                 break;
        case 7 : System.out.print("Sunday");
                 break;
        default : System.out.print("You might have entered number less than zero or greater than 7");
     }


    }
}
