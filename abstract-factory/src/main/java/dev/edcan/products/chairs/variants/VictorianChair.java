package dev.edcan.products.chairs.variants;

import dev.edcan.products.chairs.Chair;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian Sit!");
    }
}
