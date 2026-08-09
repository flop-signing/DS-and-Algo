package designpatterns.impl.singleton;

/*
*
* Developers realized:

"Synchronization is only needed while creating the object, not after it already exists."

That idea gave birth to Double-Checked Locking.
*
*What problem does DCL solve?

It solves the performance problem of the synchronized method.

Only the first initialization requires locking.

After the object exists, no synchronization is needed.
*
* volatile provides two key guarantees here:

Visibility: When one thread writes the initialized instance, other threads will see that updated value.
Ordering: It prevents the problematic reordering where the reference becomes visible before the constructor's initialization is complete.

This makes Double-Checked Locking safe in Java 5 and later.

Advantages
Lazy initialization.
Thread-safe.
Synchronization happens only during first initialization.
Excellent performance after the object is created.
*
Disadvantages
More complex than previous implementations.
Easy to implement incorrectly (for example, forgetting volatile).
Harder to explain and maintain than simpler alternatives.
Summary
*
Question	Answer
Why did DCL come?	To avoid synchronizing every call while keeping lazy initialization thread-safe.
Why first if?	Avoids locking after the instance already exists.
Why second if?	Prevents a second thread from creating another instance after waiting for the lock.
Why volatile?	Prevents unsafe publication due to instruction reordering and guarantees visibility.
Is it thread-safe Yes (when volatile is used).
Is it lazy?	 Yes.
A Small Correction to Keep in Mind

When explaining instruction reordering, you'll often see the three steps written as:

Allocate memory.
Initialize the object (run the constructor and initialize fields).
Assign the reference to instance.

These are conceptual steps, not literal JVM bytecode instructions. The important takeaway is that without volatile, another thread might observe the reference before initialization is fully complete.
*
*
* */


public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking instance;

    private DoubleCheckedLocking() {

    }

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
