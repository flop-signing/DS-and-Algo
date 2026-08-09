package designpatterns.impl.singleton;

/*
Why did Enum Singleton come?
Let's look at what problems we had with the previous implementations.
With Bill Pugh:
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

This is already very good.
But there are still two major concerns:

Reflection
Someone can use reflection to access the private constructor and create another object.

Serialization
If the Singleton is serialized and then deserialized, Java can create another instance unless we explicitly handle it with readResolve().

So the question became:
Can Java itself provide a mechanism that guarantees a single instance and protects it from these problems?
Java's enum gives us exactly that.


What problem does Enum Singleton solve?

It provides a Singleton with strong guarantees against:

multiple instantiation through normal construction,
reflection-based construction,
serialization/deserialization creating another instance.

And the implementation is extremely simple.
* */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Doing something...");
    }
}

/*
Why did Enum Singleton come?
Let's look at what problems we had with the previous implementations.
With Bill Pugh:

public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

This is already very good.
But there are still two major concerns:

Reflection
Someone can use reflection to access the private constructor and create another object.

Serialization
If the Singleton is serialized and then deserialized, Java can create another instance unless we explicitly handle it with readResolve().

So the question became:
Can Java itself provide a mechanism that guarantees a single instance and protects it from these problems?
Java's enum gives us exactly that




What problem does Enum Singleton solve?

It provides a Singleton with strong guarantees against:

multiple instantiation through normal construction,
reflection-based construction,
serialization/deserialization creating another instance.

And the implementation is extremely simple.


How does INSTANCE work?

When you write:
public enum Singleton {

    INSTANCE;
}

INSTANCE is an enum constant.
You can think of it conceptually as:

Singleton
   |
   └── INSTANCE
          |
          ▼
      Singleton object

Java guarantees that each enum constant exists only once within its enum type.
Therefore:

Singleton a = Singleton.INSTANCE;
Singleton b = Singleton.INSTANCE;

Both references point to the same object:
System.out.println(a == b);
Output: true


What about the constructor?
This is interesting.
You don't write:

private Singleton() {
}

The enum mechanism handles construction for you.
You cannot do:
Singleton s = new Singleton(); // ❌

Java doesn't allow you to instantiate an enum using new.
The enum constants are created by the Java runtime as part of enum initialization.


What about Reflection?
This is one of the biggest advantages.
For our normal Singleton:

private Singleton() {
}

reflection can potentially do:

constructor.setAccessible(true);
constructor.newInstance();

and attempt to create another instance.
But enum constructors are treated specially by Java.
Trying to create an enum instance reflectively results in an exception.
So the usual reflection attack doesn't work against an enum Singleton.


What about Serialization?
This is another major advantage.

Suppose:

public enum Singleton {
    INSTANCE;
}

You serialize:
Singleton.INSTANCE
and later deserialize it.
Java's enum serialization mechanism doesn't create a brand-new enum object.
Instead, it resolves the enum constant back to:
Singleton.INSTANCE
So:

Singleton a = Singleton.INSTANCE;

// deserialize...

Singleton b = ...;

System.out.println(a == b);
remains:
true
That's why enum Singleton is much safer than a traditional Serializable Singleton.

Does it need volatile?
No.

public enum Singleton {
    INSTANCE;
}

There is no manually managed shared reference like:
private static volatile Singleton instance;
The JVM's enum initialization and class initialization mechanisms provide the necessary initialization guarantees.


Does it need synchronized
No.
You don't need:
synchronized
The enum initialization mechanism handles safe initialization.



Is it lazy?

This needs an important distinction.
An enum Singleton is not lazy in exactly the same way as the Bill Pugh Singleton.
With Bill Pugh:
SingletonHolder.INSTANCE
is created when SingletonHolder is initialized, which happens when that holder is first actively used.
With an enum:

public enum Singleton {
    INSTANCE;
}

the enum class is initialized when the enum is initialized/actively used according to Java's class initialization rules.
So the correct statement is:
Enum Singleton provides lazy class initialization according to JVM initialization rules, but it does not give you the same explicit "create only when getInstance() is called" structure as a lazy holder Singleton.



Eager
  │
  │ Problem: object created too early
  ▼
Lazy
  │
  │ Problem: not thread-safe
  ▼
Synchronized
  │
  │ Problem: synchronization on every call
  ▼
Double-Checked Locking
  │
  │ Problem: complexity + volatile
  ▼
Bill Pugh
  │
  │ Problem: reflection/serialization remain
  ▼
Enum
  │
  ▼
Strong JVM-level guarantees
* */
