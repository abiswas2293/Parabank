package pageClass;

public class evenNumber {
    public void evenNumberDetector(int a){
        if(a%2==0){
            System.out.println(a+" is an even number");
        }
        else
            System.out.println(a+" is an odd number");


    }

    public static void main(String args[]){
        evenNumber e=new evenNumber();
        e.evenNumberDetector(345678);
    }
}
