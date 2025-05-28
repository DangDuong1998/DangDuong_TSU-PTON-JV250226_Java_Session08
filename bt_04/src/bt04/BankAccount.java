package bt04;

public class BankAccount implements IBank{
    private  String accountId;
    private double balance;
    private String userName;
    private String phoneNumber;

    public BankAccount(String accountId, String userName, String phoneNumber){
        this.accountId = accountId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void deposit(double amount) {
        balance = amount;
        System.out.println("Đã nhận tiền: "+amount);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Đã rút tiền: "+amount);
    }

    void displayBalance(){
        System.out.println("Số dư tài khoản ("+accountId+"):"+balance);
    }
}
