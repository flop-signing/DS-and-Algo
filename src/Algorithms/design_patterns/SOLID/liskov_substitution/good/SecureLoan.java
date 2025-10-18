package Algorithms.design_patterns.SOLID.liskov_substitution.good;

public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}