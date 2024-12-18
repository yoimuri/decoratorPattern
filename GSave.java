package decoratorPattern;

class GSave extends AccountDecorator {
    public GSave(SavingsAccount account) {
        super(account);
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025; // 2.5% interest
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + " + GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() + (account.getBalance() * getInterestRate());
    }
}