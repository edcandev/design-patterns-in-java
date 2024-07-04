package dev.edcan;

public class Application {

    public Application() {
    }

    public void init() {

        Singleton singleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        // As we can see, the hashcode is the same for both objects.
        System.out.println(singleton.hashCode());
        System.out.println(secondSingleton.hashCode());

    }
}
