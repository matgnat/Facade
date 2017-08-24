/**
 * Created by magn on 8/18/2017.
 */
public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;
    public double accountBalance;

    WelcomBank welcome;
    AccountNumberCheck checkNumber;
    SecurityCodeCheck checkCode;
    FundOperation fundOperation;

    public BankAccountFacade(int accountNumber, int securityCode) {

        this.accountNumber = accountNumber;
        this.securityCode = securityCode;


        welcome = new WelcomBank();
        checkNumber = new AccountNumberCheck();
        checkCode = new SecurityCodeCheck();
        fundOperation = new FundOperation();

    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void initialDepo(double initialDepo) {

        if (checkNumber.accountNumerChecker(accountNumber) && checkCode.securityCodeChecker(securityCode)) {
            setAccountBalance(initialDepo);
            System.out.println("initial balance is " + accountBalance);
        } else {
            System.out.println("account is invalid, check security code");
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void checkBalance() {
        System.out.println("Current balance is " + accountBalance);
    }


    public void withdrawCash( double cashWithdraw) {
        accountBalance = fundOperation.decreaseAccout(getAccountBalance(), cashWithdraw);
        changeAccountBalance(accountBalance);
    }


    public void depositCash ( double cashDepo) {
        accountBalance = fundOperation.increaseAccout(getAccountBalance(), cashDepo);
        changeAccountBalance(accountBalance);
    }

    public void changeAccountBalance(double newAccountBalance) {
        setAccountBalance(newAccountBalance);
    }


}
