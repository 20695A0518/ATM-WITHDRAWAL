public class Main{
    public static void main(String[] args) {
    AtmValidation av=new AtmValidation();
//        System.out.println(cv.cardDetails()); //1234567890123455
        if(av.cardDetails()){
            if(av.pinNumber()){
//                System.out.println("Successfull");
                if(av.amountWithdrawal()){
                    System.out.println("Successfully withdrawn");
                    System.out.println("Exit");
                }
                else {
                    System.out.println("Exceeded PIN Attempts");
                    System.out.println("Exit");
                }
            }
            else {
                System.out.println(" CARD IS BLOCKED");
            }
        }
        else{
            System.out.println("Enter the CORRECT 16 DIGITS ATM CARD NUMBER");
        }

    }
}