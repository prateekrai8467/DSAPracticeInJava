package If_Else;
import java.util.Scanner;
public class Profit_loss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cp : ");
        int cp = sc.nextInt();
        System.out.println("Enter sp :");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("Profit is"+(sp-cp) );
        }
        else if(sp<cp) {
            System.out.println("Loss is" + (cp - sp));
        }else
        System.out.println("No Profit No Loss"+(sp=cp));

    }
}
