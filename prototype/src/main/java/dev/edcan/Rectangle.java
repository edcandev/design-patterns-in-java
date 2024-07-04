package dev.edcan;

public class Rectangle extends Shape {

    Integer width;
    Integer height;

    public Rectangle() {

    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
