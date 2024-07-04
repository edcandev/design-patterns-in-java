package dev.edcan;

public abstract class Shape {

    Integer x;
    Integer y;
    String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();

}
