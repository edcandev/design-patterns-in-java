package dev.edcan.factories.impl;

import dev.edcan.factories.FurnitureFactory;
import dev.edcan.products.chairs.Chair;
import dev.edcan.products.chairs.variants.VictorianChair;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
