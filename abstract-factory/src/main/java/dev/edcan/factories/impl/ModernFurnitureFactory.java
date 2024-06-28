package dev.edcan.factories.impl;

import dev.edcan.factories.FurnitureFactory;
import dev.edcan.products.chairs.Chair;
import dev.edcan.products.chairs.variants.ModernChair;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
