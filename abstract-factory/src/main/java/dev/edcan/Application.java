package dev.edcan;

import dev.edcan.factories.FurnitureFactory;
import dev.edcan.factories.impl.ModernFurnitureFactory;
import dev.edcan.factories.impl.VictorianFurnitureFactory;
import dev.edcan.products.chairs.Chair;

import java.util.Objects;
import java.util.Scanner;

public class Application {

    private final Scanner scanner;

    private Chair chair;
    private FurnitureFactory furnitureFactory;

    public Application() {

        scanner = new Scanner(System.in);

    }

    void init() {

        System.out.println("[SELECT FURNITURE FAMILY]");
        System.out.println("> 1. Modern");
        System.out.println("> 2. Victorian");
        System.out.print("> ");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> furnitureFactory = new ModernFurnitureFactory();
            case 2 -> furnitureFactory = new VictorianFurnitureFactory();
            default -> furnitureFactory = null;
        }

        if(Objects.nonNull(furnitureFactory)) {

            chair = furnitureFactory.createChair();
            chair.sitOn();

        } else {
            System.out.println("[NOT FOUND FACTORY]");
        }
    }
}