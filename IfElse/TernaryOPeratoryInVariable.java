package If_Else;
import java.util.Scanner;
public class TernaryOPeratoryInVariable {
    static void main() {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sb.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (i + 64) + " ");
                } else {
                    System.out.print((char) (i + 96) + " ");
                }
            }
            System.out.println();

        }
    }}
