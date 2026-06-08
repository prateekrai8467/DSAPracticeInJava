package Basic_cheeze;
import java.util.Scanner;
public class Simple_interest {
    static void main() {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the value of Principal: ");
        int p =x.nextInt();
        System.out.print("Enter the value of rate");
        int r = x.nextInt();
        System.out.print("Enter the of time:");
        int t = x.nextInt();
        double si = p*r*t/100;
        System.out.print("The Simple Interest is Equal to: ");
        System.out.println(si);

    }
}
