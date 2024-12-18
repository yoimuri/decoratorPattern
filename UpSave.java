package decoratorPattern;

class UpSave extends AccountDecorator {
    public UpSave(SavingsAccount account) {
        super(account);
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04; // 4% interest
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + " + With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() + (account.getBalance() * getInterestRate());
    }
}

