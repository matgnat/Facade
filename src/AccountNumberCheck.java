/**
 * Created by magn on 8/18/2017.
 */
public class AccountNumberCheck {

    private int accountNumber = 1234567;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountNumerChecker(int checkedAccountNumber) {

        if (checkedAccountNumber == getAccountNumber()) {

            return true;
        } else {

            return false;
        }
    }
}
