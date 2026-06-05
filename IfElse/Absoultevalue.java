package If_Else;
import java.util.Scanner;
public class Absoultevalue {
    static void main() {
        System.out.println("Enter Number :");
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        if (n < 0) {
            n = -n;
            System.out.println(n);
        } else
            System.out.println(n);
    }
}
