package bt04;

public class Main {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("A001","N.V.A","0123456789");
        BankAccount accountB = new BankAccount("A002","N.V.B","0198765432");

        accountA.deposit(1000);
        double tranferAmount = 300;
        accountA.withdraw(tranferAmount);
        accountB.deposit(tranferAmount);

        accountA.displayBalance();
        accountB.displayBalance();
    }
}
