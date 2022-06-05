public class main {
    public static void main(String[] args) {
        double creditCardBalance = 5000;
        double INTEREST_RATE = 0.17;

        double interestDueAfterOneMonth = creditCardBalance * (INTEREST_RATE);
        double interestDueAfterTwoMonths = (creditCardBalance + interestDueAfterOneMonth) * INTEREST_RATE;
    
        System.out.println("The interest due after one month is " + interestDueAfterOneMonth + " dollars.");
        System.out.println("The interest due after two months is " + interestDueAfterTwoMonths + " dollars.");
    }
}
