package pageClass;

import utility.CommonFunctionsClass;

public class loginPage extends CommonFunctionsClass {

    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void register() throws InterruptedException {
        String registerButton="//a[text()='Register']";
        String firstname="//input[@name='customer.firstName']";
        String lastName="//input[@name='customer.lastName']";
        String address="//input[@name='customer.address.street']";
        String city="//input[@name='customer.address.city']";
        String state="//input[@name='customer.address.state']";
        String zipcode="//input[@name='customer.address.zipCode']";
        String phone="//input[@name='customer.phoneNumber']";
        String ssn="//input[@name='customer.ssn']";
        String username="//input[@name='customer.username']";
        String password="//input[@name='customer.password']";
        String confirm="//input[@name='repeatedPassword']";
        String register="//input[@value='Register']";

       cf.click(registerButton);
       Thread.sleep(3000);
       cf.typeText(firstname,"AB");
       cf.typeText(lastName,"XY");
       cf.typeText(address,"MNO");
       cf.typeText(city,"xyz");
       cf.typeText(state,"UK");
       cf.typeText(zipcode,"123456");
       cf.typeText(phone,"123456789");
       cf.typeText(ssn,"2345667");
       cf.typeText(username,"AB");
       cf.typeText(password,"demo");
       cf.typeText(confirm,"demo");
       cf.click(register);


    }

    public void login() throws InterruptedException {
        String username="//input[@name='username']";
        String password="//input[@name='password']";
        String login="//input[@value='Log In']";
        cf.typeText(username,"abc123");
        cf.typeText(password,"abc123");

        Thread.sleep(10000);
        cf.click(login);

    }
}
