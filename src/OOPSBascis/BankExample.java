package OOPSBascis;


// Encapsulation
class BankAccount {
    private double balance;
    private   String accountType;
//    constructor with same name but with different parameters
    public BankAccount (double _balance) {
        this.balance = _balance;
        this.accountType = "Savings";
    }

//    we can use this keyword also

    public BankAccount (double _balance , String _accountType) {
        balance = _balance;
        accountType = _accountType;
    }

//    getters and setters
    public void setBalance (double _balance) {
      balance =  _balance;
    }

    public double getBalance () {
        return balance;
    }

    public void printBalance () {
        System.out.println(balance);
    }
}

public class BankExample {
    public static  void main (String[] args) {
        BankAccount b1 = new BankAccount(200);
        BankAccount b2 = new BankAccount(300);
        b1.printBalance();

        b1.setBalance(500);
        System.out.println(b1.getBalance());


//        b2.balance = 0.0;
//        System.out.println(b2.balance + " " + b2.accountType);

    }
}
