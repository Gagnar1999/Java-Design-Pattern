package org.example.abstractfactory;


interface AbstractFactory {
    public Loan getLoan(String loan);

    public Bank getBank(String bank);
}
