import java.util.Scanner;

public class AtmValidation implements Inter {

    Scanner sc= new Scanner(System.in);
    public boolean cardDetails(){
        System.out.println("Enter 16 Digit ATM CARD NUMBER");

        long cn=sc.nextLong();
        int n=(int)(Math.log10(cn)+1);
//        System.out.println(n);
        if(n==16 && cn%2!=0){

            return true;
        }
        else {
            return false;
        }
    }

    public boolean amountWithdrawal(){
        int i = 0;
        boolean flag = false;
        while (i < 3) {
            System.out.println("Enter the Amount in 100s");
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


    public boolean pinNumber() {
        int i = 0;
        boolean flag = false;
        while (i < 3) {
            System.out.println("Enter the PIN Number");
            int n = sc.nextInt();
//            int pnv = (int) (Math.log10(n) + 1);
            if (n<999 || n>10_000) {
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
