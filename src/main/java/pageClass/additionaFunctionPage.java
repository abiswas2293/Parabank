package pageClass;

public class additionaFunctionPage {
    public int addition(int a, int b) {
        return a + b;


    }

    public static void main(String[] args) {
        additionaFunctionPage ap = new additionaFunctionPage();
        System.out.println("The addition of two numbers is "+ap.addition(2,3));
    }
}
