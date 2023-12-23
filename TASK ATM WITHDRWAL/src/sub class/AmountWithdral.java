import java.util.Scanner;

public class AmountWithdral {

    public boolean amountWithdrawal(){
        int i = 0;
        boolean flag = false;
        while (i < 3) {
            System.out.println("Enter the Amount in 100s");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if (!(n >99 && n%100==0)) {
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
