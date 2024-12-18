package decoratorPattern;

public class SavingsAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String showInfo() {
        return "Account Number: " + accountNumber + ", Account Name: " + accountName + ", Balance: " + balance;
    }

    public String showAccountType() {
        return "Savings Account";
    }

    public double getInterestRate() {
        return 0.01; // 1% interest
    }

    public String showBenefits() {
        return "Standard Savings Account";
    }

    public double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }
}