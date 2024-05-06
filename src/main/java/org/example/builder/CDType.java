package org.example.builder;

import java.util.ArrayList;
import java.util.List;

class CDType {
    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing pack) {
        items.add(pack);
    }

    public void getCosts() {
        for (Packing pack : items) {
            pack.price();
        }
    }

    public void showItems() {
        for (Packing packing : items) {
            System.out.println("CD Name===> " + packing.pack());
            System.out.println("CD Price===> " + packing.price());
        }
    }

}
