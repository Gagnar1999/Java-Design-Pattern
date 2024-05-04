package org.example.abstractfactory;

abstract class Loan {
    protected double interestRate = 5;

    abstract void setInterestRate(int rate);
}
