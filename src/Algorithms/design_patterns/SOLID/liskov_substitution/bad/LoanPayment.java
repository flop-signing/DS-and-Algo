package Algorithms.design_patterns.SOLID.liskov_substitution.bad;

public interface LoanPayment {
    public void doPayment(int amount);
    public void foreCloseLoan();
    public void doRepayment(int amount);
}
