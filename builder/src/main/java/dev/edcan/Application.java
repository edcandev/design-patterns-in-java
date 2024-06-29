package dev.edcan;

import dev.edcan.builder.impl.ModernHouseBuilder;
import dev.edcan.builder.impl.WesternHouseBuilder;
import dev.edcan.director.Director;
import dev.edcan.house.ModernHouse;
import dev.edcan.house.WesternHouse;

import java.util.Scanner;

public class Application {

    private final Scanner scanner;

    public Application() {
        scanner = new Scanner(System.in);
    }

    void init() {

        System.out.println("[ BUILDER ]");
        System.out.println("> 1. Modern House");
        System.out.println("> 2. Western House");
        System.out.print("> ");
        int option = scanner.nextInt();

        Director director = new Director();
        WesternHouseBuilder westernHouseBuilder = new WesternHouseBuilder();
        ModernHouseBuilder modernHouseBuilder = new ModernHouseBuilder();

        switch (option) {
            case 1 -> {
                director.constructModernHouse(modernHouseBuilder);
                ModernHouse modernHouse = modernHouseBuilder.getResult();
                System.out.println(modernHouse);
            }
            case 2 -> {
                director.constructWesternHouse(westernHouseBuilder);
                WesternHouse westernHouse = westernHouseBuilder.getResult();
                System.out.println(westernHouse);
            }
        }

    }

}