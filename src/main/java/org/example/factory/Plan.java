package org.example.factory;

/*
    Date - 04-04-2024
    Name - Plan
    type - abstract class
    definition - contains abstract and non abstract methods
 */
abstract class Plan {
    protected int rate = 10;

    abstract public void getRate();


    public void calculateBill(int units){
        System.out.println("Your Bill is --->" + (rate * units));
    }


}






