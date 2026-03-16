import java.util.Scanner;

public class CheckOut {
    static void main() {
        double price;
        double total=0;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {

            price = SafeInput.getRangedDouble(in,"Enter the price of your item",.5,10);
            total += price;
            System.out.printf("Total: %.2f",total);
            in.nextLine();
            System.out.println();
            done = SafeInput.getYNConfirm(in,"Are you finished");
        } while (!done);

    }
}
