/**
 * Created by magn on 8/18/2017.
 */

public class SecurityCodeCheck {

    private int securityCode = 12345;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean securityCodeChecker(int checkedSecurityCode) {

        if (checkedSecurityCode == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}
