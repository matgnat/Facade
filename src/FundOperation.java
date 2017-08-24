/**
 * Created by magn on 8/18/2017.
 */
public class FundOperation {

    
    public double decreaseAccout(double accoutBalance, double cashWithdraw) {
        if (accoutBalance > cashWithdraw) {
            accoutBalance -= cashWithdraw;
            return accoutBalance;
        } else {
            System.out.println("Not enought balance, but we will pay you " + accoutBalance);
            return 0;
        }

    }

    public double increaseAccout(double accountBalance, double cashDeposit) {
        accountBalance += cashDeposit;
        return accountBalance;
    }

    public boolean fundsChecker(double funds, double fundToWithDraw) {

        if(funds > fundToWithDraw) {

            return true;

        } else {

            System.out.println("Not enought money");
            System.out.println("Current balance " + funds);
            return false;
        }
    }


}


