package methodClass;

public class ReturnType {
    public static void main(String[] args) {
      int c=addTwoNumber(23,30);
      int e=mulyiplyTwoNumber(12,2);
        System.out.println(e);

    }
    public static int addTwoNumber(int a, int b){
        int c=a+b;
        return c;

    }
    public static int mulyiplyTwoNumber(int a, int b){
        int e=a*b;
        return e;
    }
}
