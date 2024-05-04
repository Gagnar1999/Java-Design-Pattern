package org.example.abstractfactory;

class PersonalLoan extends Loan {

    @Override
    void setInterestRate(int rate) {
        interestRate = rate;
        System.out.println(super.interestRate);
        System.out.println(this.interestRate);
    }

}
