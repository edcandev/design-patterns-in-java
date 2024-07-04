package dev.edcan;

public class Application {


    public void init() {

        // We create a rectangle object by using its constructor
        Rectangle rectangle = new Rectangle();

        rectangle.height = 100;
        rectangle.width = 100;
        rectangle.x = 100;
        rectangle.y = 100;
        rectangle.color = "red";

        // We create another object by using cloning the first one.
        Rectangle clonedRectangle = (Rectangle) rectangle.clone();

        // We update the value of the field color in the first object.
        rectangle.color = "blue";

        // In the output, we have different color values because we are not passing the reference value directly.
        System.out.println(rectangle);
        System.out.println(clonedRectangle);

    }




}
