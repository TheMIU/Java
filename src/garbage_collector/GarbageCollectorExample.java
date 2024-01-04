package garbage_collector;

class GarbageCollectorExample {
    public static void main(String[] args) {
        // Creating objects
        GarbageCollectorExample obj1 = new GarbageCollectorExample();
        GarbageCollectorExample obj2 = new GarbageCollectorExample();

        // Making obj1 eligible for garbage collection
        obj1 = null;

        // Requesting JVM to run garbage collector
        System.gc();

        System.out.println("Garbage collector has run...");
    }

    // Overriding finalize method to see the garbage collector in action
    @Override
    protected void finalize() {
        System.out.println("Object is garbage collected");
        // Cleanup operations
    }
}

/*
 invoking System.gc() doesn't guarantee immediate garbage collection; it's a
 request to the JVM, and the decision to run the garbage collector is up to
 the JVM.
 */

/*
 The finalize() method in Java is a method provided by the Object class. It's
 called by the garbage collector before an object is reclaimed (destroyed) by
 the garbage collector to perform any necessary cleanup operations.
 */