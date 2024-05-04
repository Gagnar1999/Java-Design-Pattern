package org.example.abstractfactory;

class GetFactory {
    public AbstractFactory getFactory(String type) {
        if (type == null) throw new IllegalArgumentException("Arguments are not correct");
        else if (type.equals("Loan")) {
            return new LoanFactory();
        } else if (type.equals("Bank")) {
            return new BankFactory();
        }
    }
}
