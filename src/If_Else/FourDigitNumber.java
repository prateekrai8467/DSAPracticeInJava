package If_Else;
import java.util.Scanner;
public class FourDigitNumber {
    static void main() {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter a Number");
        int n = sb.nextInt();

        if (n>999 && n<10000){
            System.out.println("4 Digit Number");}
        else
            System.out.println("Not a 4 Digit Number");
    }

}
