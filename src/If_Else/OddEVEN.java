package If_Else;
import java.util.Scanner;

public class OddEVEN {
    static void main() {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sb.nextInt();
        if (n%2 == 0)
            System.out.println("Even Number ");
        else System.out.println("Odd Number ");
    }
}
