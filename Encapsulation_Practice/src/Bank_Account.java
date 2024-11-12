public class Bank_Account {
    private double balance;
    private final int accountNumber;

    public Bank_Account(int accountNumber, double initialBalance){
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    public void deposit (double amount){
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Deposit amount needs to be a positive number");
    }

    public void withdraw (double amount){
        if (amount > 0 && balance - amount >= 0)
            balance -= amount;
        else if (amount <= 0)
            System.out.println("Amount withdrawn needs to be a positive number");
        else
            System.out.println("Insufficient funds lol get your money up");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        if (balance < 0)
            System.out.println("balance cannot be a negative number.");
        else
            this.balance = balance;
    }

    public void printAccountInfo(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
