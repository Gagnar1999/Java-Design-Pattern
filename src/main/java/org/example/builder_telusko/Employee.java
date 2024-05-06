package org.example.builder_telusko;

public class Employee {
    private String id;
    private String name;
    private boolean isIntern;
    private boolean isMonthlyWager;
    private boolean isWeeklyWager;

    private Employee(Builder builder){
        id = builder.id;
        name = builder.name;
        isIntern = builder.isIntern;
        isMonthlyWager = builder.isMonthlyWager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isIntern=" + isIntern +
                ", isMonthlyWager=" + isMonthlyWager +
                ", isWeeklyWager=" + isWeeklyWager +
                '}';
    }

    static class Builder {
        private String id;
        private String name;
        private boolean isIntern;
        private boolean isMonthlyWager;
        private boolean isWeeklyWager;

        Builder(String id, String name){
            this.id = id;
            this.name = name;
        }

        public Builder setIsIntern(boolean isIntern) {
            this.isIntern = isIntern;
            return  this;
        }

        public Builder setMonthlyWager(boolean monthlyWager) {
            isMonthlyWager = monthlyWager;
            return this;
        }

        public Builder setWeeklyWager(boolean weeklyWager) {
            isWeeklyWager = weeklyWager;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
