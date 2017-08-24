/**
 * Created by magn on 8/18/2017.
 */
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccountFacade newAccout = new BankAccountFacade(1234567,12345);


        newAccout.initialDepo(1000);

        newAccout.withdrawCash(100);

        newAccout.depositCash(10);

        newAccout.checkBalance();
        newAccout.withdrawCash(920);
        newAccout.checkBalance();
        newAccout.depositCash(10000);
        newAccout.checkBalance();
    }
}
