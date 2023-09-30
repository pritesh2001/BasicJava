package oops2;

public class BankingOverloading {
   static int balance = 1000;


    public static void main(String[] args) {
        // deposit-1000
        //christmas offer-deposit-1000-5% cashback
        BankingOverloading bankingOverloading=new BankingOverloading();
        String season="Normal";
        if(season=="Normal")
        {
            bankingOverloading.deposit(1000);
        } else if (season=="Christmas") {
            bankingOverloading.deposit(1000,5);

        }
    }
    public void deposit(int depositMoney){
      balance=balance + depositMoney;
        System.out.println(balance);
    }
    public void deposit(int depositMoney, int cashbackPercentage){
     int cashbackMoney=(depositMoney * cashbackPercentage)/100;
        System.out.println("You got this much cashback");
        balance=balance + (depositMoney + cashbackMoney);
        System.out.println(balance);
    }
}
