package designpatterns.impl.singleton;

public class BillPughSingleton {
    /*
Why did Bill Pugh Singleton come?

Eager Singleton
private static final Singleton INSTANCE = new Singleton();
Thread-safe
Not lazy

The Secret: Inner Classes Are Loaded Lazily
Because loading the outer class does not automatically load the static inner class.
The JVM only loads the inner class when it is first actively used.

What problem does it solve?
Bill Pugh Singleton gives us:

Lazy Initialization
Thread Safety
No synchronization
No volatile
Excellent performance


Flow:
            Application Starts

            ↓

            Singleton loaded

            ↓

            SingletonHolder NOT loaded

            ↓

            No object exists

            ↓

            getInstance()

            ↓

            SingletonHolder loads

            ↓

            INSTANCE created

            ↓

            Return object


It achieves all of this by relying on JVM class loading.

This is the most important interview question.
The answer has nothing to do with the code.
It comes from the JVM Specification.

Java guarantees:
A class is initialized exactly once, and class initialization is synchronized by the JVM.

Disadvantages

There are two important limitations.
Reflection
A private constructor can still be invoked using Java Reflection (unless you add extra protection).

Example:

Constructor<Singleton> constructor =
        Singleton.class.getDeclaredConstructor();

constructor.setAccessible(true);

Singleton s1 = constructor.newInstance();
Singleton s2 = constructor.newInstance();

Now you've created two instances, breaking the Singleton.

Serialization
If your Singleton implements Serializable, deserializing it can create a new object unless you implement readResolve().
We'll discuss this in detail shortly.

    * */
    private BillPughSingleton() {
    }

    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

