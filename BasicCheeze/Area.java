package Basic_cheeze;
import java.util.Scanner;

public class Area {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Radius:");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.print("Area is: ");
        System.out.println(a);

    }
}
