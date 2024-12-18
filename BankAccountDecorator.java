package decoratorPattern;

interface BankAccountDecorator {
    String showInfo();
    String showAccountType();
    double getInterestRate();
    String showBenefits();
    double computeBalanceWithInterest();
}