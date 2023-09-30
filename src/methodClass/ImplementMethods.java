package methodClass;

public class ImplementMethods {
    public static void main(String[] args) {
       ImplementMethods implementMethods=new ImplementMethods();
       implementMethods.multiplicationOfTwoNumber();

       // multiplicationOfTwoNumber(); if we can use static word then we can run direct.
    }

    public  void multiplicationOfTwoNumber(){
        int a=10;
        int b=20;
        int c=a*b;
        System.out.println(c);
    }

}
