import java.util.Scanner;

public class Reggie {
    static void main() {
        Scanner in = new Scanner(System.in);
        String SSN = SafeInput.getRegExString(in,"Enter your Social Security Number","^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is "+ SSN);
        String UC_ID = SafeInput.getRegExString(in,"Enter your UC ID","^(M|m)\\d{5}$");
        System.out.println("Your UC ID is "+ UC_ID);
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice [O, S, V, Q]", "^[OoSsVvQq]$");
        System.out.println("Your choice was "+ menuChoice);
    }
}
