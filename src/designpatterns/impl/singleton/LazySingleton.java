package designpatterns.impl.singleton;

/*
* What problem does it solve?
Lazy Singleton creates the object only when it is first requested.
*
        Application Starts
                │
                ▼
        Singleton class loaded
                │
                ▼
        instance = null
                │
                ▼
        Nobody calls getInstance()
                │
                ▼
        No object created


*
* Advantages

Saves memory if the object is never used.
Faster application startup when object creation is expensive.
*
* Why did Lazy Singleton come?	To avoid creating the object before it is actually needed.
What problem does it solve?	Saves memory and delays expensive initialization until first use.
Is it thread-safe?	❌ No.
Main drawback	Multiple threads can create multiple instances simultaneously.
* */

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
