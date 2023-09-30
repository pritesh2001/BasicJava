package oops2;

public class MethodOverloading {
    // Method overloading is having same name (addTwonumbers) but different parameters(int a,int b)

    public static void main(String[] args) {
       MethodOverloading methodOverloading=new MethodOverloading();
       methodOverloading.addTwonumbers();
        methodOverloading.addTwonumbers(10,20);
        methodOverloading.addTwonumbers(23,43,25);
        methodOverloading.addTwonumbers(12,2);
    }
    public void addTwonumbers(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
public void addTwonumbers(int a,int b){
    System.out.println(a+b);
}
public void addTwonumbers(int a,int b, int c){
    System.out.println(a+b+c);
}
}