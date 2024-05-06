package org.example.builder;

public class Samsung extends Company{
    @Override
    public String pack() {
        return "Samsung";
    }

    @Override
    public int price() {
        return 200;
    }
}
