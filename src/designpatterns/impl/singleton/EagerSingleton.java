package designpatterns.impl.singleton;

/*
* Is it thread-safe?
Yes.
Why?
Java guarantees that class initialization happens exactly once, and the JVM synchronizes this process internally.
If two threads reach:
Singleton.getInstance();

at the same time and the class hasn't been initialized yet: one thread performs the class initialization,
 the other waits,
after initialization, both receive the same instance.
This guarantee comes from the JVM's class initialization mechanism, so you don't need explicit synchronization here.
*
*
*
* Eager Singleton solves the "single instance" problem, but introduces a new question:
What if creating the object is expensive and it may never be used? (e.g a db connection)
* */

public class EagerSingleton {

    // Instance is created immediately when the class is loaded
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Prevent object creation from outside
    private EagerSingleton() {


    }
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
