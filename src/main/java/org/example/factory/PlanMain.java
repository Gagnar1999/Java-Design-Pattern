package org.example.factory;

public class PlanMain {
    public static void main(String[] args){
        PlanFactory planFactory = new PlanFactory();

        Plan p = planFactory.getPlan("");
        p.getRate();
        p.calculateBill(100);
    }
}
