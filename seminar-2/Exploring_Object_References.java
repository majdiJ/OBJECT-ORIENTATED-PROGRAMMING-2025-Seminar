class Counter {
    private int count = 0;

    public void increment() {
        this.count =+ 1;
    }

    public int getCount() {
        return this.count;
    }

    public void reset() {
        this.count = 0;
    }
}

public class Exploring_Object_References {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = counter1;  // Both point to same object
        counter1.increment();
        System.out.println(counter2.getCount()); // Should print 1
    }
}
