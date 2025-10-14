class Counter {
    private int count = 0;

    public void increment() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public void reset() {
        this.count = 0;
    }
}

class LifecycleDemo {
    private static int totalCreated = 0;
    private final int instanceID;

    public LifecycleDemo() {
        totalCreated += 1;
        this.instanceID = totalCreated;
        System.out.println("Created: " + this);
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize() called for: " + this);
        } finally {
            super.finalize();
        }
    }

    @Override
    public String toString() {
        return "LifecycleDemo{id=" + instanceID + ", totalCreated=" + totalCreated + "}";
    }

    public static void createMany(int n) {
        for (int i = 0; i < n; i++) {
            new LifecycleDemo();
        }
    }
}

public class Exploring_Object_References {
    public static void main(String[] args) throws InterruptedException {
        // Exercise 2.1
        Counter counter1 = new Counter();
        Counter counter2 = counter1;  // Both reference same object
        counter1.increment();
        System.out.println("counter2.getCount() => " + counter2.getCount()); // should print 1

        System.out.println("\n--- Exercise 2.2: Creating many LifecycleDemo objects ---");
        LifecycleDemo.createMany(10);

        System.out.println("Requesting GC with System.gc()");
        System.gc(); // only a suggestion to the JVM

        // Give the JVM a small time slice to run finalizers
        Thread.sleep(2000);

    }
}
