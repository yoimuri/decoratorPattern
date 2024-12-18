package decoratorPattern;

abstract class AccountDecorator implements BankAccountDecorator {
    protected SavingsAccount account;

    public AccountDecorator(SavingsAccount account) {
        this.account = account;
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }

    @Override
    public String showAccountType() {
        return account.showAccountType();
    }

    @Override
    public double getInterestRate() {
        return account.getInterestRate();
    }

    @Override
    public String showBenefits() {
        return account.showBenefits();
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.computeBalanceWithInterest();
    }
}