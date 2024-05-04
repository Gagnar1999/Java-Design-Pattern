package org.example.abstractfactory;

class BankFactory implements AbstractFactory {
    @Override
    public Loan getLoan(String loan) {
        return null;
    }

    @Override
    public Bank getBank(String bank) throws IllegalArgumentException {
        if(bank == null){
            throw new IllegalArgumentException("Null is not used inside factory");
        }
        else if(bank.equals("HDFC"))
            return new HDFC();
        else if(bank.equals("ICICI"))
            return new ICICI();
        return null;
    }
}
