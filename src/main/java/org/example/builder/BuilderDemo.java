package org.example.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("**************************Start of Program*********************");
        CDBuilder cdBuilder = new CDBuilder();
        CDType cd1= cdBuilder.buildSonyCD();
        cd1.showItems();


        CDType cd2 =  cdBuilder.buildSamsungCD();
        cd2.showItems();


        System.out.println("**************************End of Program*********************");
    }
}
