package org.example.abstractfactory;

class LoanFactory implements AbstractFactory {

    @Override
    public Loan getLoan(String loan) {
        if(loan == null){
            throw new IllegalArgumentException("Null is Supplied Not Allowed");
        }
        else if(loan.equals("Home")){
            return new HomeLoan();
        }
        else if(loan.equals("Personal")){
            return new PersonalLoan();
        }
        return null;
    }

    @Override
    public Bank getBank(String bank) {
        return null;
    }

}
