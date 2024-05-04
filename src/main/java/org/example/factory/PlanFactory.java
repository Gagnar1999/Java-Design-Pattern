package org.example.factory;

class PlanFactory {

    public Plan getPlan(String planType) throws IllegalArgumentException {
        if (planType == null)
            throw new IllegalArgumentException("Null is Not Allowed here");
        else if (planType.equals("individual"))
            return new IndividualPlan();
        else
            return new CommercialPlan();

    }
}
