package If_Else;
import java.util.Scanner;
public class IsInteger {
    static void main() {
        Scanner sb =new Scanner(System.in);
//        System.out.print(" Enter number");
//        double n= sb.nextDouble();
//        if(n==(int)n){
//            System.out.println("Is an Integer");
//        }else
//            System.out.println("Not an integer");
        System.out.print("Enter Number:");
        double n = sb.nextDouble();
        int x = (int)n;
        if (n-x >0){
            System.out.println("not an integer");
        }else
            System.out.println("Is an integer");
    }
}
