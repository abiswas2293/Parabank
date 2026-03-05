package TestClass;

import org.testng.annotations.Test;
import pageClass.loginPage;
import utility.Baseclass;

public class loginPageTest extends Baseclass {
    loginPage lp=new loginPage();

    @Test
    public void successfulLogin() throws InterruptedException {
        lp.login();
        Thread.sleep(3000);

    }
}
