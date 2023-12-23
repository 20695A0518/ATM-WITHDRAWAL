import java.util.Scanner;

public class PinValidation {
    public boolean pinNumber() {
        int i = 0;
        boolean flag = false;
        while (i < 3) {
            System.out.println("Enter the PIN Number");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int pnv = (int) (Math.log10(n) + 1);
            if (n != 4321 || pnv != 4) {
                System.out.println("Try Again");
                i++;
            } else {
                flag=true;
                break;
            }

        }

        if (flag) {
            return flag;
        } else {
            return flag;
        }
    }
}
