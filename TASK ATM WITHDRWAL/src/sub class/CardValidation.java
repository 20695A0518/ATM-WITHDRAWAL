import java.util.Scanner;

public class CardValidation {

    public boolean cardDetails(){
        System.out.println("Enter 16 Digit ATM CARD NUMBER");
        Scanner sc= new Scanner(System.in);
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

}
