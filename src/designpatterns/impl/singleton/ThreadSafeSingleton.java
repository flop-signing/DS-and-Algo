package designpatterns.impl.singleton;


/*
* What problem does it solve?
It prevents multiple threads from creating multiple Singleton objects.
Only one thread can enter the method at a time.
*

* Is there any problem left?
Suppose the Singleton has already been created.
Now thousands of requests arrive.
Every request still executes
public static synchronized Singleton getInstance()
instance != null
No object creation is needed anymore.

Yet every thread must:
acquire the lock,
enter the method,
release the lock.
*
This locking happens on every call.

*
Advantages
Thread-safe.
Lazy initialization.
Very easy to understand.
Simple to implement.
*
Disadvantages
Every call acquires the class lock.
Poor performance under heavy multithreaded access.
Most calls don't need synchronization after initialization, but they still incur the cost.
*
* */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
