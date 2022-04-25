package HomeTaskBy25042022;

public class ProgramCreditCart {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        creditCard1.setAccount(321846952);
        creditCard1.setAmount(3784.2);
        System.out.println("Account of creditCard1 : " + creditCard1.getAccount() + " and its amount: " + creditCard1.getAmount());

        creditCard1.addAmount(1200.15);
        System.out.printf("Current account balance is %f", creditCard1.getAmount());
        System.out.println();

        CreditCard creditCard2 = new CreditCard();
        creditCard2.setAccount(245894004);
        creditCard2.setAmount(12374.5);
        System.out.printf("Account of creditCard2 : %d and its amount: %f", creditCard2.getAccount(), creditCard2.getAmount());
        System.out.println();

        creditCard2.addAmount(310.4);
        System.out.printf("Current account balance is %f", creditCard2.getAmount());
        System.out.println();

        CreditCard creditCard3 = new CreditCard();
        creditCard3.setAccount(348971011);
        creditCard3.setAmount(504.9);
        System.out.printf("Account of creditCard3 : %d and its amount: %f", creditCard3.getAccount(), creditCard3.getAmount());
        System.out.println();

        creditCard3.chargeAmount(100.0);
        System.out.printf("Current account balance is %f", creditCard3.getAmount());


    }
}
