package org.example.builder;

public class Sony extends Company{
    @Override
    public String pack() {
        return "SONY CD";
    }

    @Override
    public int price() {
        return 100;
    }
}
