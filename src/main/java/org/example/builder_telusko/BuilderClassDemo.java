package org.example.builder_telusko;

public class BuilderClassDemo {
    public static void main(String[] args) {
        Employee employee = new Employee.Builder("1", "Gagan")
                .setIsIntern(false)
                .setMonthlyWager(true)
                .build();

        System.out.println(employee.toString());
    }
}
