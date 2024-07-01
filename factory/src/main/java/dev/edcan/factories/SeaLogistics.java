package dev.edcan.factories;

import dev.edcan.transports.Ship;
import dev.edcan.transports.Transport;
import dev.edcan.transports.Truck;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
