package dev.edcan;

import dev.edcan.factories.Logistics;
import dev.edcan.factories.RoadLogistics;
import dev.edcan.factories.SeaLogistics;
import dev.edcan.transports.Transport;

import java.util.Objects;
import java.util.Scanner;

public class Application {

    private final Scanner scanner;

    public Application() {
        scanner = new Scanner(System.in);
    }

    public void init() {
        System.out.println("FACTORY");
        System.out.println("Select Logistics type:");
        System.out.println("> 1. Road");
        System.out.println("> 2. Sea");
        System.out.print("> ");

        int option = scanner.nextInt();

        Transport transport;
        Logistics logistics;

        switch (option) {
            case 1 -> logistics = new RoadLogistics();
            case 2 -> logistics = new SeaLogistics();
            default -> logistics = null;
        }

        if(Objects.nonNull(logistics)) {
            transport = logistics.createTransport();
            transport.deliver();
        } else {
            System.out.println("NOT VALID LOGISTIC OPTION SELECTED");
        }

    }
}
